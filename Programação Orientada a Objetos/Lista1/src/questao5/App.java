package questao5;

import java.util.Scanner;

/**
 *
 * Classe para executar o Exercício 5
 */
public class App {

    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Variável String para armazenar a leitura dos dados 
        String entrada;

        /* Criação de um vetor (array) que pode armazenar 3 pessoas. Da mesma 
         * forma como podiamos criar vetores para armazenar objetos primitivos,
         * também podemos criar vetores para armazenarmos objetos. Cada uma das 
         * possições deste vetor pode armazenar um objeto de pessoa.
         */
        Pessoa pessoas[] = new Pessoa[3];
        
        /* Criação de uma variável para armazenar as referências para os objetos
         * de pessoa
         */
        Pessoa pessoa;
        
        /* Utilizando for para ler 3 pessoas. Estamos utilizando a propriedade 
         * length do array para assim o código ficar mais fácil de modificar. 
         * Se o tamanho do array for alterado, não será necessário mudar os fors
         */
        for (int i = 0; i < pessoas.length; i++) {
            /* Criação de um objeto de pessoa. Outra forma de fazer isso seria
             * pessoas[i] = new Pessoa(), afinal cada posição do vetor pode 
             * armazenar um objeto de pessoa
             */
            pessoa = new Pessoa();
            
            // Leitura do nome da pessoa
            System.out.println("Digite o nome");
            entrada = scanner.nextLine();
            pessoa.nome = entrada;
            
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
            
            /* Armazenamos a referencia para o objeto de pessoa dentro do vetor, 
             * na possição i, para ser utilizado posteriormente 
             */
            pessoas[i] = pessoa;
        }
        
        /* Utilizando for para percorrer o array de forma invertida. Por isso 
         * começamos i com o valor de length - 1, pois length é tamanho do array (3),
         * contudo no Java os incices começam em 0, logo precisamos que o for 
         * forneça os valores de 2 até 0 e não de 3 até 1. Se tentássemos acessar 
         * a possição 3 do array, isso iria gerar um erro na execução do programa. 
         */
        for (int i = pessoas.length - 1; i >= 0; i--) {
            // Exibição do resultado do calculo de IMC de cada pessoa
            System.out.println("O IMC de " + pessoas[i].nome 
                    + " é: " + pessoas[i].calcularImc());
        }
        
        /* Fechar o scanner para. Depois desse ponto não será mais possível 
         * usar o scanner, por isso semrpe realizar essa operação no final.
         */
        scanner.close();
    }

}
