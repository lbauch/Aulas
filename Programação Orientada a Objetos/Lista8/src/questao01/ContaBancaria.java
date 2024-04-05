package questao01;

public class ContaBancaria {
    
    private String numero;
    private double saldo;
    
    private Cliente titular;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número Inválido");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        if (titular == null) {
            throw new IllegalArgumentException("Titular Inválido");
        }
        this.titular = titular;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo ou 0");
        }
        
        saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo ou 0");
        } else if ((saldo - valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        
        saldo -= valor;
    }
    
    public void transferir(ContaBancaria c, double valor) {
        if (c == null) {
            throw new IllegalArgumentException("Conta não informada");
        }
        sacar(valor);
        c.depositar(valor);
    }
     
}
