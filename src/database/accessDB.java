package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class accessDB {
	
	Connection con;
	Statement st;
	public Connection openConnection() {
		try {
			String database = "practica1";
			String servername = "localhost";
			String port = "3306";
			String username = "root";
			String password = "rootroot";

			// Load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// Connect to the database
			con = DriverManager.getConnection("jdbc:mysql://" + servername + "/" + database, username, password);
			//log.write("CONNECTION SUCCESSFUL WITH DATABASE " + database + " ...");
			return con;

		} catch (Exception e) {

			//log.write("ERROR WHILE TRYING TO CONNECT TO DATABASE...");
			return null;
		}
	}

	public boolean closeConnection() {
		try {
			con.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
