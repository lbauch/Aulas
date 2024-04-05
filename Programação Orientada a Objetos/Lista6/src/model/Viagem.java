package model;

import java.util.ArrayList;

/**
 *
 * @author evand
 */
public class Viagem {

    private double adiantamento;
    
    ArrayList<Despesa> despesas = new ArrayList<>();

    public double getAdiantamento() {
        return adiantamento;
    }

    public void setAdiantamento(double adiantamento) {
        this.adiantamento = adiantamento;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }
    
    public void incluirDespesa(Despesa despesa) {
        despesas.add(despesa);
    }
    
    public void removerDespesa(Despesa despesa) {
        despesas.remove(despesa);
    }
    
    public double calcularValorViagem() {
        double total = 0;
        for (Despesa despesa : despesas) {
            total += despesa.getValor();
        }
        
        return total;
    }
    
    public double calcularValorDevolverFuncionario() {
        double total = 0;
        
        for (Despesa despesa : despesas) {
            if (despesa.getTipoDespesa() == TipoDespesa.REFEICAO 
                    && despesa.getValor() > 30) {
                total += 30;
            } else {
                total += despesa.getValor();
            }
        }
        
        return getAdiantamento() - total;
    }
    
}
