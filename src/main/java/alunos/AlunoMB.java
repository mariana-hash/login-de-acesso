package alunos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.codehaus.groovy.control.messages.WarningMessage;

import dao.AlunoDAO;



@ManagedBean(name = "alunoMB")
@RequestScoped
public class AlunoMB {
	
	String[] Setor = {"Financeiro", "TI"};
	
			
	
	private boolean acessoValido (String setor) {
		
		
		for(String s : Setor) {
			
			if(setor.equals(s)) {
				return true; 
			}
		}
		
		return false;
		
		
	}
	
	public List<Aluno> validarAcesso (String setor){
		

		if(this.acessoValido(setor)) {
			
			AlunoDAO alunos = new AlunoDAO();

			return alunos.getListaAluno(null, null, null, null); 
		}
		
		
		else {
			
			new WarningMessage(0, "Você não tem permissão para acessar esses dados", null, null);
		}
			

			
		return null;
		
	}
	
	public List<Aluno> getlistaCompleta (String cpf, String nomeAluno, String nomeMae, String dataNascimento){
		
		AlunoDAO alunos = new AlunoDAO();
		
		return alunos.getListaAluno(cpf, nomeAluno, nomeMae, dataNascimento);
		
	}
	 

}
