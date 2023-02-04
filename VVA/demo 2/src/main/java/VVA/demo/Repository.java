package VVA.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {
	//url to connect to the database
	String url = "jdbc:postgresql:COSI127BPATest?user=aartijain&password=liberty312001";
	String username = "aartijain";
	String password;
	
	public Connection getConnection() {
		//This is the connection object
		Connection db = null;
		try {
			//connecting to the database
			db = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}
	
	
}