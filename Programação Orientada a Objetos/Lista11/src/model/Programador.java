package model;

import java.util.ArrayList;

/**
 *
 * @author evand
 */
public class Programador extends Funcionario{
    
    private ArrayList<String> linguagens = new ArrayList<>();
    
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }

    @Override
    public double calcularSalario() {
//        boolean sabeJava = linguagens.contains("Java");
        boolean sabeJava = false;
        for (String linguagem : linguagens) {
            if (linguagem.equalsIgnoreCase("java")) {
                sabeJava = true;
                break;
            }
        }
        double salario = getSalarioBase();
        if(sabeJava) {
            salario *= 1.2;
        }
        return salario; 
    }

    @Override
    public String toString() {
        return super.toString() + " Linguagens " + getLinguagens();
    }

    
    
}
