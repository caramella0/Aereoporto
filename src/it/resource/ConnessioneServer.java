package it.resource;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import it.controller.Principale;

public class ConnessioneServer {
	
	public Connection connessione;

	public Connection getConnection() throws ConnectException, CommunicationsException, SQLException  {
		
	try {
		if (connessione == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName("127.0.0.1");
			dataSource.setPortNumber(3306);
			dataSource.setPassword("alessio");
			dataSource.setUser("root");
			dataSource.setDatabaseName("aereoporto");
			
			connessione = dataSource.getConnection();
			
			
		}
	
	} catch (SQLException e) {
		System.out.println("");
		System.out.println("Impossibile connettersi al server");
		Principale.main(null);
	}
	return connessione;	
	}
	
	public void closeConnection() throws SQLException {
		if (connessione != null) {
			connessione.close();
		}
	}
}
