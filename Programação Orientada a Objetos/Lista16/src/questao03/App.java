/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao03;

import io.ManipuladorArquivo;
import java.util.Map;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        try {
            // Ler um arquivo e contar as palavras
            Map<String, Integer> contador = ManipuladorArquivo.contarPalavrasArquivos("ect\\municipios.csv");
            
            // Percorrer a lista de EntrySet (Par de chave, valor) para mostrar as palavras e a contagem
            for (Map.Entry<String, Integer> entry : contador.entrySet()) {
                // getKey retorna a chave, getValue retorna o valor associado a chave
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
