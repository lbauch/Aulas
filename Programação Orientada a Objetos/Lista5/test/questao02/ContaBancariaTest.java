package questao02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evand
 */
public class ContaBancariaTest {
    
    private ContaBancaria conta;
    
    public ContaBancariaTest() {
    }
    
    @Before
    public void setUp() {
        /* Utilizando o método @Before para inicializar uma conta, aproveitando
         * assim o contexto dela.
         */
        conta = new ContaBancaria();
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Caso de teste 01
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSacarSemSaldo() {
        conta.sacar(100);
    }
    
    /**
     * Caso de teste 02
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSacarNegativo() {
        conta.sacar(-100);
    }
    
    /**
     * Caso de teste 03
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDepositoNegativo() {
        conta.depositar(-100);
    }
    
    /**
     * Caso de teste 04
     */
    @Test
    public void testCalculoSaldo04() {
        conta.depositar(100);
        conta.depositar(2500);
        conta.sacar(1200);
        
        assertEquals(1400, conta.getSaldo(), 0);
    }
    
    /**
     * Caso de teste 05
     */
    @Test
    public void testCalculoSaldo05() {
        conta.depositar(850);
        conta.sacar(500);
        conta.depositar(1200);
        conta.sacar(859.92);
        
        assertEquals(690.08, conta.getSaldo(), 0);
    }
    
    /**
     * Caso de teste 06
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSaldoTransferencia() {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        c1.depositar(100);
        c1.transferir(c2, 200);
    }
    
    /**
     * Caso de teste 07
     */
    @Test
    public void testTransferencia07() {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        c1.depositar(100);
        c2.depositar(550);
        c1.transferir(c2, 100);
        
        assertEquals(650, c2.getSaldo(), 0);
    }
    
    /**
     * Caso de teste 08
     */
    @Test
    public void testTransferencia08() {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        c1.depositar(250);
        c2.depositar(550);
        c1.transferir(c2, 100);
        
        assertEquals(150, c1.getSaldo(), 0);
    }
}
