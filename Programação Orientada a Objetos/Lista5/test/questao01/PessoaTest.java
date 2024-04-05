/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package questao01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evand
 */
public class PessoaTest {

    public PessoaTest() {
    }
    
    @Before
    public void setUp() {
        // Demonstrando que o método será chamado cada vez.
        System.out.println("SetUp");
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Caso de teste 01
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAlturaNegativa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(-1.75);
    }
    
    /**
     * Caso de teste 02
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPesoNegativo() {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(-50);
    }
    
    /**
     * Caso de teste 03
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNomeVazio() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("");
    }

    /**
     * Caso de teste 04
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorPadraoAlturaNegativa() {
        Pessoa pessoa = new Pessoa("Maria", -1.50, 58);
    }
    
    /**
     * Caso de teste 05
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorPadraoPesoNegativo() {
        Pessoa pessoa = new Pessoa("João", 1.90, -78);
    }
    
    /**
     * Caso de teste 06
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorNomeEspacoVazio() {
        Pessoa pessoa = new Pessoa("   ", 1.70, 50);
    }
    
    /**
     * Caso de teste 07
     */
    @Test
    public void testCalcularIMC07() {
        Pessoa pessoa = new Pessoa("João", 1.65, 58);
        
        assertEquals(21.30, pessoa.calcularImc(), 0.01);
    }
    
    /**
     * Caso de teste 08
     */
    @Test
    public void testCalcularIMC08() {
        Pessoa pessoa = new Pessoa("João", 1.80, 90);
        
        assertEquals(27.78, pessoa.calcularImc(), 0.01);
    }
    
    /**
     * Caso de teste 09
     */
    @Test
    public void testCalcularIMC09() {
        Pessoa pessoa = new Pessoa("João", 1.75, 75);
        
        assertEquals(24.49, pessoa.calcularImc(), 0.01);
    }
}
