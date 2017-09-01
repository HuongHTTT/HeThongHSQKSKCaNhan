package ketnnoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnUntil {
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException{
		String hostName = "10.60.110.24";
		String sid = "ybdt";
		String username = "ybdt";
		String password = "ybdt#123";
		return getOracleConnection(hostName, sid, username, password);
	}
	
	public static Connection getOracleConnection(String hostName, String sid, String username, String password) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
	//DriverManager nap driver vao ds driver, mo knoi toi nguon du lieu
	Connection conn = DriverManager.getConnection(connectionURL, username, password);
		return conn;
		
	}
}
