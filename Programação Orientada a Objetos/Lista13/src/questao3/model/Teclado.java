package questao3.model;

import java.util.Scanner;

/**
 *
 * @author evand
 */
public class Teclado {

    private Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }
    
    public int lerInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor digitado inválido, tente novamente");
            }
        }
    }
    
    public double lerDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Valor digitado inválido, tente novamente");
            }
        }
    }
    
    /**
     * Realiza a leitura de um booleano.
     * 
     * @return 
     */
    public boolean lerBoolean() {
        while (true) {
            String entrada= scanner.nextLine();

            switch (entrada) {
                case "sim":
                case "verdadeiro":
                case "positivo":
                case "s":
                    return true;

                case "não":
                case "falso":
                case "negativo":
                case "n":
                    return false;
                    
                default:
                    System.out.println("Valor não reconhecido, digite de novo");
            }
                
        }
    }
    
    public String lerString() {
        String entrada = scanner.nextLine();
        while (entrada.isBlank()) {
            System.out.println("String com espaços em branco ou vazia não é válida, digite de novo");
            entrada = scanner.nextLine();
        }
        return entrada;
    }
    
    
}
