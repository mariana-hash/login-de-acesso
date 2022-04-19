package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import alunos.Aluno;
import alunos.AlunoMB;
import alunos.Escola;
import alunos.EscolaMB;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/logado/menu.jsp")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher rd = request.getRequestDispatcher(
//                "/WEB-INF/view/logado/menu.jsp");
//        rd.forward(request, response);
//    }
    
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response) //exibir sem filtro
//            throws ServletException, IOException {
//    	
//    	List<Aluno> alunos = new ArrayList<Aluno>();
//    	AlunoMB aluno = new AlunoMB();
//    	
//    	alunos = aluno.getlistaCompleta();
//    	
//    	request.setAttribute("alunos", alunos);
//    	
//    	
//        RequestDispatcher rd = request.getRequestDispatcher(
//                "/WEB-INF/view/logado/menu.jsp");
//        rd.forward(request, response);
//    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	List<Aluno> alunos = new ArrayList<Aluno>();
    	AlunoMB aluno = new AlunoMB();
    	String cpf = "";
    	String nomeAluno = "";
    	String nomeMae = "";
    	String dataNascimento = "";
    	
    	List<Escola> escolas = new ArrayList<Escola>();
    	EscolaMB escola = new EscolaMB();
    	
    	if(request.getParameter("filtrar")!= null) {
    		if(cpf != null)
    			cpf = request.getParameter("cpf");
    		if(nomeAluno != null)
    			nomeAluno = request.getParameter("nomeAluno");
    		if(nomeMae != null)
    			nomeMae = request.getParameter("nomeMae");
    		if(dataNascimento != null)
    			dataNascimento = request.getParameter("dataNascimento");
    	}
    	
    	alunos = aluno.getlistaCompleta(cpf, nomeAluno, nomeMae, dataNascimento);
    	escolas = escola.getListaCompleta("","","","","");
    	
    	request.setAttribute("alunos", alunos);
    	request.setAttribute("escolas", escolas);
    	
    	
        RequestDispatcher rd = request.getRequestDispatcher(
                "/WEB-INF/view/logado/menu.jsp");
        rd.forward(request, response);
        
    }
        

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		processRequest(request, response);
//	}
	
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
	

}
