package questao1;

/**
 *
 * @author evand
 */
public class Professor {
    
    private String nome;
    private Titulacao titulo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulacao getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulacao titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
