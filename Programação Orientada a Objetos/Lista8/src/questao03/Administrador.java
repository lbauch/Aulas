package questao03;

public class Administrador extends Funcionario {
    
    private double ajudaCusto;

    /**
     * Exemplo de construtor requisitando um valor para poder passar ele 
     * para a super classe
     * 
     * @param nome 
     */
    public Administrador(String nome) {
        super(nome);
    }

    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        if (ajudaCusto <= 0) {
            throw new IllegalArgumentException("Ajuda de custo inválida");
        }
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getAjudaCusto(); 
    }
    
}
