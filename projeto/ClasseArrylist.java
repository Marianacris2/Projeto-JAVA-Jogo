
package projeto;

import java.util.ArrayList;
import java.util.Scanner;
public class ClasseArrylist {
    ArrayList<Usuario> ArrayUsuario = new ArrayList<>();
    
    Scanner entrada = new Scanner(System.in);
    JogoDao bdd = new JogoDao();
    
    public ClasseArrylist() {
        ArrayUsuario = bdd.listarClientes();
    }
    
    public void removerUSuario(Usuario usuario){
         bdd.excluir(usuario.getId());
    }
    public void atualizarDados(Usuario usuario){
        bdd.atualizar(usuario);
    }

    public void adicionarUsuario(Usuario usuario) {
        ArrayUsuario.add(usuario);
         bdd.salvar(usuario);
         
    }
    public int getSize(){
        return ArrayUsuario.size();
    }
    public String getArray(int i){
            return ArrayUsuario.get(i).getLogin();
    }
    
//    public ArrayList getNome(){
//        return ArrayList
//    }
}  
//        public static void main(String[] args) {
//               ClasseArrylist CAL = new ClasseArrylist ();
//               CAL.adicionarUsuario();
               
//               CAL.removerUSuario();
//        }
        
//    }
   
