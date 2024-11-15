package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Ma connection java à Postgresql est issu de tutoriel trouvables sur internet

/**
 * Class that allows you to create a connection to postgresql database.
 */
public class ConnectDatabase {

	private static final String URL = "jdbc:postgresql://pedago.univ-avignon.fr:5432/etd";
	private static final String USERNAME = "uapvxxxxxxx";
	private static final String PASSWORD = "<YOUR_PASSWORD>";
	private static Connection connection = null;

	// On va load le driver à l'initialisation ici
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Establishes the connection with postgresql database.
	 * @return java.sql.Connection
	 */
	public static Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("Connection established successfully.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	/**
	 * Closes the connection with postgresql database.
	 */
	public static void closeConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Connection closed successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
