import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			//1. conectarse a la BD
			//1.1 cargar el driver.		
			Class.forName("com.mysql.jdbc.Driver");
			
			//1.2 conectarse.
			//del paquete java.sql
			System.out.println("conectandose....");
			String url="jdbc:mysql://174.142.65.144:3306/banco";
			String user="desarrollo";
			String pass="desarrollo";
			Connection con=DriverManager.getConnection(url, user, pass);
			System.out.println("conectado.");
		
			//2. usar la BD.
			//2.1 crear consulta..
			String sql="INSERT INTO T_CLIENTES (NOMBRE,CEDULA,TELEFONO,DIRECCION) "
					+ " VALUES('Camilo','1234','203842837','por ahi')";
			PreparedStatement pstmt=con.prepareStatement(sql);
			//2.2 ejecutar consulta..
			pstmt.executeUpdate();
			
			//3. cerrar la conexion.
			con.close();
			
			System.out.println("listo.");
			
		} catch (ClassNotFoundException e) {//en caso de ue no se haya agregado la dep
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
