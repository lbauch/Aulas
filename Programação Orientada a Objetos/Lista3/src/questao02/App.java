package questao02;

import java.util.Scanner;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Digite o comprimento do retângulo");
        retangulo.setComprimento(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("Digite a altura do retângulo");
        retangulo.setAltura(Integer.parseInt(scanner.nextLine()));
        
        System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        
        scanner.close();
    }
    
}
