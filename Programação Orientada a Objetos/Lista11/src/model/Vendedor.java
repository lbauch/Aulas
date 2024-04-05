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
public class Vendedor extends Funcionario {
    
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();
    
    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda v) {
        vendas.add(v);
    }

    @Override
    public double calcularSalario() {
        double totalVendas = 0;
//        for(int i=0; i < vendas.size(); i++){
//            Venda venda = vendas.get(i);
//        }
        for (Venda venda : vendas) {
            totalVendas += venda.getValor();
        }
        
        return getSalarioBase() + (totalVendas * (percentualComissao/100)); 
    }

    @Override
    public String toString() {
        return super.toString() + " Comissão " + getPercentualComissao();
    }
    
    
    
}
