package questao2;

/**
 * Classe para executar o Exercício 2
 */
public class App {
    
    public static void main(String[] args) {
        
        // Criação de um objeto de Pessoa
        Pessoa pessoa = new Pessoa();
        
        // Atribuição dos valores de altura e peso
        pessoa.altura = 1.7;
        pessoa.peso = 78;
        
        // Exibição do resultado do calculo de IMC
        System.out.println("O IMC da pessoa é: " + pessoa.calcularImc());
        
    }
    
}
