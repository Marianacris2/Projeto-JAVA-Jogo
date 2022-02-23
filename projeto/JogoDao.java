
package projeto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JogoDao {

    
    
   
    public void salvar(Usuario u) {

        String sql = "INSERT INTO usuario(LOGIN, SENHA, GENERO, IDADE) VALUES (?,?,?,?)";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, u.getLogin());
            pst.setString(2, u.getSenha());
            pst.setString(3, u.getGenero());
            pst.setString(4, u.getIdade());
            pst.execute();

            pst.close();
            conn.close();

            System.out.println("Usuario salvo com sucesso...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Usuario u) {
        String sql = "UPDATE usuario SET LOGIN=?, SENHA=?, GENERO=?, IDADE=? WHERE ID=?";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, u.getLogin());
            pst.setString(2, u.getSenha());
            pst.setString(3, u.getGenero());
            pst.setString(4, u.getIdade());
            pst.setInt(5, u.getId());
            pst.executeUpdate();

            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluir(int Id) {

        String sql = "DELETE FROM usuario WHERE ID=?";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, Id);
            pst.execute();

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }
    }

    /*public Usuario consultarPorCod(int cod) {

        String sql = "SELECT * FROM cliente WHERE codigo=?";
        Usario u = new Usuario();

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, cod);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int codigo = rs.getInt("CODIGO");
                String nome = rs.getString("NOME");
                String end = rs.getString("ENDERECO");

                u = new Usuario(login, senha, genero, idade);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return c;
    }
*/

    public ArrayList<String> listarUsuarios() {

        String sql = "SELECT * FROM usuario";
        ArrayList<String> lista = new ArrayList<>();

        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String login = rs.getString("LOGIN");
                String senha = rs.getString("SENHA");
                String genero= rs.getString("GENERO");
                String idade = rs.getString("IDADE");

                lista.add("  ID: "+ id +"   |   "+"Login: "+login+"   |   "+"Senha: "+ senha+"   |   "+"Gênero: "+ genero+"  |  "+"Idade: "+ idade+"\n");
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return lista;
    }
    public ArrayList<Usuario> listarClientes() {

        String sql = "SELECT * FROM usuario";
        ArrayList<Usuario> lista = new ArrayList<>();

        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String login = rs.getString("LOGIN");
                String senha = rs.getString("SENHA");
                String genero= rs.getString("GENERO");
                String idade = rs.getString("IDADE");

                lista.add( new Usuario (id, login, senha, genero, idade));
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return lista;
    }
    

    
    public Usuario retornarClientePeloLogin(String login) {
        Usuario usuario = null;
        
        String sql = "SELECT * FROM usuario where LOGIN=?";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, login);

            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String senha= rs.getString("SENHA");
                String genero= rs.getString("GENERO");
                String idade = rs.getString("IDADE");

                usuario = new Usuario(id, login, senha, genero, idade);
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return usuario;
    }
    public ArrayList<String> listarOpinioes() {

        String sql = "SELECT * FROM opinioes,usuario";
        ArrayList<String> listaOpinioes = new ArrayList<>();
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            Date d = new Date(System.currentTimeMillis());
            java.util.Date dateJava = new java.util.Date(d.getTime());
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("ID");
                int idFK = rs.getInt("ID_FK");
                String opiniao = rs.getString("OPINIao");
                Date dt_opiniao = rs.getDate("DT_OPINIAO");
                if(idFK==idUsuario){
                    String login = rs.getString("LOGIN");
                    listaOpinioes.add("Data: "+dt_opiniao+ " | "+"Autor: "+login+" | "+"FeedBack"+opiniao+"\n" );
                }
                
            }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return listaOpinioes;
    }
    public void salvarOpiniao(Usuario u, String opiniao) {
        
        String sql = "INSERT INTO opinioes VALUES (?,?,?)";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);

            
           
            
            
            pst.setString(1, opiniao);
            pst.setInt(2, u.getId());
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.execute();

            pst.close();
            conn.close();

            System.out.println("Opiniao salva com sucesso...");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Opinião salva com sucesso...");
    }
    
    public void salvarAvaliacao(Usuario u,int cod_final, int estrelas) {
        
        String sql = "INSERT INTO feedback VALUES (?,?,?,?) ";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, u.getId());
            pst.setInt(2, cod_final);
            pst.setInt(3, estrelas);
            pst.setDate(4, new Date(System.currentTimeMillis()));
            
            pst.execute();

            pst.close();
            conn.close();

            System.out.println("avaliação salva com sucesso...");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public ArrayList<String>  getAvaliacoes() {
        ArrayList <String> getAvaliacao = new ArrayList<>();
        int idFk = 0;
        int cod_final = 0;
        int idUsuario = 0;
        int codJogo = 0;
        int codFk = 0;
        Date data = null;
        int estrelas = 0;
        
        String sql = "SELECT * FROM FEEDBACK, USUARIO, JOGO";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            Date d = new Date(System.currentTimeMillis());
            java.util.Date dateJava = new java.util.Date(d.getTime());
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 idFk = rs.getInt("ID_FK");
                 idUsuario = rs.getInt("ID");
                 codFk = rs.getInt("COD_FINAL_FK");
                 codJogo = rs.getInt(("COD_FINAL"));
                 estrelas = rs.getInt("ESTRELAS");
                 data = rs.getDate("DT_FEEDBACK");
                 
                 if (idFk == idUsuario){
                     String login = rs.getString("LOGIN");
                     if (codFk == codJogo){
                         String nomeJogo = rs.getString("NOME");
                         getAvaliacao.add("  Quantidade de estrelas: "+estrelas+ " | "+"Autor: "+login+" | "+"Jogo: "+nomeJogo+"\n" );
                     }
                
            }
                 
                 
                }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return getAvaliacao;
    }
    
    public String getNomeJogo(int cod_final) {
        String nomedoJogo = null;
        String sql = "SELECT NOME FROM jogo where cod_final=?";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cod_final);
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 nomedoJogo = rs.getString("NOME");
                 
                }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return nomedoJogo;
    }
    public ArrayList<String>  getHistorico() {
        ArrayList <String> getHistoricos = new ArrayList<>();
        int idFk = 0;
        int cod_final = 0;
        int idUsuario = 0;
        int codJogo = 0;
        int codFk = 0;
        Date data = null;
        String sql = "SELECT * FROM CONSULTA, USUARIO, JOGO";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            Date d = new Date(System.currentTimeMillis());
            java.util.Date dateJava = new java.util.Date(d.getTime());
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 idFk = rs.getInt("ID_FK");
                 idUsuario = rs.getInt("ID");
                 codFk = rs.getInt("COD_FINAL_FK");
                 codJogo = rs.getInt(("COD_FINAL"));
                 data = rs.getDate("DT_PARTIDA");
                 
                 if (idFk == idUsuario){
                     String login = rs.getString("LOGIN");
                     if (codFk == codJogo){
                         String nomeJogo = rs.getString("NOME");
                         getHistoricos.add("Data: "+data+ " | "+"Autor: "+login+" | "+"Jogo: "+nomeJogo+" | "+ " Tipo de final: "+codFk+ "\n" );
                     }
                
            }
                 
                 
                }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return getHistoricos;
    }
    public void salvarHistorico(Usuario u, int j) {
        
        String sql = "INSERT INTO consulta VALUES (?,?,?)";

        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, u.getId());
            pst.setInt(2, j);
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.execute();
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 int id = rs.getInt("ID");
                 
                 
                }

            pst.close();
            conn.close();

            System.out.println("Historico salvo com sucesso...");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    public ArrayList <String> getNomeUsuario() {
        String nomeDoUsuario = null;
        ArrayList <String> arrayList = new ArrayList <>();
        
        String sql = "SELECT LOGIN FROM USUARIO";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 nomeDoUsuario = rs.getString("LOGIN");
                 arrayList.add(nomeDoUsuario);
                }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return arrayList;
    }
    public ArrayList<Integer>  setNumeroEstrelas(Usuario u) {
        ArrayList <Integer> getAvaliacao = new ArrayList<>();
        
        int estrelas = 0;
        int idAux = u.getId();
        String sql = "UPDATE FEEDBACK SET ESTRELAS=2 WHERE ID_FK=?";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setInt(1, u.getId());
            pst.executeUpdate();
            
            
            

            

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return getAvaliacao;
    }
     public ArrayList <Integer> getNumeroEstrelas(Usuario u) {
        int estrelas = 0;
        ArrayList <Integer> arrayList = new ArrayList <>();
        
        String sql = "SELECT estrelas FROM feedback where id_fk=?";
        
        
        try {

            Connection conn = Conexao.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, u.getId());
            ResultSet rs = pst.executeQuery();
            

            while (rs.next()) {
                 estrelas = rs.getInt("ESTRELAS");
                 arrayList.add(estrelas);
                }

            pst.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }

        return arrayList;
    }
     
    
}

