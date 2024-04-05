package questao05;

/**
 * Classe para executar o Exercício 5
 */
public class App {
    
    public static void main(String[] args) {
        
        // Criando um dado de 4 faces para teste
        Dado dado = new Dado(4);
        
        // Realizando uma jogada
        System.out.println("A sorte lançou: " + dado.jogarDado());
        
        /* Criando um array com posições e valores já definidos. Essa é uma outra
         * forma que o Java permite para criar um array, mas só funciona se você
         * já possuir os valores para informar dentro das {}
         */
        Dado conjunto[] = {new Dado(4), new Dado(6),
            new Dado(8), new Dado(12), new Dado(20)};
        
        // Invocar o método estático para realizar as jogadas de todos os dados
        int resultados[] = Dado.jogarDados(conjunto);
        
        // Exibir o resultado das jogadas
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("A sorte lançou: " + resultados[i]);
        }
    }
    
}
