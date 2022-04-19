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

import alunos.Aluno;
import alunos.AlunoMB;
import alunos.LogMB;

/**
 * Servlet implementation class Alunos
 */
@WebServlet(urlPatterns = {"/logado/alunos.jsp"})

public class Alunos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Alunos() {
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
    	
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	AlunoMB aluno = new AlunoMB();
    	LogMB log = new LogMB();
        java.util.Date dataUtil = new java.util.Date();
        String data = dataUtil.toString();
    	String cpf = "";
    	String nomeAluno = "";
    	String nomeMae = "";
    	String dataNascimento = "";
    	
    	
    	if(request.getParameter("filtrar")!= null) {
    		
			cpf = request.getParameter("cpf");
			nomeAluno = request.getParameter("nomeAluno");
			nomeMae = request.getParameter("nomeMae");
			dataNascimento = request.getParameter("dataNascimento");
    	}
    	
    	alunos = aluno.getlistaCompleta(cpf, nomeAluno, nomeMae, dataNascimento);
    	
    	request.setAttribute("alunos", alunos);
    	log.novoAcessoAlunos(request.getSession().getAttribute("usuarioLogado").toString(), data);

        
        String URL = "/WEB-INF/view/logado/alunos.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
        
    }

}
