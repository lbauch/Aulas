package questao01;

public class ContaEspecial extends ContaBancaria {
    
    public double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("Limite não pode ser negativo ou 0");
        }
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo ou 0");
        } else if ((getSaldo() + limiteCredito - valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        setSaldo(getSaldo() - valor);
    }
    
    
    
}
