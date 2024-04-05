package model;

/**
 *
 * @author evand
 */
public class Funcionario {
    
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
//        return getSalarioBase();
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome " + getNome() 
                    + " Salário: " + calcularSalario();
    }
    
    
    
}
