package questao6;

/**
 * Classe que representa um ponto no plano 2D
 */
public class Ponto {
    
    double x;
    double y;
    
    /**
     * Realiza o calculo da distância euclidiana deste ponto até um outro ponto
     * 
     * @param ponto2 ponto até o qual se deseja saber a distância
     * @return 
     */
    double calcularDistanciaEuclidiana(Ponto ponto2) {
        // Calcular a diferença ao quadro dos valores de X
        double deltaX = Math.pow((x - ponto2.x), 2);
        // Calcular a diferença ao quadro dos valores de Y
        double deltaY = Math.pow((y - ponto2.y), 2);
        // Calcular a soma das diferenças
        double soma = deltaX + deltaY;
        // Retornar a raiz quadrada da soma
        return Math.sqrt(soma);
    }
    
}
