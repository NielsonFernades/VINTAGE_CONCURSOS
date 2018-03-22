package com.srcsoftware.vintage.concursos.exceptions;

public class AdministradorEmailJaExisteException extends Exception {

	public AdministradorEmailJaExisteException() {
		super("Já existe");
	}

}
