package questao4;

import java.util.Scanner;

/**
 *
 * Classe para executar o Exercício 4
 */
public class App {

    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Variável String para armazenar a leitura dos dados 
        String entrada;

        /* Criação de uma variável para armazenar as referências para os objetos
         * de pessoa
         */
        Pessoa pessoa;
        
        // Utilizando for para ler 3 pessoas
        for (int i = 0; i < 3; i++) {
            /* Criação de uma variável para armazenar as referências para os objetos
             * de pessoa. Seria possível também fazer a criação da variável e a 
             * criação do objeto dentro do for. Também poderiamos criar o objeto 
             * fora do for e modificar o estado dentro do for e isso atenderia ao
             * exercício, embora não teriamos criado 3 pessoas, só modificado o 
             * estado de uma pessoa 3 vezes
             */ 
            pessoa = new Pessoa();

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
        }

        /* Fechar o scanner para. Depois desse ponto não será mais possível 
         * usar o scanner, por isso semrpe realizar essa operação no final.
         */
        scanner.close();
    }

}
