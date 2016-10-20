package co.edu.eam.ingesoft.desarrollo.banco.persistencia.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorConexionJDBC {

	public static Connection getConexion() throws SQLException {
		// 1.2 conectarse.
		// del paquete java.sql
		System.out.println("conectandose....");
		String url = "jdbc:mysql://174.142.65.144:3306/banco";
		String user = "desarrollo";
		String pass = "desarrollo";

		Connection con = DriverManager.getConnection(url, user, pass);
		return con;
	}

}
