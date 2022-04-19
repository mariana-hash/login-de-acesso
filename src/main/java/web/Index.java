package web;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import alunos.Usuario;
import alunos.UsuarioMB;
import util.Erro;
import util.Senha;

/**
 * Servlet implementation class Index
 */
@WebServlet(urlPatterns = {"/index.jsp", "/logout.jsp"})
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NoSuchAlgorithmException {


        Erro erros = new Erro();
        UsuarioMB usr = new UsuarioMB();       
        

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        
//        Entrar:
        if (request.getParameter("bOK") != null) {
            if (login == null || login.isEmpty()) {
                erros.add("Login não informado!");
            }
            if (senha == null || senha.isEmpty()) {
                erros.add("Senha não informada!");
            }
            if (!erros.isExisteErros()) {
                Usuario user = usr.getSingle(login);
                senha = Senha.hashSenha(request.getParameter("senha"));

                if (user != null) {
                    if (user.getSenha().equals(senha)) {
                        request.getSession().setAttribute("usuarioLogado", user.getLogin());
//                      response.sendRedirect("logado/menu.jsp");
                        response.sendRedirect("logado/logado.jsp");
                        return;
                    } else {
                        erros.add("Senha inválida!");
                    }
                } else {
                    erros.add("Usuário não encontrado!");
                }
            }

        }
        
//        Cadastrar
        if (request.getParameter("novo") != null) {
            if (login == null || login.isEmpty()) {
                erros.add("Login não informado!");
            }
            if (senha == null || senha.isEmpty()) {
                erros.add("Senha não informada!");
            }
            if (!erros.isExisteErros()) {
                if(!usr.criarUsuario(login, senha)) {
                	erros.add("Não foi possível cadastrar usuário");
                }
                
            }
        }
        

//      Resetar senha
        if (request.getParameter("senhaqual") != null) {
            if (login == null || login.isEmpty()) {
                erros.add("Login não informado!");
            }
            if (senha == null || senha.isEmpty()) {
                erros.add("Senha não informada!");
            }
            if (!erros.isExisteErros()) {
                Usuario user = usr.getSingle(login);
                if (user != null) {
                   usr.resetarUsuario(login, senha);
                   
                } else {
                    erros.add("Usuário não encontrado!");
                }
            }

        }
        
        
        request.getSession().invalidate();


        request.setAttribute("mensagens", erros);

        String URL = "/WEB-INF/view/index.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			try {
				processRequest(request, response);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

}
