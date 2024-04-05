package questao6;

import java.util.Scanner;

/**
 * Classe para executar o Exercício 6
 */
public class App {
    
    /**
     * Metodo para fazer a criação e a leitura de um ponto 
     * @param scanner objeto de Scanner para ler dados do teclado 
     * @return um Ponto com os dados informados pelo usuário
     */
    public static Ponto lerPonto(Scanner scanner) {
        // Variável String para armazenar a leitura dos dados 
        String entrada;
        
        // Criação do objeto de ponto
        Ponto ponto = new Ponto();
        
        //Leitura da posição X do ponto
        System.out.println("Digite o X");
        entrada = scanner.nextLine();
        // Conversão da entrada para double e atribução dos dados
        ponto.x = Double.parseDouble(entrada);
        
        //Leitura da posição Y do ponto
        System.out.println("Digite o Y");
        entrada = scanner.nextLine();
        // Conversão da entrada para double e atribução dos dados
        ponto.y = Double.parseDouble(entrada);
        
        // Retorno do objeto de ponto criado, com os valores lidos
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
