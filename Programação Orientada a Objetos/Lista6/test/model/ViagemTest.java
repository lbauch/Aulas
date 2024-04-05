/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evand
 */
public class ViagemTest {
    
    public ViagemTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void caseTest01() {
        Viagem viagem = new Viagem();
        viagem.incluirDespesa(new Despesa(500, TipoDespesa.DESLOCAMENTO));
        viagem.incluirDespesa(new Despesa(600, TipoDespesa.HOSPEDAGEM));
        viagem.incluirDespesa(new Despesa(20, TipoDespesa.REFEICAO));
        viagem.incluirDespesa(new Despesa(25, TipoDespesa.REFEICAO));
        
        assertEquals(1145, viagem.calcularValorViagem(), 0);
    }

    @Test
    public void caseTest02() {
        Viagem viagem = new Viagem();
        viagem.incluirDespesa(new Despesa(500, TipoDespesa.DESLOCAMENTO));
        viagem.incluirDespesa(new Despesa(600, TipoDespesa.HOSPEDAGEM));
        viagem.incluirDespesa(new Despesa(20, TipoDespesa.REFEICAO));
        viagem.incluirDespesa(new Despesa(25, TipoDespesa.REFEICAO));
        viagem.setAdiantamento(1200);
        
        assertEquals(55, viagem.calcularValorDevolverFuncionario(), 0);
    }
    
    @Test
    public void caseTest03() {
        Viagem viagem = new Viagem();
        viagem.incluirDespesa(new Despesa(200, TipoDespesa.DESLOCAMENTO));
        viagem.incluirDespesa(new Despesa(600, TipoDespesa.HOSPEDAGEM));
        viagem.incluirDespesa(new Despesa(40, TipoDespesa.REFEICAO));
        viagem.incluirDespesa(new Despesa(35, TipoDespesa.REFEICAO));
        viagem.incluirDespesa(new Despesa(27, TipoDespesa.REFEICAO));
        viagem.setAdiantamento(1000);
        
        assertEquals(113, viagem.calcularValorDevolverFuncionario(), 0);
    }
}
