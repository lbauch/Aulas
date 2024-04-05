package model;

/**
 *
 * @author evand
 */
public class Despesa {
    
    private double valor;
    
    private TipoDespesa tipoDespesa;

    public Despesa() {
        
    }
    
    public Despesa(double valor, TipoDespesa tipoDespesa) {
        this.valor = valor;
        this.tipoDespesa = tipoDespesa;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
    
}
