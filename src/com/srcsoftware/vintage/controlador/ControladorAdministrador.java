package com.srcsoftware.vintage.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import com.srcsoftware.vintage.concursos.entidades.Administrador;
import com.srcsoftware.vintage.concursos.exceptions.AdministradorEmailJaExisteException;
import com.srcsoftware.vintage.concursos.repositorio.AdministradorDAO;
import com.srcsoftware.vintage.repositorio.IRepositorioAdministrador;

public class ControladorAdministrador {

	private IRepositorioAdministrador administradorDao;

	public ControladorAdministrador() {
		this.administradorDao = new AdministradorDAO();

	}

	public void cadastrarAdministrador(Administrador administrador) throws AdministradorEmailJaExisteException {
		if (this.administradorDao.existeEmail(administrador.getE_mail()))
			this.administradorDao.cadastrarAdministrador(administrador);
	}

	public Administrador procurarAdministrador(Integer id) {
		return this.administradorDao.procurarAdministrador(id);
	}

	public Administrador procurarAdministradorNome(String nome) {
		return this.administradorDao.procurarAdministradorNome(nome);
	}

	public void alterarAdministrador(Administrador administrador) {
		this.administradorDao.alterarAdministradoro(administrador);

	}

	public void deletarAdministrador(Integer id) {
		this.administradorDao.deletarAdministrador(id);

	}

	/*
	 * public ArrayList<AdministradorEndereco> listarAdministradorEndereco() {
	 * return this.administradorDao.listarAdministradorEndereco(); }
	 */

	public ArrayList<Administrador> listarAdministradores() {
		return this.administradorDao.listarAdministradores();
	}

	public Administrador autenticarAdministrador(String e_mail, String senha) throws SQLException {
		return this.administradorDao.autenticarAdministrador(e_mail, senha);
	}

	public boolean existeEmail(String e_mail) {

		return this.administradorDao.existeEmail(e_mail);
	}

	/*
	 * public boolean existeCnpj(String cnpj) { return
	 * this.administradorDao.existeCnpj(cnpj); }
	 */

	public Integer ultimoIdAdministrador() {
		return this.administradorDao.ultimoIdAdministrador();
	}
}
