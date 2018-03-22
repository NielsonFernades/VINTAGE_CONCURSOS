package com.srcsoftware.vintage.main;


import java.sql.SQLException;


import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.exceptions.ConcurseiroEmailJaExisteException;
import com.srcsoftware.vintage.fachada.Fachada;

public class Main {

	public static void main(String[] args) throws SQLException, ConcurseiroEmailJaExisteException {
			
		Concurseiro c = new Concurseiro();
		/*c.setNome("alterando o 4");
		c.setE_mail("elisa@hotmail.com");
		c.setCelular("9898-9898");
		c.setSenha("7890");
		c.setId(4);*/
		
		Fachada f = Fachada.getInstance();
		//f.cadastrarConcurseiro(c); //Chamando o método da fachada "cadastrarConcurseiro"
		//f.excluirConcurseiro(c);
		//f.alterarConcurseiro(c);
		
		//f.procurarConcurseiroPorId(2);
		//System.out.println(f.procurarConcurseiroPorId(2));
		//System.out.println(f.existeEmail("nielson@hotmail.com"));
		System.out.println(f.procurarConcuseiroNome("b"));

		//System.out.println("");
		//System.out.println(f.buscarTodos());
		
		
		
		//System.out.println(f.listarAdm());
	}

}
