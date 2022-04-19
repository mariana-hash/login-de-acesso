package alunos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.UsuarioDAO;

@ManagedBean(name = "usuarioMB")
@RequestScoped
public class UsuarioMB {
	
	public boolean criarUsuario(String login, String senha) {
		
		UsuarioDAO dao = new UsuarioDAO();
		LogMB log = new LogMB();
        java.util.Date dataUtil = new java.util.Date();
        String data = dataUtil.toString();
		
		return (dao.criarUsuario(login, senha) && log.novoCadastro(login, data));
		
	}
	
	public boolean resetarUsuario(String login, String senha) {
		
		UsuarioDAO dao = new UsuarioDAO();
		LogMB log = new LogMB();
        java.util.Date dataUtil = new java.util.Date();
        String data = dataUtil.toString();
		
		return (dao.resetarUsuario(login, senha) && log.senhaRedefinida(login, data));
	}
	
	public Usuario getSingle(String login){
		
		 UsuarioDAO dao = new UsuarioDAO();
		
		 return dao.getSingle(login);
	}

}
