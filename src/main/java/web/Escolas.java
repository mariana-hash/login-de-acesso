package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import alunos.Escola;
import alunos.EscolaMB;
import alunos.LogMB;

/**
 * Servlet implementation class Escolas
 */
@WebServlet(urlPatterns = {"/logado/escolas.jsp"})
public class Escolas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Escolas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
		LogMB log = new LogMB();
		HttpSession session = request.getSession();
        java.util.Date dataUtil = new java.util.Date();
        String data = dataUtil.toString();
    	List<Escola> escolas = new ArrayList<Escola>();
    	EscolaMB escola = new EscolaMB();
    	
    	String diretor = "";
    	String coordenador = "";
    	String organizacao = "";
    	String dependenciaAdm = "";
    	String dsEscola = "";
    	
    	if(request.getParameter("filtrar") != null) {
    		
    		 diretor = request.getParameter("diretor");
        	 coordenador = request.getParameter("coordenador");
        	 organizacao = request.getParameter("organizacao");
        	 dependenciaAdm = request.getParameter("dependenciaAdm");
        	 dsEscola = request.getParameter("dsEscola");
    	}
    	    	    	
       	escolas = escola.getListaCompleta(diretor, coordenador, organizacao, dependenciaAdm, dsEscola);
    	   
    	request.setAttribute("escolas", escolas);
    	log.novoAcessoEscolas(session.getAttribute("usuarioLogado").toString(), data);
    	
    	
        String URL = "/WEB-INF/view/logado/escolas.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
        
        
    }

}
