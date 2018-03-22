package com.srcsoftware.vintage.fachada;

import java.sql.SQLException;
import java.util.List;

import com.srcsoftware.vintage.concursos.entidades.Administrador;
import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.exceptions.AdministradorEmailJaExisteException;
import com.srcsoftware.vintage.concursos.exceptions.ConcurseiroEmailJaExisteException;
import com.srcsoftware.vintage.controlador.ControladorAdministrador;
import com.srcsoftware.vintage.controlador.ControladorConcurseiro;

public class Fachada {

	private static Fachada instance;

	private ControladorConcurseiro controladorConcurseiro;
	private ControladorAdministrador controladorAdministrador;

	public Fachada() {

		this.controladorConcurseiro = new ControladorConcurseiro();
		this.controladorAdministrador = new ControladorAdministrador();
	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}

	//================================================================== FACHADA CONCURSEIRO ==================================================================
	
	public void cadastrarConcurseiro(Concurseiro concurseiro) throws ConcurseiroEmailJaExisteException {
		this.controladorConcurseiro.cadastrarConcurseiro(concurseiro); //Aqui chama o método cadastrarConcurseiro do controlador
	}
	

	public void alterarConcurseiro(Concurseiro concurseiro) {
		this.controladorConcurseiro.alterarConcurseiro(concurseiro);
	}
	
	public void excluirConcurseiro(Concurseiro concurseiro) {
		this.controladorConcurseiro.excluirConcurseiro(concurseiro);
	}
	
	public List<Concurseiro> buscarTodos() {
		return this.controladorConcurseiro.buscarTodos();
	}
	
	
	public Concurseiro procurarConcurseiroPorId(Integer id) {
		return this.controladorConcurseiro.procurarConcurseiroPorId(id);
	}

	
	public Concurseiro autenticarConcurseiro(Concurseiro concurseiro) throws SQLException {
		return this.controladorConcurseiro.autenticarConcuseiro(concurseiro);
	}
	
	public boolean existeEmail(String e_mail) {
		return this.controladorConcurseiro.existeEmail(e_mail);
	}
	
	public Concurseiro procurarConcuseiroNome(String nome) {
		return this.controladorConcurseiro.procurarConcurseiroNome(nome);
	}

	public Integer ultimoIdConcurseiro() {
		return this.controladorConcurseiro.ultimoIdConcurseiro();
	}

	/*
	 * public boolean existeCnpj(String cnpj) { return
	 * this.controladorConcurseiro.existeCnpj(cnpj); }
	 */


	/*public ArrayList<ConcurseiroEndereco> listarClienteEndereco() {
		return this.controladorConcurseiro.listarConcurseiroEndereco();
	}*/
	
	//================================================================== FACHADA ADM ==================================================================

	public Administrador procurarAdministrador(Integer id) {
		return this.controladorAdministrador.procurarAdministrador(id);
	}

	public Administrador procurarAdministradorNome(String nome) {
		return this.controladorAdministrador.procurarAdministradorNome(nome);
	}

	public List<Administrador> listarAdm() {
		return null;
	}

	public void cadastrarAdministrador(Administrador administrador) throws AdministradorEmailJaExisteException {
		this.controladorAdministrador.cadastrarAdministrador(administrador);
	}

	public void deletarAdministrador(Integer id) {
		this.controladorAdministrador.deletarAdministrador(id);
	}

	public void atualizarAdministrador(Administrador administrador) {
		this.controladorAdministrador.alterarAdministrador(administrador);
	}

	public Integer ultimoIdAdministrador() {
		return this.controladorAdministrador.ultimoIdAdministrador();
	}

	public boolean existeEmailAdm(String e_mail) {
		return this.controladorAdministrador.existeEmail(e_mail);
	}

	public Concurseiro autenticarAdministrador(String e_mail, String senha) throws SQLException {
		return  null;
	}
	//================================================================== FACHADA PROFESSOR ==================================================================

}
