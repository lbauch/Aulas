/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evand
 */
public class PrevidenciaPrivada extends Investimento {
    
    private double valor;

    @Override
    public double calcularValorPagar() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void investir() {
        setSaldo(getSaldo() + valor);
    }
    
}
