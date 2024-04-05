package questao04;

import java.util.Scanner;

/**
 * Classe para executar o Exercício 4
 */
public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação da conta 1 e atribuição dos seus dados usando os sets
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Digite o nome: ");
        conta1.setTitular(scanner.nextLine());
        
        System.out.println("Digite o numero: ");
        conta1.setNumero(scanner.nextLine());
        
        // Criação da conta 2 e atribuição dos seus dados usando os sets
        ContaBancaria conta2 = new ContaBancaria();
        System.out.println("Digite o nome: ");
        conta2.setTitular(scanner.nextLine());
        
        System.out.println("Digite o numero: ");
        conta2.setNumero(scanner.nextLine());
        
        // Realização das operações na conta 1
        conta1.depositar(1000);
        conta1.depositar(700);
        
        // Realização das operações na conta 2
        conta2.depositar(5000);
        conta2.sacar(3000);
        
        // Realizar transferencia
        conta2.transferir(conta1, 1800);
        
        // Imprimir os dados
        imprimirSaldoConta(conta1);
        imprimirSaldoConta(conta2);
        
        scanner.close();
    }
    
    /**
     * Exibe no console os dados de titular e saldo de uma conta
     * 
     * @param conta conta que terá os seus dados exibidos
     */
    static void imprimirSaldoConta(ContaBancaria conta) {
        System.out.println("O saldo da conta de " + conta.getTitular() + " é "
            + conta.getSaldo());
    }
    
}
