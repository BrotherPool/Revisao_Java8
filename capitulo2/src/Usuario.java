

public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos){
        this.nome=nome;
        this.pontos=pontos;
        this.moderador=false;
    }

    public Usuario(String nome){
        this.nome=nome;
    }

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Usuário "+ this.nome;
    }

    public int getPontos() {
        return pontos;
    }
    public void tornaModerador(){
        this.moderador=true;
    }

    public boolean isModerador() {
        return moderador;
    }
}
