/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author evand
 */
public class Contas {
    
    private ArrayList<Pagavel> contas = new ArrayList<>();
    
    public void incluirConta(Pagavel conta) {
        if (conta == null) {
            throw new IllegalArgumentException("Conta inválida");
        }
        contas.add(conta);
    }

    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel conta : contas) {
            total += conta.calcularValorPagar();
        }
        return total;
    }
}
