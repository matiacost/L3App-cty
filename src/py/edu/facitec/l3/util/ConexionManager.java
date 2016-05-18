package py.edu.facitec.l3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionManager {

	private static Connection conexion;
	public static Statement stm;

	private static final String URL = "jdbc:postgresql://localhost:5432/db_trabajo_practico";
	private static final String USER = "postgres";
	private static final String PASSWORD = "12345";

	public static Connection abrirConexion(){

		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Suceso en el Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error en el Driver");
			e.printStackTrace();
		}

		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			stm = conexion.createStatement();
			System.out.println("Suceso en la conexion");
		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}

		return conexion;

	}
	
	public static void cerrarConexion(){
		
		if (conexion != null) {
			try {
				stm.close();
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
