package com.srcsoftware.vintage.concursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionPostegres {

	private static volatile ConectionPostegres instancia;
	private static Connection conn;

	public static Connection getConnection() {
		

		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/VINTAGE_CONCURSOS", "postgres", "premiereads");
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Não foi possível conectar ao Banco de Dados" + e.getMessage());
		}

		return conn;
	}

	public static ConectionPostegres getInstance() {

		if (instancia == null) {
			synchronized (ConectionPostegres.class) {
				if (instancia == null) {
					instancia = new ConectionPostegres();
				}
			}
		}

		return instancia;
	}
}
