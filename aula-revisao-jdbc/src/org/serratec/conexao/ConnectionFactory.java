package org.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String url = "jdbc:postgresql://localhost:5432/bancopoo";
	private String username = "postgres";
	private String password = "postgres";

	public Connection getConnection() {
		System.out.println("Fazendo a conexão....");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			System.err.println("Conexão não efetuada!");
			e.printStackTrace();
		}
		return connection;
	}

}
