package questao04;

/**
 * Classe para representar uma conta bancária
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;
    
    /**
     * Retorna o saldo da conta
     * 
     * @return o saldo atual da conta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Retorna o número da conta
     * 
     * @return o número da conta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Atribui um número para a conta
     * 
     * @param numero o número a ser setado
     */
    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número Inválido");
        }
        this.numero = numero;
    }

    /**
     * Retorno a titular da conta
     * 
     * @return o titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Atribui um titular para a conta
     * 
     * @param titular o titular a atribuido
     */
    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("O titular é inválido");
        }
        this.titular = titular;
    }
    
    /**
     * Deposita o valor na conta
     * 
     * @param valor o valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Depósito inválido");
        }
        saldo = saldo + valor;
    }

    /**
     * Retira/saca um valor da conta
     * 
     * @param valor a ser sacado da conta
     */
    public void sacar(double valor) {
        if (valor <= 0 || (saldo - valor) < 0) {
            throw new IllegalArgumentException("Saque inválido");
        }
        saldo = saldo - valor;
    }
    
    /**
     * Realiza a transferencia de um valor desta conta para uma conta de destino
     * 
     * @param contaDestino conta que irá receber o valor de transferencia
     * @param valor o valor a ser tranferido
     */
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= 0 || contaDestino == null) {
            throw new IllegalArgumentException("Dados para a transferencia inválidos");
        }
        contaDestino.depositar(valor);
        sacar(valor);
    }
    
}
