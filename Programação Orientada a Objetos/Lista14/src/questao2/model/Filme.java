package questao2.model;

public class Filme extends Midia{
    
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        if (diretor == null || diretor.isBlank()) {
            throw new IllegalArgumentException("Diretor Inválido");
        }
        this.diretor = diretor;
    }
    
}
