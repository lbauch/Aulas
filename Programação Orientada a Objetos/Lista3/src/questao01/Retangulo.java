package questao01;

/**
 *
 * @author evand
 */
public class Retangulo {
    
    private int altura;
    private int comprimento;

    public Retangulo() {
    }

    public Retangulo(int comprimento, int altura) {
        setComprimento(comprimento);
        setAltura(altura);
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro() {
        return (getAltura() * 2) + (getComprimento() * 2);
    }
    
    public int calcularArea() {
        return getAltura() * getComprimento();
    }
    
}
