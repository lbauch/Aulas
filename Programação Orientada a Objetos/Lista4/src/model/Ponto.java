package model;

/**
 * Classe que representa um ponto no plano 2D
 */
public class Ponto {
    
    private double x;
    private double y;

    public Ponto() {
    }
    
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
    
    public Quadrante identificarQuadrante() {
        if (getX() > 0 && getY() > 0) {
            return Quadrante.PRIMEIRO;
        } else if (getX() < 0 && getY() > 0) {
            return Quadrante.SEGUNDO;
        } else if (getX() < 0 && getY() < 0) {
            return Quadrante.TERCEIRO;
        } else if (getX() > 0 && getY() < 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }
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
    
        /**
     * Realiza o calculo da distância euclidiana deste ponto até um outro ponto
     * 
     * @param outroPonto ponto até o qual se deseja saber a distância
     * @return a distância até o ponto informado como argumento 
     */
    public double calcularDistancia(Ponto outroPonto) {
        /* Mesmo que seja possível acessar diretamente os valores de x e y do ponto2,
         * é uma boa prática utilizar os gets e set, se existirem, para acessar os dados
         * de outros objetos, mesmo que eles sejam do mesmo tipo que o objeto que
         * os está utilizando. 
         */
        
        // Calcular a diferença ao quadro dos valores de X
        double deltaX = Math.pow((getX() - outroPonto.getX()), 2);
        // Calcular a diferença ao quadro dos valores de Y
        double deltaY = Math.pow((getY() - outroPonto.getY()), 2);
        // Calcular a soma das diferenças
        double soma = deltaX + deltaY;
        // Retornar a raiz quadrada da soma
        return Math.sqrt(soma);
    }
    
    public static double calcularDistancia(Ponto p1, Ponto p2) {
        return p1.calcularDistancia(p2);
    }
    
}
