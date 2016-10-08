package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOProfesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Persona;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorConexionJDBC;

/**
 * clase encargada de realizar las consultas sql (CRUD)
 * @author david
 *
 */
public class DAOProfesorJDBC implements IDAOProfesor {

	public ArrayList<Profesion> profesiones = new ArrayList<Profesion>();

	/**
	 * crea un profesor en la base de datos
	 * 
	 * @param p profesor que se va a crear
	 *            
	 * @throws Exception si la conexion falla
	 *             
	 */
	public void crear(Profesor p) throws Exception {

		Connection con = AdministradorConexionJDBC.getConexion();

		String sqlPers = "INSERT INTO tb_persona (cedula_per,apellido_per,correo_per,direccion_per,nombre_per,telefono_per) "
				+ "VALUES (?,?,?,?,?,?)";

		String sql = "INSERT INTO tb_docente (cedula_per,postgrado_doc,profesion_doc) VALUES (?,?,?)";

		PreparedStatement pstmt2 = con.prepareStatement(sqlPers);
		PreparedStatement pstmt = con.prepareStatement(sql);

		// Enviar los datos a la tabla Persona

		pstmt2.setString(1, p.getCedula());
		pstmt2.setString(2, p.getApellido());
		pstmt2.setString(3, p.getCorreo());
		pstmt2.setString(4, p.getDireccion());
		pstmt2.setString(5, p.getNombre());
		pstmt2.setString(6, p.getTelefono());

		pstmt.setString(1, p.getCedula());
		pstmt.setBoolean(2, p.isPostgrado());
		pstmt.setString(3, p.getProfesion().getCodigo());

		pstmt2.executeUpdate();
		pstmt.executeUpdate();

		con.close();

	}

	/**
	 * modifaca los datos de un docente
	 * 
	 * @param p profesor al cual se le modificaran los datos
	 * @throws SQLException 
	 */
	public void editar(Profesor p) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = AdministradorConexionJDBC.getConexion();
		
		String sql = "UPDATE tb_persona SET nombre_per = ?,apellido_per = ?,correo_per = ?,direccion_per = ?,telefono_per = ? "
				+ "WHERE cedula_per= ?";
		
		String sql1= "UPDATE tb_docente SET postgrado_doc = ?, profesion_doc = ? " +
		 "WHERE cedula_per = ?";
			
		
		 PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(6, p.getCedula());
			pstmt.setString(2, p.getApellido());
			pstmt.setString(3, p.getCorreo());
			pstmt.setString(4, p.getDireccion());
			pstmt.setString(1, p.getNombre());
			pstmt.setString(5, p.getTelefono());

	    PreparedStatement pstmt1 = con.prepareStatement(sql1);
	     
	      pstmt1.setString(1, p.getCedula());
	      pstmt1.setBoolean(2, p.isPostgrado());
	      pstmt1.setString(3, p.getProfesion().getCodigo());
	    
	      pstmt1.executeUpdate();
		  pstmt.executeUpdate();

		  con.close();

	}

	/**
	 * Obtiene los datos de un profesor
	 * 
	 * @param ced número de cédula del profesor que se desea buscar
	 *            
	 */
	public Profesor buscar(String ced) throws Exception {

		Connection con = AdministradorConexionJDBC.getConexion();

		String sql = "select per.apellido_per,per.correo_per,per.direccion_per,per.nombre_per,per.telefono_per,doc.postgrado_doc,doc.profesion_doc "+ 
				" from tb_persona per join tb_docente doc on (per.cedula_per = doc.cedula_per) where per.cedula_per = ? ";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, ced);

		ResultSet res = pstmt.executeQuery();


		if (res.next()) {

			String apellido = res.getString(1);
			String correo = res.getString(2);
			String direccion = res.getString(3);
			String nombre = res.getString(4);
			String telefono = res.getString(5);
	     	boolean postgrado = res.getBoolean(6);
	     	String pro = res.getString(7);
	     	
            Profesion profec = buscarProfesionCodigo(pro);
            Profesor prof = new Profesor(ced, apellido, correo, direccion, nombre, telefono, postgrado, profec);
			
		    con.close();
		    return prof;

		} else {
			con.close();
			return null;
		}

	}

	/**
	 * Elimina un objeto de tipo profesor
	 * 
	 * @param p
	 *            Profesor que se va a eliminar
	 * @throws SQLException 
	 */
	public void eliminar(Profesor p) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = AdministradorConexionJDBC.getConexion();
		
		String sql = "DELETE FROM tb_persona WHERE cedula_per = ?";
		
		String sql1 = "DELETE FROM tb_docente WHERE cedula_per = ?";
		
		PreparedStatement prstmt = con.prepareStatement(sql);
		PreparedStatement prstmt1 = con.prepareStatement(sql1);
		
		prstmt.setString(1, p.getCedula());
		prstmt1.setString(1, p.getCedula());
		
		// 2.2 Ejecutar consulta
		prstmt1.executeUpdate();
		prstmt.executeUpdate();
	
		
        // cerrar la conexion
		con.close();
		
	}

	/**
	 * devuelve una lista con los profesores de la base de datos
	 */
	public List<Profesor> listarProfesores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Busca una profesión por su nombre
	 * 
	 * @param nom nombre que se desea buscar
	 *            
	 * @return la profesión si la encuentra, de lo contrario null
	 */
	public Profesion buscarProfesion(String nom) {

		for (int i = 0; i < profesiones.size(); i++) {

			if (profesiones.get(i).getNombre().equalsIgnoreCase(nom)) {
				return profesiones.get(i);
			}

		}

		return null;

	}
	
	/**
	 * Busca una profesión por su código
	 * 
	 * @param cod código que se desea buscar
	 *            
	 * @return la profesión si la encuentra, de lo contrario null
	 */
	public Profesion buscarProfesionCodigo(String cod) {

		for (int i = 0; i < profesiones.size(); i++) {

			if (profesiones.get(i).getCodigo().equalsIgnoreCase(cod)) {
				return profesiones.get(i);
			}

		}

		return null;

	}

	/**
	 * Obtine la lista de profesiones de la tabla profesión
	 * 
	 * @return la lista de las profesiones 
	 * @throws Exception si no se puede conectar a la base de datos
	 *             
	 */
	public ArrayList<Profesion> listaProfesiones() throws Exception {

		Connection con = AdministradorConexionJDBC.getConexion();

		String sql = "SELECT codigo_prof,nombre_prof FROM tb_profesion";

		PreparedStatement pstmt = con.prepareStatement(sql);

		ResultSet res = pstmt.executeQuery();

		while (res.next()) {

			Profesion prof = new Profesion(res.getString(1), res.getString(2));
			profesiones.add(prof);

		}
		con.close();

		return profesiones;

	}

	public List<Profesion> listaarProfesionesJPA() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Profesion buscarProfesionJPA(String nom) {
		// TODO Auto-generated method stub
		return null;
	}



}
