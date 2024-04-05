/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package questao2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evand
 */
public class ImovelTest {
    
    public ImovelTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testeCaso01() {
        Imovel imovel = new Imovel();
        imovel.setArea(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testeCaso02() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Centro");
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setBairro(bairro);
        
        imovel.calcularIptu();
    }
    
    @Test
    public void testeCaso03() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Garcia");
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setArea(400);
        imovel.setBairro(bairro);
        
        assertEquals(400, imovel.calcularIptu(), 0);
    }
    
    @Test
    public void testeCaso04() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Garcia");
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(500);
        imovel.setBairro(bairro);
        
        assertEquals(1275, imovel.calcularIptu(), 0);
    }
    
    @Test
    public void testeCaso05() {
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Garcia");
        
        Imovel imovel = new Imovel();
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setArea(2000);
        imovel.setBairro(bairro);
        
        assertEquals(1000, imovel.calcularIptu(), 0);
    }
    
}
