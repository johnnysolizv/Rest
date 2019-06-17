package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class Conexion {

	public Connection getConexion() {
		Connection cn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = ("jdbc:mysql://10.32.16.3:3306/unimrcp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			cn = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();

		}

		return cn;
	}



	
}

