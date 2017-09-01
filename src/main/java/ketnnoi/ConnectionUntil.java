package ketnnoi;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUntil {
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		return OracleConnUntil.getOracleConnection();
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Connection la 1 interface chua cac method phuc vu cho viec lien lac vs csdl
		Connection conn = ConnectionUntil.getMyConnection();
		System.out.println("Get connection: " + conn);

	}
}
