/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import model.ContaAgua;
import model.Contas;
import model.MensalidadeEnsino;
import model.Pagavel;
import model.PrevidenciaPrivada;



/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        Contas contas = new Contas();
        
        contas.incluirConta(new MensalidadeEnsino(22, 55));
        contas.incluirConta(new MensalidadeEnsino(10, 55));
        
        contas.incluirConta(new ContaAgua(50, 1.5));
        
        PrevidenciaPrivada pp = new PrevidenciaPrivada();
        pp.setValor(500);
        
        contas.incluirConta(pp);
        
        System.out.println("Total a pagar eh: " + contas.calcularTotalContas());
        
        for (Pagavel pagavel : contas.getContas()) {
            System.out.println("Total da conta eh: " + pagavel.calcularValorPagar());
        }
    }
    
}
