package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import alunos.Aluno;
import conexoes.ConexaoBD;

public class AlunoDAO {
	

	public AlunoDAO() {
		
	}

	public Aluno getAluno(int id) {
		// TODO Auto-generated method stub
		return getListaAluno(null, null, null, null).get(id);
	}

	
	
	public List<Aluno> getListaAluno(String cpf, String nomeAluno, String nomeMae, String dataNascimento) {
		Connection conn = ConexaoBD.open();
		
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 String q = "";
		 
		 List<Aluno> alunos = new ArrayList<Aluno>();
		 
		 
		 try {
			 
			 q = "Select * from planilha.alunos where nome like '%' ";
			 
//			 if(cpf != null || nomeAluno != null || nomeMae != null || dataNascimento != null) {
//				 if(cpf != "" || nomeAluno != "" || nomeMae != "" || dataNascimento != "") {
					 
					 
					 

					 if(!cpf.isEmpty()) 
						 q += " and CPF ~* '" + cpf + "' ";
					 if(!nomeAluno.isEmpty()) 
						 q += " and NOME ~* '" + nomeAluno + "' ";
					 if(!nomeMae.isEmpty()) 
						 q += " and MAE ~* '" + nomeMae + "' ";
					 if(!dataNascimento.isEmpty()) 
						 q += " and NASCIMENTO ~* '" + dataNascimento + "'";

//				 }
			 
//			 System.out.println(q);
			 
	        ps = conn.prepareStatement(q);
	        rs = ps.executeQuery();
	        
	        while(rs.next())	{
	        	
	        	Aluno aluno = new Aluno();
	        	
	        	aluno.setNOME(rs.getString("NOME"));
	        	aluno.setNASCIMENTO(rs.getString("NASCIMENTO"));
	        	aluno.setNIS_ALUNO(rs.getString("NIS_ALUNO"));
	        	aluno.setSEXO(rs.getString("SEXO"));
	        	aluno.setEMAIL(rs.getString("EMAIL"));
	        	aluno.setNACIONALIDADE(rs.getString("NACIONALIDADE"));
	        	aluno.setCPF(rs.getString("CPF"));
	        	aluno.setRG_ALUNO(rs.getString("RG_ALUNO"));
	        	aluno.setORGAO_ESPEDITOR(rs.getString("ORGAO_ESPEDITOR"));
	        	aluno.setUF_ORGAO(rs.getString("UF_ORGAO"));
	        	aluno.setDATA_REGISTRO(rs.getString("DATA_REGISTRO"));
	        	aluno.setCARTEIRA_RESEVISTA(rs.getString("CARTEIRA_RESEVISTA"));
	        	aluno.setCEP_ENDEREÇO(rs.getString("CEP_ENDEREÇO"));
	        	aluno.setENDEREÇO(rs.getString("ENDEREÇO"));
	        	aluno.setNUMERO(rs.getString("NUMERO"));
	        	aluno.setBAIRRO(rs.getString("BAIRRO"));
	        	aluno.setCOMPLEMENTO(rs.getString("COMPLEMENTO"));
	        	aluno.setCIDADE(rs.getString("CIDADE"));
	        	aluno.setFONE_1(rs.getString("FONE_1"));
	        	aluno.setFONE_2(rs.getString("FONE_2"));
	        	aluno.setZONA_RESIDENCIA(rs.getString("ZONA_RESIDENCIA"));
	        	aluno.setPAI(rs.getString("PAI"));
	        	aluno.setRG_PAI(rs.getString("RG_PAI"));
	        	aluno.setORGAO_ESPEDITOR_PAI(rs.getString("ORGAO_ESPEDITOR_PAI"));
	        	aluno.setUF(rs.getString("UF"));
	        	aluno.setDATA_REGISTRO_0(rs.getString("DATA_REGISTRO1"));
	        	aluno.setCPF_PAI(rs.getString("CPF_PAI"));
	        	aluno.setNIS_PAI(rs.getString("NIS_PAI"));
	        	aluno.setMAE(rs.getString("MAE"));
	        	aluno.setRG_MAE(rs.getString("RG_MAE"));
	        	aluno.setORGAO_ESPEDITOR(rs.getString("ORGAO_ESPEDITOR1"));
	        	aluno.setUF0(rs.getString("UF1"));
	        	aluno.setCPF_MAE(rs.getString("CPF_MAE"));
	        	aluno.setNIS_MAE(rs.getString("NIS_MAE"));
	        	
	        	alunos.add(aluno);
	        	
//	        	System.out.println("Aluno adicionado \n");
	        		        	
	        }
	    } catch (SQLException ex) {
//	    	System.out.println(ex);
	    } finally {
//	    	System.out.println("conectado: " + ConexaoBD.conectado());
	        ConexaoBD.close(rs, ps, conn);
	    }
		 
		 
		 return alunos;
		 
	}
	
//	public List<Aluno> getListaAluno() {
//		Connection conn = ConexaoBD.open();
//		
//		 PreparedStatement ps = null;
//		 ResultSet rs = null;
//		 
//		 List<Aluno> alunos = new ArrayList<Aluno>();
//		 
//		 
//		 try {
//	        ps = conn.prepareStatement("Select * from amostra_001");
//	        rs = ps.executeQuery();
//	        
//	        while(rs.next())	{
//	        	
//	        	Aluno aluno = new Aluno();
//	        	
//	        	aluno.setBAIRRO(rs.getString("BAIRRO"));
//	        	aluno.setCARTEIRA_RESERVISTA(rs.getString("CARTEIRA RESEVISTA"));
//	        	aluno.setCARTORIO_REGISTRO(rs.getString("CARTOTIO REGISTRO"));
//	        	aluno.setCEP_ENDEREÇO(rs.getString("CEP ENDEREÇO"));
//	        	aluno.setCIDADE(rs.getString("CIDADE"));
//	        	aluno.setCIDADE_CARTORIO(rs.getString("CIDADE CARTORIO"));
//	        	aluno.setCOMPLEMENTO(rs.getString("COMPLEMENTO"));
//	        	aluno.setCOR(rs.getString("COR"));
//	        	aluno.setCPF(rs.getString("CPF"));
//	        	aluno.setCPF_MAE(rs.getString("CPF MAE"));
//	        	aluno.setCPF_PAI(rs.getString("CPF PAI"));
//	        	aluno.setCURSO(rs.getString("CURSO"));
//	        	aluno.setDATA_EXPEDIÇAO(rs.getString("DATA EXPEDIÇÃO"));
//	        	aluno.setDATA_REGISTRO(rs.getString("DATA REGISTRO"));
//	        	aluno.setDATA_REGISTRO0(rs.getString("DATA REGISTRO_[0]"));
//	        	aluno.setDATA_REGISTRO1(rs.getString("DATA REGISTRO_[1]"));
//	        	aluno.setDATA_SITUACAO(rs.getString("DATA SITUACAO"));
//	        	aluno.setEMAIL(rs.getString("E-MAIL"));
//	        	aluno.setENDEREÇO(rs.getString("ENDEREÇO"));
//	        	aluno.setESCOLA(rs.getString("ESCOLA"));
//	        	aluno.setFOLHA(rs.getString("FOLHA"));
//	        	aluno.setFONE_1(rs.getString("FONE 1"));
//	        	aluno.setFONE_2(rs.getString("FONE 2"));
//	        	aluno.setID_ALUNO(rs.getInt("ID ALUNO"));
//	        	aluno.setID_ESCOLA(rs.getInt("ID ESCOLA"));
//	        	aluno.setIDALUNO(rs.getString("IDALUNO"));
//	        	aluno.setJUSTIFICATIVA_FALTA_DOCUMENTO(rs.getString("JUSTIFICATIVA FALTA DOCUMENTO"));
//	        	aluno.setLIVRO(rs.getString("LIVRO"));
//	        	aluno.setMAE(rs.getString("MAE"));
//	        	aluno.setMATRICULA_ATUAL(rs.getInt("MATRICULA ATUAL"));
//	        	aluno.setMATRICULA_ORIGEM_1(rs.getString("MATRICULA ORIGEM 1"));
//	        	aluno.setMATRICULA_ORIGEM_2(rs.getString("MATRICULA ORIGEM 2"));
//	        	aluno.setMODELO(rs.getString("MODELO"));
//	        	aluno.setNACIONALIDADE(rs.getString("NACIONALIDADE"));
//	        	aluno.setNASCIMENTO(rs.getString("NASCIMENTO"));
//	        	aluno.setNECESSIDADE_TIPO_1(rs.getString("NESCEDIDADE TIPO 1"));
//	        	aluno.setNECESSIDADE_TIPO_2(rs.getString("NESCECIDADE TIPO 2"));
//	        	aluno.setNIS_ALUNO(rs.getString("NIS ALUNO"));
//	        	aluno.setNIS_MAE(rs.getString("NIS MAE"));
//	        	aluno.setNIS_PAI(rs.getString("NIS PAI"));
//	        	aluno.setNOME(rs.getString("NOME"));
//	        	aluno.setNUMERO(rs.getString("NUMERO"));
//	        	aluno.setNUMERO_CERTIDAO(rs.getString("NUMERO CERTIDAO"));
//	        	aluno.setORGAO_EXPEDITOR(rs.getString("ORGÃO ESPEDITOR"));
//	        	aluno.setORGAO_EXPEDITOR0(rs.getString("ORGÃO ESPEDITOR_[0]"));
//	        	aluno.setORGAO_EXPEDITOR_PAI(rs.getString("ORGÃO ESPEDITOR PAI"));
//	        	aluno.setPAI(rs.getString("PAI"));
//	        	aluno.setRG_ALUNO(rs.getString("RG ALUNO"));
//	        	aluno.setRG_MAE(rs.getString("RG MAE"));
//	        	aluno.setRG_PAI(rs.getString("RG PAI"));
//	        	aluno.setSERIE(rs.getString("SERIE"));
//	        	aluno.setSEXO(rs.getString("SEXO"));
//	        	aluno.setSITUACAO(rs.getString("SITUAÇÃO"));
//	        	aluno.setTIPO_CERTIDAO(rs.getString("TIPO CERTIDAO"));
//	        	aluno.setTIPO_NECESSIDADE(rs.getString("TIPO NESCECIDADE"));
//	        	aluno.setTURMA(rs.getString("TURMA"));
//	        	aluno.setTURNO(rs.getString("TURNO"));
//	        	aluno.setUF(rs.getString("UF"));
//	        	aluno.setUF0(rs.getString("UF_[0]"));
//	        	aluno.setUF_CIDADE_CARTORIO(rs.getString("UF CIDADE CARTORIO"));
//	        	aluno.setUF_ORGAO(rs.getString("UF ORGÃO"));
//	        	aluno.setUTILIZA_TRANSPORTE(rs.getString("UTILIZA TRANSPORTE"));
//	        	aluno.setZONA_RESIDENCIA(rs.getString("ZONA RESIDENCIA"));
//	        	
//	        	alunos.add(aluno);
//	        		        	
//	        }
//	    } catch (SQLException ex) {
//	    } finally {
////	    	System.out.println("conectado: " + ConexaoBD.conectado());
//	        ConexaoBD.close(rs, ps, conn);
//	    }
//		 
//		 
//		 return alunos;
//		 
//	}
	
	
			


}
