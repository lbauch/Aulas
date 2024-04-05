package questao01;

import java.util.Scanner;

/**
 *
 * Classe para executar o Exercício 1
 */
public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada;
        String nome;
        double altura, peso;

        Pessoa pessoas[] = new Pessoa[3];
        Pessoa pessoa;
        for (int i = 0; i < pessoas.length; i++) {
            // Realizar a leitura dos 3 dados que formam uma pessoa
            System.out.println("Digite o nome");
            nome = scanner.nextLine();
            
            System.out.println("Digite a altura");
            entrada = scanner.nextLine();
            altura = Double.parseDouble(entrada);

            System.out.println("Digite o peso");
            entrada = scanner.nextLine();
            peso = Double.parseDouble(entrada);
            
            /* Criar um objeto de Pessoa e já inicializar os seus atributos.
             * Também era possível fazer a criação do objeto usando o construtor
             * padrão e utilizar os métodos sets para fazer a atribuição.
             * Ao usar o construtor, o usuário irá precisar inserir todos os dados
             * antes de criarmos o objeto e os erros, se existirem, só aparecerão
             * na inicialização do objeto. Caso o objeto tenha valores atribuidos
             * via set, o erro vai ocorrer no momento que o set for utilizado.
             */
            pessoa = new Pessoa(nome, altura, peso);
            pessoas[i] = pessoa;
        }
        
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.println("O IMC de " + pessoas[i].getNome()
                    + " é: " + pessoas[i].calcularImc());
        }
        
        scanner.close();
    }

}
