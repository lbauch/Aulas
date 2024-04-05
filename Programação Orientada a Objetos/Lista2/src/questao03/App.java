package questao03;

import java.util.Scanner;

/**
 * Classe para executar o Exercício 3
 */
public class App {
    
    /**
     * Metodo para fazer a criação e a leitura de um ponto 
     * 
     * @param scanner objeto de Scanner para ler dados do teclado 
     * @return um Ponto com os dados informados pelo usuário
     */
    public static Ponto lerPonto(Scanner scanner) {
        String entrada;
        
        // Leitura dos dados
        System.out.println("Digite o X");
        entrada = scanner.nextLine();
        double x = Double.parseDouble(entrada);
        
        System.out.println("Digite o Y");
        entrada = scanner.nextLine();
        double y = Double.parseDouble(entrada);
        
        /* Criação do objeto de ponto, utilizando o contrutor para inicializar 
         * os atributos
         */
        Ponto ponto = new Ponto(x, y);
        
        /* Retorno do objeto de ponto criado, com os valores lidos.
         * aqui poderiamos também optar para possibilidade de fazer direto:
         * return new Ponto(x, y);
         */
        return ponto;
    }
    
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Invocação do método que irá ler os dados criar um ponto e retornar o ponto
        Ponto ponto = lerPonto(scanner);
        
        // Invocação do método que irá ler os dados criar um ponto e retornar o ponto
        Ponto outroPonto = lerPonto(scanner);
        
        /* Exibição do resultado do calculo de distância entre os pontos 
         * informados pelo usuário
         */
        System.out.println("A distancia entre os outros ponto é "
                + ponto.calcularDistanciaEuclidiana(outroPonto));
        
        /* Fechar o scanner para. Depois desse ponto não será mais possível 
         * usar o scanner, por isso semrpe realizar essa operação no final.
         */
        scanner.close();
    }
    
}
