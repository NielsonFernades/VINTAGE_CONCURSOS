package com.srcsoftware.vintage.controlador;

import java.sql.SQLException;
import java.util.List;

import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.exceptions.ConcurseiroEmailJaExisteException;
import com.srcsoftware.vintage.concursos.repositorio.ConcurseiroDAO;

public class ControladorConcurseiro {

	Concurseiro concurseiro;
	private ConcurseiroDAO concurseiroDao;

	public ControladorConcurseiro() {
		this.concurseiroDao = new ConcurseiroDAO();
	}

	public void cadastrarConcurseiro(Concurseiro concurseiro) throws ConcurseiroEmailJaExisteException {
		/*
		 * if (concurseiroDao.existeConcurseiro(concurseiro.getId().equals(
		 * concurseiroDao)))
		 * this.concurseiroDao.cadastrarConcurseiro(concurseiro); else {
		 * System.out.println("Já existe"); }
		 */

		ConcurseiroDAO cd = new ConcurseiroDAO();
		cd.cadastrarConcurseiro(concurseiro);

		/*
		 * if (this.concurseiroDao.existeEmail(concurseiro.getE_mail()))
		 * this.concurseiroDao.cadastrarConcurseiro(concurseiro);
		 */
	}

	public void alterarConcurseiro(Concurseiro concurseiro) {
		this.concurseiroDao.alterarConcurseiro(concurseiro);

	}

	public void excluirConcurseiro(Concurseiro concurseiro) {
		this.concurseiroDao.excluirConcurseiro(concurseiro);
		;

	}

	public List<Concurseiro> buscarTodos() {
		return this.concurseiroDao.buscarTodos();
	}

	public Concurseiro procurarConcurseiroPorId(Integer id) {
		return this.concurseiroDao.procurarConcurseiroPorId(id);
	}

	public Concurseiro autenticarConcuseiro(Concurseiro concurseiro) throws SQLException {
		return this.concurseiroDao.autenticarConcurseiro(concurseiro);
	}

	public boolean existeEmail(String e_mail) {
		return this.concurseiroDao.existeEmail(e_mail);
	}

	public Concurseiro procurarConcurseiroNome(String nome) {
		return this.concurseiroDao.procurarConcurseiroPorNome(nome);
	}

	public Integer ultimoIdConcurseiro() {
		return this.concurseiroDao.ultimoIdConcurseiro();
	}

	/*
	 * public ArrayList<ConcurseiroEndereco> listaronCuseiroEndereco() { return
	 * this.concurseiroDao.listarConcurseiroEndereco(); }
	 */

}
