package com.srcsoftware.vintage.repositorio;

import java.sql.SQLException;
import java.util.List;

import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.exceptions.ConcurseiroEmailJaExisteException;

public interface IRepositorioConcurseiro {

	
	public void cadastrarConcurseiro(Concurseiro concurseiro) throws ConcurseiroEmailJaExisteException; //que não faz nada.

	public void alterarConcurseiro(Concurseiro concurseiro);
	
	public void excluirConcurseiro(Concurseiro concurseiro);
	
	public List<Concurseiro> buscarTodos();
	
	public Concurseiro procurarConcurseiroPorId(Integer id);
	
	public Concurseiro autenticarConcurseiro(Concurseiro concurseiro) throws SQLException;

	public boolean existeEmail(String e_mail);

	public Concurseiro procurarConcurseiroPorNome(String nome);
	
	public Integer ultimoIdConcurseiro();

	public boolean existeConcurseiro(Integer concurseiro);

	// public ArrayList<ConcurseiroEndereco> listarConcurseiroEndereco();


	

}
