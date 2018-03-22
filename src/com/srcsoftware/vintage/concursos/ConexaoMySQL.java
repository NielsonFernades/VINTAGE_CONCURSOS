package com.srcsoftware.vintage.concursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	private static String serverName = "localhost"; // caminho do servidor do BD
	private static String mydatabase = "vintageConcursus"; // nome do seu banco
															// de dados
	private static String username = "root"; // nome de um usu�rio de seu BD
	private static String password = ""; // sua senha de acesso

	public static String status = "N�o conectou MySQL...";

	public ConexaoMySQL() {
	}

	// M�todo de Conex�o//
	public static Connection conexaoMySQL() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);

			String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->N�o foi possivel realizar conex�o");
			}

			return connection;

		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}

	}

	public static String statusConection() {
		return status;
	}

	public static boolean fecharConexao() {
		try {
			ConexaoMySQL.conexaoMySQL().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static java.sql.Connection ReiniciarConexao() {
		fecharConexao();
		return ConexaoMySQL.conexaoMySQL();
	}

}
