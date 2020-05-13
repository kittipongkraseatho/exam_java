package Connect_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con_DB {
	private final String url = "jdbc:postgresql://localhost:5432/test_db";
	private final String user = "postgres";
	private final String password = "123456789";
	
	private void connect() {
		try( Connection connection = DriverManager.getConnection(url, user, password);) {
			if(connection != null) {
				System.out.print("Con Successs");
			} else {
				System.out.println("Con File");
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Con_DB sqlConnect = new Con_DB();
		sqlConnect.connect();
	}
}
