package projeto;

import java.sql.*; // importando pacote de linguagem sql


public class Conexao {

  
  public static Connection getConnection() throws SQLException, ClassNotFoundException {

        final String driver = "com.mysql.jdbc.Driver";
    
  	final String url = "jdbc:mysql://localhost:3306/projeto";

     
         String usuario = "root";
      
  	String senha = "";

      
 	 Class.forName(driver);
      
  	System.out.println("Conexao estabelecida...");

   
    	 return DriverManager.getConnection(url, usuario, senha);
    }
}
