package questao5;

/**
 * Classe para presentar uma pessoa
 * 
 */
public class Pessoa {
    
    double altura;
    double peso;
    String nome;
    
    /**
     * Realizar o calculo do IMC, que é dado pela formula: peso/(altura * altura)
     * 
     * @return o valor do IMC
     */
    double calcularImc() {
        return peso / (altura * altura);
    }
    
}
