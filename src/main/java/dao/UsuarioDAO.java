package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import alunos.Usuario;
import conexoes.ConexaoBD;

public class UsuarioDAO {

	public Usuario getSingle(String login) {
	
	 Connection conn = ConexaoBD.open();
	 PreparedStatement ps = null;
	 ResultSet rs = null;
	 try {
         ps = conn.prepareStatement("select * from planilha.usuario where login = ?");
         ps.setString(1, login);
         rs = ps.executeQuery();
         if (rs.next()) {
             return new Usuario(rs.getString("login"), rs.getString("senha"));
         }
     } catch (SQLException ex) {
     } finally {
         ConexaoBD.close(rs, ps, conn);
     }
    
	 

//    	AutUsuLdap.autUsu(login, null);
	 
	 return null;
	}
	
	public boolean criarUsuario(String login, String senha){
		
		 Connection conn = ConexaoBD.open();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 try {
	         ps = conn.prepareStatement("insert into planilha.usuario "
	         		+ "values ('" + login + "', MD5('" + senha + "'))");
//	         		+ " values (?, ?)");
//	         ps.setString(1, login);
//	         ps.setString(2, senha);
	         ps.executeUpdate();
//	         System.out.println("usuario criado");
	         return true;
	     } catch (SQLException ex) {
//	    	 System.out.println(ex);
	     }
	      finally {
	         ConexaoBD.close(rs, ps, conn);
	     }
	    
//		 System.out.println(rs);
		 
		 
		 return false;

//	    	AutUsuLdap.autUsu(login, null);
		 
		}
	
	public boolean resetarUsuario(String login, String senha) {
		
		 Connection conn = ConexaoBD.open();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 try {
	         ps = conn.prepareStatement("delete from planilha.usuario "
	         		+ "where login like '" + login + "'");
//	         		+ " values (?, ?)");
//	         ps.setString(1, login);
//	         ps.setString(2, senha);
	         ps.executeUpdate();
//	         System.out.println("usuario criado");
	     } catch (SQLException ex) {
//	    	 System.out.println(ex);
	     }
	      finally {
	         ConexaoBD.close(rs, ps, conn);
	     }
		 
		 return criarUsuario(login, senha);
	}

	/*
	 * public Usuario getSingle(Object... chave) { if (chave[0] instanceof Integer)
	 * { Connection conn = ConexaoBD.open(); PreparedStatement ps = null; ResultSet
	 * rs = null; try { ps = conn.prepareStatement("select usu_codigo," +
	 * "usu_nome," + "usu_login, usu_senha, usu_adm from usuario" +
	 * "where usu_codigo = ?"); ps.setInt(1, (Integer) chave[0]); rs =
	 * ps.executeQuery(); if (rs.next()) { return new
	 * Usuario(rs.getInt("usu_codigo"), rs.getString("usu_nome"),
	 * rs.getString("usu_login"), rs.getString("usu_senha"),
	 * rs.getBoolean("usu_adm")); } } catch (SQLException ex) { } finally {
	 * ConexaoBD.close(rs, ps, conn); } } return null; }
	 */

	/*
	 * public List<Usuario> getList() { return getList(0); }
	 */

	/*
	 * public List<Usuario> getList(int top) { if (top < 0) { return null; }
	 * List<Usuario> lista = null; Connection conn = ConexaoBD.open(); Statement ps
	 * = null; ResultSet rs = null; try { ps = conn.createStatement(); rs =
	 * ps.executeQuery("select " + (top > 0 ? "top " + top : "") +
	 * "usu_codigo, usu_nome, usu_login, usu_senha," + "usu_adm from usuario");
	 * lista = new ArrayList<>(); while (rs.next()) { lista.add(new
	 * Usuario(rs.getInt("usu_codigo"), rs.getString("usu_nome"),
	 * rs.getString("usu_login"), rs.getString("usu_senha"),
	 * rs.getBoolean("usu_adm"))); } } catch (SQLException ex) { } finally {
	 * ConexaoBD.close(rs, ps, conn); } return lista; }
	 */
}
