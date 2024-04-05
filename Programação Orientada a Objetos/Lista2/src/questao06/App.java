package questao06;

/**
 * Classe para executar o Exercício 6
 */
public class App {
    
    public static void main(String[] args) {
        
        // Criação da fração 1 
        Fracao fracao1 = new Fracao(1, 4);
        
        // Criação da fração 2
        Fracao fracao2 = new Fracao(1, 2);
        
        // Calculando a soma das frações
        Fracao resultadoSoma1 = fracao1.somar(fracao2);
        
        // Calculando a soma fração 1 com um inteiro
        Fracao resultadoSoma2 = fracao1.somar(1);
        
        // Exibindo o resultado
        System.out.printf("Soma 1: %d/%d \n", resultadoSoma1.getNumerador(), resultadoSoma1.getDenominador());
        System.out.printf("Soma 2: %d/%d \n", resultadoSoma2.getNumerador(), resultadoSoma2.getDenominador());
        
        // Bonus: fazendo um exemplo com número negativo, para demostrar a ação do construtor
        // Criação da fração 3
        Fracao fracao3 = new Fracao(1, - 2);
        System.out.printf("Fração 3: %d/%d \n", fracao3.getNumerador(), fracao3.getDenominador());
        
        Fracao resultadoSoma3 = fracao1.somar(fracao3);
        
        System.out.printf("Soma 3: %d/%d \n", resultadoSoma3.getNumerador(), resultadoSoma3.getDenominador());

    }
    
}
