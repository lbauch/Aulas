package questao03;

/**
 * Classe que representa um ponto no plano 2D
 */
public class Ponto {
    
    private double x;
    private double y;
    
    /**
     * Cria um ponto com coordenadas (x, y).
     * 
     * @param x a posição no eixo de X do ponto
     * @param y a posição no eixo de Y do ponto
     */
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    /**
     * Realiza o calculo da distância euclidiana deste ponto até um outro ponto
     * 
     * @param ponto2 ponto até o qual se deseja saber a distância
     * @return a distância até o ponto informado como argumento 
     */
    public double calcularDistanciaEuclidiana(Ponto ponto2) {
        /* Mesmo que seja possível acessar diretamente os valores de x e y do ponto2,
         * é uma boa prática utilizar os gets e set, se existirem, para acessar os dados
         * de outros objetos, mesmo que eles sejam do mesmo tipo que o objeto que
         * os está utilizando. 
         */
        
        // Calcular a diferença ao quadro dos valores de X
        double deltaX = Math.pow((getX() - ponto2.getX()), 2);
        // Calcular a diferença ao quadro dos valores de Y
        double deltaY = Math.pow((getY() - ponto2.getY()), 2);
        // Calcular a soma das diferenças
        double soma = deltaX + deltaY;
        // Retornar a raiz quadrada da soma
        return Math.sqrt(soma);
    }
    
    /**
     * Verifica se o ponto está sobre o eixo X
     * 
     * @return true se o Ponto estiver sobre o eixo X, false caso contrário
     */
    public boolean estaIncidindoSobreX() {
        return getX() == 0;
    }
    
    /**
     * Verifica se o ponto está sobre o eixo Y
     * 
     * @return true se o Ponto estiver sobre o eixo Y, false caso contrário
     */
    public boolean estaIncidindoSobreY() {
        return getY() == 0;
    }
    
}
