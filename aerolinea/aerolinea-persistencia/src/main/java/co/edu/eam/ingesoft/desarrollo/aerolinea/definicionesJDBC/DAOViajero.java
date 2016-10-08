package co.edu.eam.ingesoft.desarrollo.aerolinea.definicionesJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edu.eam.ingesoft.desarrollo.aerolinea.definiciones.IDAOViajero;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.modelo.Viajero;
import co.edu.eam.ingesoft.desarrollo.aerolinea.persistencia.utilidades.AdministradorConexionJDBC;

public class DAOViajero implements IDAOViajero {

	public void crear(Viajero viaj) throws Exception {
		
		Connection con = AdministradorConexionJDBC.getConexion();
				
		String sql = "INSERT INTO viajero (CEDULA,APELLIDO,NOMBRE) " +
				"VALUES (?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, viaj.getCedula());
		pstmt.setString(2, viaj.getApelido());
		pstmt.setString(3, viaj.getNombre());
		
		pstmt.executeUpdate();
		
		con.close();

	}

	public Viajero buscar(String ced) throws Exception {
	
		Connection con = AdministradorConexionJDBC.getConexion();
		String sql = "SELECT CEDULA,NOMBRE,APELLIDO FROM viajero WHERE CEDULA = ? ";		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, ced);
		ResultSet res = pstmt.executeQuery();
		
		if(res.next()){
			
			String cedula = res.getString(1);
			String nombre = res.getString(2);
			String apellido = res.getString(3);
			Viajero viajero = new Viajero(cedula, apellido, nombre);
			con.close();
			return viajero;
		}else{
			con.close();
			return null;
		}

	}

	public void eliminar(Viajero e) throws Exception {
		
		Connection con = AdministradorConexionJDBC.getConexion();
		String sql = "DELETE FROM viajero WHERE CEDULA =?";		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, e.getCedula());
		pstmt.executeUpdate();
		con.close();

		
	}

	
	
}
