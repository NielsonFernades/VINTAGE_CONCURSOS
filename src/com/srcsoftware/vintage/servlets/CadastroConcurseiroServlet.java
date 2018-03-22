package com.srcsoftware.vintage.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.rmi.CORBA.Util;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srcsoftware.vintage.concursos.entidades.Concurseiro;
import com.srcsoftware.vintage.concursos.exceptions.ConcurseiroEmailJaExisteException;
import com.srcsoftware.vintage.fachada.Fachada;

@WebServlet("/CadastrarConcurseiro")
public class CadastroConcurseiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIR = "concurseiro";

	public CadastroConcurseiroServlet() {
		super();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		String html = null;

		try {
			processRequest(request, response);
			response.getWriter().write(html);
		} catch (ConcurseiroEmailJaExisteException e) {
			html = "<b>" + e.getMessage() + "</b>";
			response.getWriter().write(html);
		}
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ConcurseiroEmailJaExisteException {
		validarDados(request, response);
		response.setContentType("text/html;charset=UTF-8");
		response.sendRedirect(request.getParameter("url") + "?nome=" + request.getParameter("id"));
	}

	private void validarDados(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ConcurseiroEmailJaExisteException {

		// CONCURSEIRO
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular");
		// String cnpj = request.getParameter("cnpj");

		// ENDEREÇO
		/*
		 * String cep = request.getParameter("confimacaoCep"); String rua =
		 * request.getParameter("confirmacaoRua"); String numero =
		 * request.getParameter("confirmacaoNumero"); String descricao =
		 * request.getParameter("txtEnderecoForm"); String latitude =
		 * request.getParameter("txtLatitude"); String longitude =
		 * request.getParameter("txtLongitude");
		 */

		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String s = df.format(d);
		String result = s;

		Fachada fachada = Fachada.getInstance();
		Integer ultimo_id = fachada.ultimoIdConcurseiro();

		Concurseiro concurseiro = new Concurseiro(0,  nome, senha, email, celular);

		/*
		 * Endereco endereco = new Endereco(0, ultimo_id, 3, cep, rua,
		 * Integer.parseInt(numero), descricao, longitude, latitude);
		 */

		if (fachada.existeEmailConcurseiro(email))
			throw new ConcurseiroEmailJaExisteException();
		fachada.cadastrarConcurseiro(concurseiro);
		// fachada.cadastrarEndereco(endereco);
		//request.setAttribute("fileName", Util.uploadFiles(request, UPLOAD_DIR, Integer.toString(ultimo_id)));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
