package questao2.model;

import java.io.Serializable;

public abstract class Midia implements Serializable{
    
    private String titulo;
    private double duracao;
    private int anoLancamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Titulo Inválido");
        }
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("Duração Inválida");
        }
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento <= 0) {
            throw new IllegalArgumentException("Ano de lançamento Inválido");
        }
        this.anoLancamento = anoLancamento;
    }
    
    
    
}
