package questao1;

/**
 * Classe para representar um retângulo
 * 
 */
public class Retangulo {
    
    double lado;
    double altura;
    
    /**
     * Calcula a área do retâgulo
     * 
     * @return a área do retângulo
     */
    double calcularArea() {
        return lado * altura;
    }
    
    /**
     * Calcula o retângulo do retâgulo
     * 
     * @return o perímetro do retângulo
     */
    double calcularPerimetro() {
        return (lado * 2) + (altura * 2);
    }
}
