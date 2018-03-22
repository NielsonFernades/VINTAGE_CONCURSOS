package com.srcsoftware.vintage.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import com.srcsoftware.vintage.concursos.entidades.Administrador;
import com.srcsoftware.vintage.concursos.exceptions.AdministradorEmailJaExisteException;

public interface IRepositorioAdministrador {

	public Administrador autenticarAdministrador(String e_mail, String senha) throws SQLException;

	public boolean existeEmail(String e_mail);

	public Administrador procurarAdministrador(Integer id);

	public Administrador procurarAdministradorNome(String nome);

	public void cadastrarAdministrador(Administrador administrador) throws AdministradorEmailJaExisteException;

	public void alterarAdministradoro(Administrador administrador);

	public Integer ultimoIdAdministrador();

	public void deletarAdministrador(Integer id);

	// public ArrayList<AdministradorEndereco> listarAdministradorEndereco();

	public ArrayList<Administrador> listarAdministradores();

}
