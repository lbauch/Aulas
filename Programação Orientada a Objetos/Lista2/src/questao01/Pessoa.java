package questao01;

/**
 * Classe para presentar uma pessoa
 */
public class Pessoa {
    
    private String nome;
    private double altura;
    private double peso;

    /**
     * Cria uma pessoa
     */
    public Pessoa() {
    }
    
    /**
     * Cria uma pessoa com os valores de nome, altura e peso definidos
     * 
     * @param nome o nome da pessoa
     * @param altura a altura da pessoa
     * @param peso o peso da pessoa
     */
    public Pessoa(String nome, double altura, double peso) {
        /* Uso dos métodos de set para reaproveitar as validações que eles 
         * realizam, ajudando assim a mantar correto o estado do objeto criado
         */
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
    }
    
    /**
     * Realizar o calculo do IMC, que é dado pela formula: peso/(altura * altura)
     * 
     * @return o valor do IMC
     */
    public double calcularImc() {
        /* Não é obrigatório usar o getPeso e o getAltura para fazer o cálculo do
         * IMC, mas isso é uma sugestão, visto que se os gets executarem algum 
         * processamento extra, podemos reaproveitá-lo no calculo, caso isso faça
         * sentido. Usar ou não usar o get vai depender da situação e da necessidade
         */
        return getPeso() / (getAltura() * getAltura());
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        /* String é um objeto e como objeto ele pode ter o valor null. O null 
         * indica que essa variável não está apontando para nenhum objeto em memória
         * ou seja não um valor. O isBlanck está validando que a String não é vazio
         * ou composta de espaços em branco.
         */
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }
    
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

}
