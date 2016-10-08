package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

/**
 * clase encargada de realizar las consultas sql (CRUD)
 * @author david
 *
 */
public class DAOEstudianteJDBC implements IDAOEstudiante{

	/**
	 * crea un Estudiante en la base de datos
	 * 
	 * @param e estudiante que se va a crear
	 *            
	 * @throws Exception si la conexion falla
	 *             
	 */
	public void crear(Estudiante e) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = AdministradorConexionJDBC.getConexion();

		String sql = "INSERT INTO tb_persona (cedula_per,apellido_per,correo_per,direccion_per,nombre_per,telefono_per) "
				+ "VALUES (?,?,?,?,?,?)";
		
		String sql1 = "INSERT INTO tb_estudiante (cedula_per, fechanacimiento_est) " +
		"VALUES (?,?)";

		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		
		pstmt1.setString(1, e.getCedula());
		pstmt1.setDate(2, new Date (e.getFechaNacimiento().getTime()));
		
		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, e.getCedula());
		pstmt.setString(2, e.getApellido());
		pstmt.setString(3, e.getCorreo());
		pstmt.setString(4, e.getDireccion());
		pstmt.setString(5, e.getNombre());
		pstmt.setString(6, e.getTelefono());

		// 2.2 Ejecutar consulta
		pstmt.executeUpdate();
		pstmt1.executeUpdate();
		// 3. Cerrar la conexión
		con.close();
		
	}

	/**
	 * permite editar un estudiante de la base de datos
	 */
	public void editar(Estudiante e) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = AdministradorConexionJDBC.getConexion();

		String sql = "UPDATE tb_persona SET nombre_per = ?,apellido_per = ?,correo_per = ?,direccion_per = ?,telefono_per = ? "
				+ "WHERE cedula_per= ?";

		 String sql1 = "UPDATE tb_estudiante SET fechanacimiento_est = ? "
		 		+ " WHERE cedula_per = ?";
	
		 PreparedStatement pstmt = con.prepareStatement(sql);
		 
			pstmt.setString(6, e.getCedula());
			pstmt.setString(2, e.getApellido());
			pstmt.setString(3, e.getCorreo());
			pstmt.setString(4, e.getDireccion());
			pstmt.setString(1, e.getNombre());
			pstmt.setString(5, e.getTelefono());
			
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		 
		pstmt1.setDate(1, new Date (e.getFechaNacimiento().getTime()));
		pstmt1.setString(2, e.getCedula());
		// 2.2 Ejecutar consulta
		pstmt.executeUpdate();
        pstmt1.executeUpdate();
		// 3. Cerrar la conexión
		con.close();
		
	}

	/**
	 * busca un estudiante en la base de datos
	 */
	public Estudiante buscar(String ced) throws Exception {
		// TODO Auto-generated method stub
		
     Connection con = AdministradorConexionJDBC.getConexion();
		
		String sql = "select per.apellido_per,per.correo_per,per.direccion_per,per.nombre_per,per. "
				+ "telefono_per,est.fechanacimiento_est from tb_persona per " +
				"join tb_estudiante est on (per.cedula_per = est.cedula_per) where est.cedula_per = ?";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, ced);
		
		//ejecutar consulta
		ResultSet res = pstmt.executeQuery();
		
		//Hubo un registro..
		
		if (res.next()){
			
			String apellido = res.getString(1);
			String correo = res.getString(2);
			String direccion = res.getString(3);
			String nombre = res.getString(4);
			String telefono = res.getString(5);
			Date fechaa = res.getDate(6);
		
			Estudiante est = new Estudiante(ced, apellido, correo, direccion, nombre, telefono, fechaa);
		    con.close();
			return est;
	}else{
	    con.close();
		return null;
	}
	}

	/**
	 * elimina un estudiante de la base de datos
	 */
	public void eliminar(Estudiante e) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = AdministradorConexionJDBC.getConexion();
		
		String sql = "DELETE FROM tb_persona WHERE cedula_per = ?";
		String sql1= "DELETE FROM tb_estudiante WHERE cedula_per = ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		
		pstmt.setString(1, e.getCedula());
		pstmt1.setString(1, e.getCedula());
		
		// 2.2 Ejecutar consulta
		pstmt1.executeUpdate();
		pstmt.executeUpdate();
        
        // cerrar la conexion
		con.close();
		
	}

	public List<Estudiante> listarEstudiante(Curso c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Nota> listarNotasEst(Estudiante e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
