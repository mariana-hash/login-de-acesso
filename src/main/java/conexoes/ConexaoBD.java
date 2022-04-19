package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

//import com.sun.org.slf4j.internal.Logger;

public class ConexaoBD {
	
	private static final String usuario = "postgres";
	private static final String senha = "postgres@Sefaz123";
	private static final String url = "jdbc:postgresql://localhost:5432/postgres";
	
//	private static boolean conectado = false;
	
	public static Connection open() {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, usuario, senha);
		}
		
		catch (SQLException | ClassNotFoundException ex) {
			
			java.util.logging.Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}
	
	public static void close(ResultSet rs, Statement st, Connection conn) {
		
		if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
	}
	
	 public static void close(Statement st, Connection conn) {
	        close(null, st, conn);
	    }

	    public static void close(Connection conn) {
	        close(null, null, conn);
	    }
	    
//	    public static boolean conectado() {
//	    	return conectado;
//	    }

}
