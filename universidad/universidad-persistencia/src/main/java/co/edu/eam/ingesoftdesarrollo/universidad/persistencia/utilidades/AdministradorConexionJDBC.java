package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Permite administrar la conexión con la base de datos
 * @author david
 *
 */
public class AdministradorConexionJDBC {
	
	/**
	 * realiza la conexion con la base de datos
	 * @return la conexion 
	 * @throws SQLException si hubo algun problema con la conexion 
	 */
	public static Connection getConexion() throws SQLException{
	
	String url = "jdbc:mysql://localhost:3306/universidad";
	String user = "root";
	String pass = "";

	Connection con = DriverManager.getConnection(url, user, pass);
	
	return con;
	
	}

}
