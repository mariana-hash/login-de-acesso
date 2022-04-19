package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import alunos.Escola;
import conexoes.ConexaoBD;

public class EscolaDAO {
	
	public EscolaDAO() {
		
	}
	
	public List<Escola> getListaEscola(String diretor, String coordenador, String organizacao, String dependenciaAdm, String dsEscola){
		Connection conn = ConexaoBD.open();
		
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 String q = "Select * from planilha.escolas where dsEscola like '%' ";
		 
		 List<Escola> escolas = new ArrayList<Escola>();
		 
		 try {
			 
				 
				 
				 if(!diretor.isEmpty())
					 q += " and DiretorAtual ~* '" + diretor + "' ";
				 
				 if(!coordenador.isEmpty()) 
					 q += " and CoordenadorAtual ~* '" + coordenador + "' ";
				 
				 if(!organizacao.isEmpty())
					 q += " and Organizacao_Escola ~* '" + organizacao + "' ";	
				 
				 if(!dependenciaAdm.isEmpty())
					 q += " and Dependencia_Adm ~* '" + dependenciaAdm + "'";
				 
				 if(!dsEscola.isEmpty())
					 q += " and dsEscola ~* '" + dsEscola + "'";
				 
				  
				 
			 
			 
				 
			 ps = conn.prepareStatement(q);
			 rs = ps.executeQuery();
			 
//			 System.out.println(q);
			 
			 while(rs.next()) {
				 Escola escola = new Escola();
				 
				 escola.setCdEscola(rs.getInt("cdEscola"));
				 escola.setDsEscola(rs.getString("dsEscola"));
				 escola.setDsEscolaReduzida(rs.getString("dsEscolaReduzida"));
				 escola.setCepOrg(rs.getString("cepOrg"));
				 escola.setEndOrg(rs.getString("endOrg"));
				 escola.setNumEndereco(rs.getString("numEndereco"));
				 escola.setBaiOrg(rs.getString("baiOrg"));
				 escola.setComplementoEndereco(rs.getString("ComplementoEndereco"));
				 escola.setZonaResidencia(rs.getString("ZonaResidencia"));
				 escola.setTel1Org(rs.getString("tel1Org"));
				 escola.setTel2Org(rs.getString("tel2Org"));
				 escola.setEmail(rs.getString("Email"));
				 escola.setOrganizacao_Escola(rs.getString("Organizacao_Escola"));
				 escola.setDependencia_Adm(rs.getString("Dependencia_Adm"));
				 escola.setTurnos_Oferecido(rs.getString("Turnos_Oferecido"));
				 escola.setCnpj(rs.getString("cnpj"));
				 escola.setAtoconst(rs.getString("atoconst"));
				 escola.setLivrofolha(rs.getString("livrofolha"));
				 escola.setRegmec(rs.getString("regmec"));
				 escola.setDtregmec(rs.getString("dtregmec"));
				 escola.setEntidademantenedora(rs.getString("entidademantenedora"));
				 escola.setCpf_diretor(rs.getString("cpf_diretor"));
				 escola.setDiretorAtual(rs.getString("DiretorAtual"));
				 escola.setDiretorAtualTratamento(rs.getString("DiretorAtualTratamento"));
				 escola.setMatricula_PortariaDiret(rs.getString("Matricula_PortariaDiret"));
				 escola.setEMAILDIRETOR(rs.getString("EMAILDIRETOR"));
				 escola.setCoordenadorAtual(rs.getString("CoordenadorAtual"));
				 escola.setCoordenadorAtualTratamento(rs.getString("CoordenadorAtualTratamento"));
				 escola.setMatricula_PortariaCoord(rs.getString("Matricula_PortariaCoord"));
				 escola.setSecretariaAtual(rs.getString("SecretariaAtual"));
				 escola.setSecretariaAtualTratamento(rs.getString("SecretariaAtualTratamento"));
				 escola.setMatricula_PortariaSecret(rs.getString("Matricula_PortariaSecret"));
				 escola.setGestorAtual(rs.getString("GestorAtual"));
				 escola.setGestorAtualTratamento(rs.getString("GestorAtualTratamento"));
				 escola.setMatricula_PortariaGestor(rs.getString("Matricula_PortariaGestor"));
						 
				 escolas.add(escola);
				 
//				 System.out.println("escola adicionada \n");

			 }
		 }
		 catch(SQLException ex) {
//			 System.out.println(ex); 	
		 }
		 finally {
			 ConexaoBD.close(rs, ps, conn);
		 }
	
	return escolas;
	
	}

}
