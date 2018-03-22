package com.srcsoftware.vintage.concursos.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.srcsoftware.vintage.concursos.ConectionPostegres;
import com.srcsoftware.vintage.concursos.entidades.Administrador;
import com.srcsoftware.vintage.concursos.exceptions.AdministradorEmailJaExisteException;
import com.srcsoftware.vintage.repositorio.IRepositorioAdministrador;

public class AdministradorDAO implements IRepositorioAdministrador{

	@Override
	public Administrador autenticarAdministrador(String e_mail, String senha) throws SQLException {
		Administrador administrador = null;
		try {
			Connection conn = ConectionPostegres.getConnection();
			String query = "SELECT * FROM administrador WHERE e_mail='" + e_mail + "' AND senha= '" + senha + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				administrador = new Administrador(rs.getInt("id"), rs.getString("nome"), rs.getString("e_mail"),
						rs.getString("celular"), rs.getString("senha"));

			}
			st.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return administrador;
	}

	@Override
	public boolean existeEmail(String e_mail) {
		boolean existe = false;

		try {
			Connection conn = ConectionPostegres.getConnection();
			String query = "SELECT * FROM administrador WHERE e_mail='" + e_mail + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getString("e_mail").equals(e_mail)) {
					existe = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}

	@Override
	public Administrador procurarAdministrador(Integer id) {
		Administrador administrador = null;
		try {
			Connection conn = ConectionPostegres.getConnection();

			String query = "SELECT * FROM administrador where id= ' " + id + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				administrador = new Administrador(rs.getInt("id"), rs.getString("nome"), rs.getString("e_mail"),
						rs.getString("celular"), rs.getString("senha"));
			}

			st.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return administrador;
	}

	@Override
	public Administrador procurarAdministradorNome(String nome) {
		Administrador administrador = null;
		try {
			Connection conn = ConectionPostegres.getConnection();

			String query = "SELECT * FROM administrador WHERE nome='" + nome + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				administrador = new Administrador(rs.getInt("id"), rs.getString("nome"), rs.getString("e_mail"),
						rs.getString("celular"), rs.getString("senha"));
			}

			st.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return administrador;

	}

	@Override
	public void cadastrarAdministrador(Administrador administrador) throws AdministradorEmailJaExisteException {
		execute("INSERT INTO administrador (id, nome, e_mail, celular, senha) VALUES ('"
				+ administrador.getE_mail() + "', '" + administrador.getSenha() + "', '" + administrador.getNome() + "', '"
				+ administrador.getCelular() + "')");
	}

	@Override
	public void alterarAdministradoro(Administrador administrador) {
		execute("UPDATE administrador SET e_mail='" + administrador.getE_mail() + "', senha='" + administrador.getSenha()
				+ "', nome='" + administrador.getNome() + "', numero_celular='" + administrador.getCelular()
				+ "' where id='" + administrador.getId() + "'");
	}

	@Override
	public Integer ultimoIdAdministrador() {
		Integer ultimoId = 0;

		try {
			Connection conn = ConectionPostegres.getConnection();
			String query = "SELECT MAX(id) as id FROM administrador ";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				ultimoId = (rs.getInt("id"));
			}

			st.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return ultimoId + 1;
	}

	@Override
	public void deletarAdministrador(Integer id) {
		execute("DELETE FROM administrador where id= '" + id + "'");
	}

	@Override
	public ArrayList<Administrador> listarAdministradores() {
		return null;
	}

	private static void execute(String query) {
		try {
			Connection conn = ConectionPostegres.getConnection();
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			// execute the preparedstatement
			preparedStmt.execute();
			conn.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
