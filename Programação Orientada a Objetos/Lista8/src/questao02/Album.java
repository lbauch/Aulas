package questao02;

public class Album extends Midia {
    
    private String nomeArtistas;
    private int faixas;

    public String getNomeArtistas() {
        return nomeArtistas;
    }

    public void setNomeArtistas(String nomeArtistas) {
        if (nomeArtistas == null || nomeArtistas.isBlank()) {
            throw new IllegalArgumentException("Nome dos Artistas Inválido");
        }
        this.nomeArtistas = nomeArtistas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        if (faixas <= 0) {
            throw new IllegalArgumentException("Número de faixas Inválido");
        }
        this.faixas = faixas;
    }
    
    
    
}
