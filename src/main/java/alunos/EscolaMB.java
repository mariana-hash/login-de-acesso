package alunos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import dao.EscolaDAO;

@ManagedBean(name="escolaMB")
@RequestScoped
public class EscolaMB {
	
	
	public List<Escola> getListaCompleta(String diretor, String coordenador, String organizacao, String dependenciaAdm, String dsEscola){
		EscolaDAO escolas = new EscolaDAO();
		return escolas.getListaEscola(diretor, coordenador, organizacao, dependenciaAdm, dsEscola);
	}

}
