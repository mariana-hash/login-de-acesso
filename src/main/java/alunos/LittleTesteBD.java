package alunos;

//import java.security.NoSuchAlgorithmException;
//import java.sql.Connection;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Properties;
//
//import javax.naming.Context;
//import javax.naming.directory.DirContext;
//import javax.naming.directory.InitialDirContext;
//
//import conexoes.AutUsuLdap;
//import conexoes.ConexaoBD;
//import dao.AlunoDAO;
//import dao.EscolaDAO;
//import dao.LogDAO;
//import dao.UsuarioDAO;
//import util.Senha;
//import alunos.AlunoMB;

public class LittleTesteBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		AutUsuLdap.autUsu("teste", "@teste01");
		
//		
//		try {
//			Properties env = new Properties();
//			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//			env.put(Context.PROVIDER_URL, "ldap://SRV-AD:389");
//			env.put(Context.SECURITY_PRINCIPAL, "cn=teste, dc=adsefaz, dc=gov");  //check the DN correctly
//			env.put(Context.SECURITY_CREDENTIALS, "@teste01");
//			DirContext con = new InitialDirContext(env);
//			System.out.println("success");
//			con.close();
//		
//		}catch (Exception e) {
//			System.out.println("failed: "+e.getMessage());
//		}
//		
		
//		Connection conn = ConexaoBD.open();
//		 PreparedStatement ps = null;
//		 ResultSet rs = null;
//		
//		 
//		 try { 
//	        ps = conn.prepareStatement("Select * from amostra_001");
//	        rs = ps.executeQuery("Select * from amostra_001");
//	        
//	        
//	        	System.out.println(rs.getString(2) + " coluna 2");
//	        
//	        
//	        
//	        
//    } catch (SQLException ex) {
//    } finally {
//        ConexaoBD.close(rs, ps, conn);
//    }
	
	
//		AlunoMB alunos = new AlunoMB();
//		alunos.getlistaCompleta("");
//		alunos.validarAcesso("TI");
		
//		UsuarioDAO usuario = new UsuarioDAO();
//		try {
//			usuario.criarUsuario("qualquer", "1");
//		} catch (LdapConnectionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (AuthenticationFailedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		AlunoDAO aluno = new AlunoDAO();
//		String cpf = "";
//		String nome = "";
//		String mae = "";
//		String data = "";
//		aluno.getListaAluno(cpf, nome, mae, data);
		
//		EscolaDAO escola = new EscolaDAO();
//		escola.getListaEscola("", "", "");
		
//		try {
//			System.out.println(Senha.hashSenha("1"));
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//        LogMB log = new LogMB();
//        LogDAO dao = new LogDAO();
//        java.util.Date data = new java.util.Date();  
//        java.sql.Date dataSql = new java.sql.Date(data.getTime());
//        log.novoAcessoAlunos("aushafgau", data.toString());
//        dao.criarLog("ufhauis", "acesso", data.toString());
//        System.out.println(data.toString());

		
//		AlunoDAO aluno = new AlunoDAO();
//		aluno.getListaAluno();
		
		
/*		Connection conn = ConexaoBD.open();
		
		try {
			
			String q = "";
			q += "Select * from usuario";
			PreparedStatement st = conn.prepareStatement(q);
			ResultSet rs = st.executeQuery(q);
			
			
			int i = 1;
			while(rs.next()) {
				while(rs.getString(i) != null) {
					System.out.println(rs.getString(i) + " ");
					i++;
				}
				
				 * for(int i = 1; i < rs.getString();i++) {
				 * 
				 * }
				 
				System.out.println("\n");
			}
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			
			ConexaoBD.close(conn);
		}
*/
		
	}

}
