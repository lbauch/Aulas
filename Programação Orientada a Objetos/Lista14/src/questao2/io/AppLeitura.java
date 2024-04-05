/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import questao2.model.Colecao;

/**
 *
 * @author evand
 */
public class AppLeitura {
    
    public static void main(String[] args) {
        
        // Exemplo lendo um objeto de coleção
        File arquivo = new File("ect\\colecao.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            Colecao colecao = (Colecao) ois.readObject();
            
            System.out.println("Duração da coleção é: " + colecao.getDuracaoColecao());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
