/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3.view;

import questao3.model.Teclado;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        
        System.out.println("Qual o seu nome: ");
        String nome = teclado.lerString();
        
        System.out.println("Qual a sua idade: ");
        int idade = teclado.lerInt();
        
        System.out.println("Tem animais de estimação: ");
        boolean temAnimalEstimacao = teclado.lerBoolean();
        
        System.out.println("Qual o seu salario: ");
        double salario = teclado.lerDouble();
        
        System.out.println(nome + " tem " + idade + " anos. O salario dele eh: " + salario
        + ". Ele possiu animais de estimação? " + temAnimalEstimacao);
        
        
    }
    
}
