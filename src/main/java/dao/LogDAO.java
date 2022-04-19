package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import alunos.Log;
import conexoes.ConexaoBD;

public class LogDAO {
	
	public List<Log> getLog() {
		
		 Connection conn = ConexaoBD.open();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 
		 List<Log> logs = new ArrayList<Log>();
		 
		 try {
	         ps = conn.prepareStatement("select * from planilha.historico");
	         rs = ps.executeQuery();
	         if (rs.next()) {
	        	 
	        	 Log log = new Log();
	        	 
	        	 log.setLogin((rs.getString("login")));
	        	 log.setAcao((rs.getString("acao")));
	        	 log.setData((rs.getString("data")));
	        	 
	             logs.add(log);
	         }
	     } catch (SQLException ex) {
	     } finally {
	         ConexaoBD.close(rs, ps, conn);
	     }
	    
		 

//	    	AutUsuLdap.autUsu(login, null);
		 
		 return logs;
		}
	
	public boolean criarLog(String login, String acao, String data) {
		
		 Connection conn = ConexaoBD.open();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 try {
	         ps = conn.prepareStatement("insert into planilha.historico "
		         		+ "values ('" + login + "', '" + acao + "', '" + data + "')");
	         
//	         System.out.println("log inserido");
	         
	         ps.executeUpdate();
	         return true;
		
		 }
		 catch(SQLException ex) {
//			 System.out.println(ex);
		 }
		 finally {
	         ConexaoBD.close(rs, ps, conn);
	     }
		 
		 return false;
	}

}
