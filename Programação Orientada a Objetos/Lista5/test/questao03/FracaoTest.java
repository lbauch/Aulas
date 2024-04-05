package questao03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evand
 */
public class FracaoTest {
    
    public FracaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Caso de teste 01
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorDenominadorNegativo() {
        Fracao f = new Fracao(1, 0);
    }
    
    /**
     * Caso de teste 02
     */
    @Test
    public void testConstrutorSinais02() {
        Fracao f = new Fracao(1, -2);
        
        assertEquals("-1/2", f.imprimir());
    }
    
    /**
     * Caso de teste 03
     */
    @Test
    public void testConstrutorSinais03() {
        Fracao f = new Fracao(-1, -2);
        
        assertEquals("1/2", f.imprimir());
    }
    
    /**
     * Caso de teste 04
     */
    @Test
    public void testSomarFracao04() {
        Fracao f1 = new Fracao(1, 3);
        Fracao f2 = new Fracao(2, 4);
        
        Fracao f3 = f1.somar(f2);
        
        assertEquals("10/12", f3.imprimir());
    }
    
    /**
     * Caso de teste 05
     */
    @Test
    public void testSomarLong05() {
        Fracao f1 = new Fracao(1, 3);
        
        Fracao f3 = f1.somar(2);
        
        assertEquals("7/3", f3.imprimir());
    }
    
    /**
     * Caso de teste 06
     */
    @Test
    public void testSomarFracaoNegativa() {
        Fracao f1 = new Fracao(-1, 2);
        Fracao f2 = new Fracao(1, 4);
        
        Fracao f3 = f1.somar(f2);
        
        assertEquals("-2/8", f3.imprimir());
    }
    
    /**
     * Caso de teste 07
     */
    @Test
    public void testSomarLongNegativo() {
        Fracao f1 = new Fracao(1, 3);
        
        Fracao f3 = f1.somar(-2);
        
        assertEquals("-5/3", f3.imprimir());
    }
    
}
