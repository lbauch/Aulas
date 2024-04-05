package questao3;

/**
 * Classe para presentar uma pessoa
 * 
 */
public class Pessoa {
    
    double altura;
    double peso;
    
    /**
     * Realizar o calculo do IMC, que é dado pela formula: peso/(altura * altura)
     * 
     * @return o valor do IMC
     */
    double calcularImc() {
        return peso / (altura * altura);
    }
    
}
