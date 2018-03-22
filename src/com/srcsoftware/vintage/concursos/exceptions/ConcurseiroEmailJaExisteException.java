package com.srcsoftware.vintage.concursos.exceptions;

public class ConcurseiroEmailJaExisteException extends Exception{
	
	public ConcurseiroEmailJaExisteException() {
		super("Email já existe");
	}

}
