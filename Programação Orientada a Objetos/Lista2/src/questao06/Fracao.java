package questao06;

/**
 * Classe que representa uma fração
 */
public class Fracao {
    
    /* O exercício pede para que o numerador e denominador não sejam modificados
     * externamente, por isso foi optado por não usar o final. Como não temos um
     * caso onde existe a modificação dos mesmos, as validações iniciais foram 
     * deixadas no contrutor. Quando tivermos que fazer a modificação para 
     * permitir alterção interna, talvez tenhamos que criar um método de 
     * atribuição para ambos os valores em conjuto, por conta das regras dos
     * sinais e outras validações
    */
    private long numerador;
    private long denominador;

    /**
     * Cria uma nova fração com os valore de numerador e denominador, levando em
     * conta que o numerador irá manter o sinal da fração.
     * 
     * @param numerador o numerador da fração
     * @param denominador o denominador da fração
     */
    public Fracao(long numerador, long denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Valor do denominador não pode ser 0");
        }
        /* Passar o sinal de negativo sempre para o denominador. Esse é um caso 
         * onde usar os gets não faz sentido, pois estamos dentro do construtor
         * e o valor das variáveis ainda não foram inicializados, sendo assim se
         * usarmos os gets eles vão sempre retornar 0 (escopo de variável de instância)  
         */
        if ((numerador < 0 && denominador < 0)
            || (numerador > 0 && denominador < 0)) {
            numerador *= -1;
            denominador *= -1;
        }
        
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Retorna o numerador desta fração. 
     * 
     * O numerador contém o sinal da fração
     * 
     * @return o valor do numerador
     */
    public long getNumerador() {
        return numerador;
    }

    /**
     * Retorna o denominador desta fração. 
     * 
     * @return o valor do denominador
     */
    public long getDenominador() {
        return denominador;
    }
    
    /**
     * Realiza a soma deste objeto de fração com outro objeto de fração.
     * <br>
     * A soma não é simplificada e considera a sequinte fórmula:
     * <br>
     * a/b + c/d = (a * d) + (c * b) / (b * d)
     * 
     * @param outraFracao a outra fração a qual se deseja realizar a soma
     * @return uma fração que representa a soma não simplifica desta fração com outra fração
     */
    public Fracao somar(Fracao outraFracao) {
        long numeradorSoma = (getNumerador() * outraFracao.getDenominador()) + (outraFracao.getNumerador() * getDenominador());
        long denominadorSoma = getDenominador() * outraFracao.getDenominador();
        return new Fracao(numeradorSoma, denominadorSoma);
    }
    
    /**
     * Realiza a soma deste objeto de fração com um número.
     * <br>
     * A soma não é simplificada e considera a sequinte fórmula:
     * <br>
     * a/b + n = a/b + n/1 = (a) + (n * b) / (b)
     * 
     * @param numero o número ao qual se deseja somar esta fração
     * @return uma fração que representa a soma não simplifica desta fração com 
     * um numero inteiro
     */
    public Fracao somar(long numero) {
        /* Esse método é uma sobrecarga do método somar(Fracao outraFracao), que
         * permite a soma de frações com inteiros. Como um número inteiro é uma 
         * fração com denominador 1, criamos um objeto de fração com numerador 
         * igual ao parâmetro e denominador 1, e chamamos a função que já faz a 
         * soma de frações, para reaproveitar o método existente. 
         */
        return somar(new Fracao(numero, 1));
    }
    
}
