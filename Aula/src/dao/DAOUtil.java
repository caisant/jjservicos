package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DAOUtil {
	private static final String JDBC_CLASS = 
			"com.mysql.jdbc.Driver";
	private static final String JDBC_URL =
			"jdbc:mysql://localhost:3306/db_jjservicos";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS =	"aluno";
	private static DAOUtil instancia;
	private Connection con;
	private DAOUtil() { 
		try {
			Class.forName( JDBC_CLASS );
			con = DriverManager.getConnection( 
					JDBC_URL, JDBC_USER, JDBC_PASS );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DAOUtil getInstance() { 
		if (instancia == null) { 
			instancia = new DAOUtil();
		}
		return instancia;
	}
	
	public Connection getConnection() { 
		return con;
	}
	

}
