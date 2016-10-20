package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.utilidades.AdministradorConexionJDBC;

public class DAOClienteJDBC implements IDAOCliente {

	public void crear(Cliente cliente) throws Exception {

		Connection con = AdministradorConexionJDBC.getConexion();
		String sql = "INSERT INTO T_CLIENTES (CEDULA,TELEFONO,DIRECCION,NOMBRE) " + " VALUES(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, cliente.getCedula());
		pstmt.setString(2, cliente.getTelefono());
		pstmt.setString(3, cliente.getDireccion());
		pstmt.setString(4, cliente.getNombre());

		// 2.2 ejecutar consulta..
		pstmt.executeUpdate();

		// 3. cerrar la conexion.
		con.close();

	}

	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	public void eliminar(String cedula) {
		// TODO Auto-generated method stub

	}

	public Cliente buscar(String cedula) throws Exception {

		Connection con = AdministradorConexionJDBC.getConexion();

		String sql = "SELECT TELEFONO,NOMBRE,DIRECCION,CEDULA FROM T_CLIENTES " + " WHERE CEDULA=?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, cedula);
		// ejecutar consulta
		ResultSet res = pstmt.executeQuery();
		Cliente cust = null;
		// hubo un registro....
		if (res.next()) {
			String nombre = res.getString(2);
			String dir = res.getString(3);
			String telefono = res.getString(1);

			cust = new Cliente(nombre, cedula, telefono, dir);

		}
		con.close();
		return cust;

	}

	public List<Cliente> listarTodos() throws Exception{
		
		Connection con=AdministradorConexionJDBC.getConexion();
		
		List<Cliente> lista=new ArrayList<Cliente>();
		
		String sql="SELECT TELEFONO,NOMBRE,DIRECCION,CEDULA FROM T_CLIENTES";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet res=pstmt.executeQuery();
		
		while (res.next()) {
			String nombre = res.getString(2);
			String dir = res.getString(3);
			String telefono = res.getString(1);
			String cedula=res.getString(4);

			Cliente cust = new Cliente(nombre, cedula, telefono, dir);
			lista.add(cust);
		}
		con.close();
		return lista;
		
	}

}
