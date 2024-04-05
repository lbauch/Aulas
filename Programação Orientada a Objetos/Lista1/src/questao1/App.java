package questao1;

/**
 * Classe para executar o Exercício 1
 */
public class App {
    
    public static void main(String[] args) {
        
        // Instanciando um obsejto de Retangulo
        Retangulo retangulo = new Retangulo();
        
        // Atribuindo um lado e uma altura
        retangulo.lado = 4;
        retangulo.altura = 3;
        
        // Exibindo a área e perímetro
        System.out.println("Area do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        
        /* Esta parte não foi pedida no exercício, mas isto representa uma 
         * modificação de estado do objeto de retângulo criado, pois estamos 
         * modificando a altura do mesmo.
         */
        retangulo.altura = 4;
        
        // Exibindo a nova área e o novo perímetro
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
        
    }
    
}
