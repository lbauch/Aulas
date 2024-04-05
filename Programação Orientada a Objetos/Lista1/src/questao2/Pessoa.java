package questao2;

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
        /* return peso / Math.pow(altura, 2);
         * 
         * Outra forma de fazer o calculo de (altura * altura) seria usando a 
         * função Math.pow(altura, 2). A função Math.pow serve para elevar o 
         * primeiro a potência do segundo argumento, então Math.pow(altura, 2)
         * quer dizer altura^2 ou seja (altura * altura).
         **/ 
    }
    
}
