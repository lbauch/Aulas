package questao02;

import java.util.Scanner;

/**
 *
 * Classe para executar o Exercício 2
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Double altura;
        Double lado;
        
        // For para realizar a leitura de 3 retângulos
        for (int i = 0; i < 3; i++) {
            altura = Double.parseDouble(scanner.nextLine());
            lado = Double.parseDouble(scanner.nextLine());
            /* Como não temos o construtor padrão, devemos utilizar o construtor
             * fornecido.
             */
            Retangulo retangulo = new Retangulo(lado, altura);
        
            System.out.println("Area do retangulo: " + retangulo.calcularArea());
            System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
        }
        
        scanner.close();
    }
    
}
