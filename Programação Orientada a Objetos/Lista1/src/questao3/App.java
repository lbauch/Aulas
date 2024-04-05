package questao3;

import java.util.Scanner;

/**
 * Classe para executar o Exercício 3
 */
public class App {
    
    public static void main(String[] args) {
        
        // Criação de um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Variável String para armazenar a leitura dos dados 
        String entrada;
        
        // Criação do objeto de Pessoa
        Pessoa pessoa = new Pessoa();
        
        // Leitura da altura da pessoa
        System.out.println("Digite a altura");
        entrada = scanner.nextLine();
        // Conversão da entrada para double e atribução dos dados
        pessoa.altura = Double.parseDouble(entrada);
        
        // Leitura do peso da pessoa
        System.out.println("Digite o peso");
        entrada = scanner.nextLine();
        // Conversão da entrada para double e atribução dos dados
        pessoa.peso = Double.parseDouble(entrada);
        
        // Exibição do resultado do calculo de IMC
        System.out.println("O IMC da pessoa é: " + pessoa.calcularImc());
        
        /* Fechar o scanner para. Depois desse ponto não será mais possível 
         * usar o scanner, por isso semrpe realizar essa operação no final.
         */
        scanner.close();
    }
    
}
