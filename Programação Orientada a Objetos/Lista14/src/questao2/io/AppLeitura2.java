/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import questao2.model.Midia;

/**
 *
 * @author evand
 */
public class AppLeitura2 {
    
    public static void main(String[] args) {
        
        // Exemplo lendo um arraylist de midias
        File arquivo = new File("ect\\colecao2.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            ArrayList<Midia> midias = (ArrayList) ois.readObject();
            
            for (Midia midia : midias) {
                System.out.println("Nome da midia " + midia.getTitulo());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
