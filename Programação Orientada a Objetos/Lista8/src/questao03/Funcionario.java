package questao03;

public class Funcionario extends Pessoa {
    
    private double salarioBase;
    private double porcentageDesconto;
    
    /**
     * Exemplo de construtor padrão suprindo um valor 
     * para o construtor da super classe
     */
    public Funcionario() {
        super("Desconhecido");
    }

    /**
     * Exemplo de construtor requisitando um valor para poder passar ele 
     * para a super classe
     * 
     * @param nome 
     */
    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("Salário base inválido");
        }
        this.salarioBase = salarioBase;
    }

    public double getPorcentageDesconto() {
        return porcentageDesconto;
    }

    public void setPorcentageDesconto(double porcentageDesconto) {
        if (porcentageDesconto < 0 || porcentageDesconto > 1) {
            throw new IllegalArgumentException("Porcentagem de desconto inválida");
        }
        this.porcentageDesconto = porcentageDesconto;
    }
    
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getPorcentageDesconto());
    }

}
