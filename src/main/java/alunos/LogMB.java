package alunos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.LogDAO;

@ManagedBean(name = "logMB")
@RequestScoped
public class LogMB {
	
	public List<Log> getlistaCompleta(){
		LogDAO log = new LogDAO();
		return log.getLog();
	}
	
	public boolean novoCadastro(String login, String data) {
		
		LogDAO log = new LogDAO();
		
		return log.criarLog(login, "cadastro", data);

	}
	
	public boolean novoAcessoEscolas(String login, String data) {
		
		LogDAO log = new LogDAO();
		
		return log.criarLog(login, "acesso escolas", data);

	}
	
	public boolean novoAcessoAlunos(String login, String data) {
		
		LogDAO log = new LogDAO();
		
		return log.criarLog(login, "acesso alunos", data);

	}
	
	public boolean senhaRedefinida(String login, String data) {
		
		LogDAO log = new LogDAO();
		
		return log.criarLog(login, "senha redefinida", data);
	}

}
