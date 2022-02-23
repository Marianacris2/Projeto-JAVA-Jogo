
package projeto;

import musicas.Musica;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Jogo extends JFrame{
    private String sinopse, nome;
    private int codigoJogo;
    private int vetorCodigo[]; 
//    Musica musica = new Musica();
//    
//    public Jogo(){
//        musica.play("bostinha");
//    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoJogo() {
        return codigoJogo;
    }

    public void setCodigoJogo(int codigoJogo) {
        this.codigoJogo = codigoJogo;
    }

    public int[] getVetorCodigo() {
        return vetorCodigo;
    }

    public void setVetorCodigo(int[] vetorCodigo) {
        this.vetorCodigo = vetorCodigo;
    }
    
    
    
    
    
}
