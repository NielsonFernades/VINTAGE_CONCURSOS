package com.srcsoftware.vintage.concursos.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.srcsoftware.vintage.concursos.ConectionPostegres;
//import com.srcsoftware.vintage.concursos.Conexao;
import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.repositorio.IRepositorioConcurseiro;


public class ConcurseiroDAO implements IRepositorioConcurseiro {
	Connection conexao = ConectionPostegres.getConnection();

	@Override
	public void cadastrarConcurseiro(Concurseiro concurseiro) {
		// Monta sql
		String sql = "INSERT INTO concurseiro (nome, e_mail, celular, senha) VALUES (?,?,?,?)";

		// Constrói o PreparedStatement comn o SQL
		try {

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, concurseiro.getNome());
			// stmt.setDate(concurseiro.getData_nascimento());
			stmt.setString(2, concurseiro.getE_mail());
			stmt.setString(3, concurseiro.getCelular());
			stmt.setString(4, concurseiro.getSenha());
			// stmt.setDate(concurseiro.getData_cadastro());

			stmt.execute();
			stmt.close();

			System.out.println("Cadastrado com Sucesso!");

		} catch (SQLException e) {

			e.printStackTrace();
			throw new RuntimeException();
		}

	}

/*	
	+ concurseiro.getE_mail() + "', '" + concurseiro.getSenha() + "', '" + concurseiro.getNome() + "', '"
	+ concurseiro.getCelular() + "', '" + concurseiro.getData_cadastro() + "')");*/
//essa daqui. Muda e testa
//Instanciar o ConcurseiroDAO e dele chamar esse método
	
	@Override
	public void alterarConcurseiro(Concurseiro concurseiro) {

		// Monta sql
		String sql = "UPDATE concurseiro SET nome=?,  e_mail=?,  celular=?,  senha=? WHERE id=?";

		// Constrói o PreparedStatement comn o SQL
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);

			preparador.setString(1, concurseiro.getNome());
			preparador.setString(2, concurseiro.getE_mail());
			preparador.setString(3, concurseiro.getCelular());
			preparador.setString(4, concurseiro.getSenha());
			
			preparador.setInt(5, concurseiro.getId());

			preparador.execute();
			preparador.close();

			System.out.println("Alterado com Sucesso!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
		/*execute("UPDATE concurseiro SET e_mail='" + concurseiro.getE_mail() + "', senha='" + concurseiro.getSenha()
				+ "', nome='" + concurseiro.getNome() + "', cnpj='" + "', numero_celular='" + concurseiro.getCelular()
				+ "' where id='" + concurseiro.getId() + "'");*/

	@Override
	public void excluirConcurseiro(Concurseiro concurseiro) {
		// Monta sql
		String sql = "DELETE FROM concurseiro WHERE id=?";

		// Constrói o PreparedStatement comn o SQL
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);

			preparador.setInt(1, concurseiro.getId());

			preparador.execute();
			preparador.close();

			System.out.println("Excluído com Sucesso!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

/*	execute("DELETE FROM concurseiro where id= '" + id + "'");
*/

	@Override
	public List<Concurseiro> buscarTodos() {

		String sql = "select * from concurseiro";
		List<Concurseiro> listaConcurseiros = new ArrayList<Concurseiro>();

		try {

			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Concurseiro concurseiro = new Concurseiro();

				concurseiro.setId(rs.getInt("id"));
				concurseiro.setNome(rs.getString("nome"));
				concurseiro.setE_mail(rs.getString("e_mail"));
				concurseiro.setCelular(rs.getString("celular"));
				concurseiro.setSenha(rs.getString("senha"));

				listaConcurseiros.add(concurseiro);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return listaConcurseiros;
	}
	
	
	@Override
	public Concurseiro procurarConcurseiroPorId(Integer id) {
		String sql = "SELECT * FROM concurseiro WHERE id=?";
		Concurseiro concurseiro = null;
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setInt(1, id);

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) { // SE FOI PARA O PRÓXIMO

				concurseiro = new Concurseiro();
				concurseiro.setId(resultado.getInt("id"));
				concurseiro.setNome(resultado.getString("nome"));
				concurseiro.setE_mail(resultado.getString("E_mail"));
				concurseiro.setCelular(resultado.getString("Celular"));
				concurseiro.setSenha(resultado.getString("Senha"));
			}
			// preparador.close();
			System.out.println("Concurseiro encontrado com Sucesso!");
			System.out.println(" ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return concurseiro;

	}

	@Override
	public Concurseiro autenticarConcurseiro(Concurseiro concurseiro) throws SQLException {
		String sql = "SELECT * FROM concurseiro WHERE nome = ? and senha = ?";
		Concurseiro concurseiroRetorno = null;
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, concurseiro.getNome());
			preparador.setString(2, concurseiro.getSenha());

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) { // SE FOI PARA O PRÓXIMO

				concurseiroRetorno = new Concurseiro();
				concurseiroRetorno.setId(resultado.getInt("id"));
				concurseiroRetorno.setNome(resultado.getString("nome"));
				concurseiroRetorno.setSenha(resultado.getString("Senha"));

			}
			// preparador.close();
			System.out.println("Concurseiro encontrado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return concurseiroRetorno;

	}

	/*
	Concurseiro concurseiro = null;
	try {
		Connection conn = ConectionPostegres.getConnection();
		String query = "SELECT * FROM concurseiro WHERE e_mail='" + e_mail + "' AND senha= '" + senha + "'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);

		if (rs.next()) {
			concurseiro = new Concurseiro(rs.getInt("id"), rs.getString("nome"), rs.getString("e_mail"),
					rs.getString("celular"), rs.getString("senha"));

			
			 * Integer id, String nome, Date data_nascimento, String e_mail,
			 * String celular, String senha, Date data_cadastro
			 
		}
		st.close();

	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
	return concurseiro;*/

	@Override
	public boolean existeEmail(String e_mail) {
		boolean existe = false;

		try {
			Connection conn = ConectionPostegres.getConnection();
			
			String query = "SELECT * FROM concurseiro WHERE e_mail='" + e_mail + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				if (rs.getString("e_mail").equals(e_mail)) {
					existe = true;
					System.out.println("");
					System.out.println((e_mail));
					System.out.println(getClass().getName());
				}
			}
			//System.out.println("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}

	@Override
	public Concurseiro procurarConcurseiroPorNome(String nome) {
		String sql = "SELECT * FROM concurseiro WHERE nome=?";
		Concurseiro concurseiro = null;
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, nome);

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) { // SE FOI PARA O PRÓXIMO

				concurseiro = new Concurseiro();
				concurseiro.setId(resultado.getInt("id"));
				concurseiro.setNome(resultado.getString("nome"));
				concurseiro.setE_mail(resultado.getString("E_mail"));
				concurseiro.setCelular(resultado.getString("Celular"));
				concurseiro.setSenha(resultado.getString("Senha"));
			}
			// preparador.close();
			System.out.println("Nome encontrado com Sucesso!");
			System.out.println(" ");
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return concurseiro;

}
	/*	
		String sql = "SELECT * FROM concurseiro WHERE nome like ?";
		// CRIANDO A LISTA
		List<Concurseiro> lista = new ArrayList<Concurseiro>();
		try {// FAZENDO A CONSULTA
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, "%" + nome + "%");

			// PEGANDO O RESULTADO DA CONSULTA
			ResultSet resultado = preparador.executeQuery();

			// VARENDO O RESUTADO UM POR UM
			while (resultado.next()) { // SE FOI PARA O PRÓXIMO

				// CADA REGISTRO CRIA UM OBJETO
				Concurseiro concurseiro = new Concurseiro();
				concurseiro.setId(resultado.getInt("id"));
				concurseiro.setNome(resultado.getString("nome"));
				concurseiro.setE_mail(resultado.getString("E_mail"));
				concurseiro.setCelular(resultado.getString("Celular"));
				concurseiro.setSenha(resultado.getString("Senha"));
				// COLOCANDO OS OBJETOS NA LISTA
				lista.add(concurseiro);
			}
			// preparador.close();
			System.out.println("Concurseiro encontrado com Sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;*/
	
		
	/*	
	 * public Concurseiro procurarConcurseiroNome(String nome) {
		Concurseiro concurseiro = null;
		try {
			Connection conn = ConectionPostegres.getConnection();

			String query = "SELECT * FROM concurseiro WHERE nome='" + nome + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				concurseiro = new Concurseiro(rs.getInt("id"), rs.getString("nome"), rs.getString("e_mail"),
						rs.getString("celular"), rs.getString("senha"));
			}

			st.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return concurseiro;
	}

*/

	@Override
	public Integer ultimoIdConcurseiro() {
		Integer ultimoId = 0;

		try {
			Connection conn = ConectionPostegres.getConnection();
			String query = "SELECT MAX(id) as id FROM concurseiro ";
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

	/*
	 * @Override public ArrayList<ConcurseiroEndereco>
	 * listarConcurseiroEndereco() { return null; }
	 */

	
	@Override
	public boolean existeConcurseiro(Integer concurseiro) {
		boolean existe = false;

		try {
			Connection conn = ConectionPostegres.getConnection();
			String sql = "SELECT * FROM concurseiro WHERE id = ? " + concurseiro + "'";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				if (rs.getString("id").equals(concurseiro)) {
					existe = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}

/*	private static void execute(String query) {
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
	}*/

}
