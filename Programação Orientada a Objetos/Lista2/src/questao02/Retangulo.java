package questao02;

/**
 * Classe para representar um retângulo
 */
public class Retangulo {
    
    private double lado;
    private double altura;

    /**
     * Cria um retângulo com os valores de lado e altura definidos.
     * 
     * @param lado o lado do retângulo
     * @param altura a altura do retângulo
     */
    public Retangulo(double lado, double altura) {
        /* Uso dos métodos de set para reaproveitar as validações que eles 
         * realizam, ajudando assim a mantar correto o estado do objeto criado
         */
        setLado(lado);
        setAltura(altura);
    }
    
    /**
     * Calcula a área do retâgulo
     * 
     * @return a área do retângulo
     */
    public double calcularArea() {
        return getLado() * getAltura();
    }
    
    /**
     * Calcula o perímetro do retâgulo
     * 
     * @return o perímetro do retângulo
     */
    public double calcularPerimetro() {
        return (getLado() * 2) + (getAltura() * 2);
    }

    /**
     * Retorna o lado deste objeto
     * 
     * @return o valor do lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica o lado deste objeto
     * 
     * @param lado 
     */
    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado inválido");
        }
        this.lado = lado;
    }

    /**
     * Retorna a altura deste objeto
     * 
     * @return  o valor da altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Modifica o valor da altura deste objeto
     * 
     * @param altura 
     */
    public void setAltura(double altura) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }
    
    
}
