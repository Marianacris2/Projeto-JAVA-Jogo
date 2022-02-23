
package projeto;


public class Usuario {
    private String login, senha, genero, idade;
    private int  id;
    
    public Usuario(int id, String login, String senha, String genero, String idade){
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.genero = genero;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void exibirDados(){
        
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + getLogin() + ", senha=" + senha + ", genero=" + genero + ", idade=" + idade + ", id=" + id + '}';
    }
    
    
}
