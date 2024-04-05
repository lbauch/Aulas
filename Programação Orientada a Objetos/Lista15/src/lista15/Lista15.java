/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista15;

import java.io.IOException;
import questao01.ManipuladorDeArquivo;

/**
 *
 * @author evand
 */
public class Lista15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManipuladorDeArquivo m = new ManipuladorDeArquivo();
        
        try {
            m.copiarDados("D:\\FURB\\Aulas\\POO\\NetBeansProjects\\Lista14\\ect\\municipios.csv", "ect\\municipios.csv");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
