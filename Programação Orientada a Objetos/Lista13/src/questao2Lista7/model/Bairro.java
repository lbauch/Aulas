/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2Lista7.model;

/**
 *
 * @author evand
 */
public class Bairro {
    
    private String nome;
    private double coeficienteIptu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu <= 0) {
            throw new IllegalArgumentException("Valor do coeficiente não pode zero ou negativo");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    
    
}
