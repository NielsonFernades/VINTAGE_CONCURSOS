package com.srcsoftware.vintage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.repositorio.ConcurseiroDAO;

/**
 * Servlet implementation class CadastroConcurseiro
 */
@WebServlet("/CadastroConcurseiro")
public class CadastroConcurseiro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroConcurseiro() {
        super();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Concurseiro concurseiro = new Concurseiro(email, senha);
		new ConcurseiroDAO().cadastrarConcurseiro(concurseiro);
		
		response.sendRedirect("consultarConcurseiro.jsp");
		
	}

}
