package questao05;

import java.util.Random;

/**
 * Classe para representar um dado
 */
public class Dado {
    
    /* O numero de faces de um dado não deve ser alterado depois de definido.
     * Para isso temos duas possibilidade, utilizar não implementar um método de
     * set e não implementar o método de set e definir a variável como final.
     * final é uma forma de dizer ao Java que o uma variável será inicializada, 
     * mas que ela não pode ter o seu valor modificado depois disso, o que se 
     * encaixa com o enunciado do exercício. Caso não usassemos o final, o atributo
     * estaria sujeito a ser modificado pela classe.
     */
    private final int numeroFaces;
    
    /* Exemplo de uma váriavel estática para definir o número máximo de lados do
     * dado. Embora ela não seja usada na classe, poderiamos fazer uma validação 
     * para não deixar criar um dado com um número de faces maior do que essa variável
     */
    private static int numeroMaximoFaces = 20;

    /**
     * Cria um dado com o número de faces informado
     * 
     * @param numeroFaces numero de faces do dado.
     */
    public Dado(int numeroFaces) {
        /* Como não temos um método de set e a variável é final, fazemos a validação
         * no construtor.
         */
        if (numeroFaces < 4 || numeroFaces % 2 != 0) {
            throw new IllegalArgumentException("Numero de faces incorreto");
        }
        this.numeroFaces = numeroFaces;
    }

    /**
     * Retorna o número de faces deste objeto de dado
     * 
     * @return o numero de faces do dado
     */
    public int getNumeroFaces() {
        return numeroFaces;
    }
    
    /**
     * Realiza a jogada do dado
     * 
     * @return Um número entre 1 e o numero de faces deste dado
     */
    public int jogarDado() {
        // Utilizamos a classe Random para simular a jogada do dado
        Random random = new Random();
        return random.nextInt(1, numeroFaces + 1);
    }
    
    /**
     * Realiza a jogada de um conjunto de dados
     * 
     * @param conjuntoDados array de dados dos quais queremos uma jogada
     * @return um array conta 1 jogada de cada dado, na ordem em que eles foram
     * informados
     */
    public static int[] jogarDados(Dado[] conjuntoDados) {
        // Validamos se existem dados para serem jogados
        if (conjuntoDados == null || conjuntoDados.length == 0) {
            throw new IllegalArgumentException("Conjunto de dados inválido");
        }
        
        // Criando o array de retorno
        int jogadas[] = new int[conjuntoDados.length]; 
        
        for (int i = 0; i < conjuntoDados.length; i++) {
            /* verificando que a posição atual está apontando para um dado.
             * Se uma posição do array não estiver apontando para um objeto de dado 
             * na memória ela será nula, e isso pode gerar um erro de NullPointer
             */
            if (conjuntoDados[i] == null) {
                throw new IllegalArgumentException("Conjunto de dados inválido");
            }
            
            // Realizar a jogada e salvar o resultado
            jogadas[i] = conjuntoDados[i].jogarDado();
        }
        
        // Retornar o resultado das jogadas
        return jogadas;
    }

    /* Exemplos de get e set para a variável estática. Note que eles também são 
     * estáticos, pois desta forma não precisamos de uma instancia desta classe
     * para fazer a alteração de valores. A forma como o valor da variável 
     * estática vai mudar pode depender de especificações de negócio ou de alguma 
     * necessidade de implementação
     */
    
    public static int getNumeroMaximoFaces() {
        return numeroMaximoFaces;
    }

    public static void setNumeroMaximoFaces(int numeroMaximoFaces) {
        Dado.numeroMaximoFaces = numeroMaximoFaces;
    }
    
}
