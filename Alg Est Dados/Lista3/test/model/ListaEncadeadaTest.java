package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaEncadeadaTest {

    ListaEncadeada<Integer> lista = new ListaEncadeada<>();

    public ListaEncadeadaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //1
    @Test
    public void testeVazia() {
        assertEquals(lista.estaVazia(), true);
    }

    //2
    @Test
    public void testeVaziaErro() {
        lista.inserir(5);
        assertEquals(lista.estaVazia(), false);
    }

    //3
    @Test
    public void buscarTrue() {
        lista.inserir(5);
        assertEquals(lista.estaVazia(), false);
        assertEquals("5", lista.getPrimeiro().getInfo().toString());
    }

    //4
    @Test
    public void obterObjetos() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        assertEquals(lista.toString(), "15,10,5");
    }

    //5
    @Test
    public void buscarElmntFinal() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20", lista.buscar(20).getInfo().toString());
    }

    //6
    @Test
    public void buscarElmntMeio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("15", lista.buscar(15).getInfo().toString());
    }

    //7
    @Test
    public void buscarElmntInex() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(null, lista.buscar(50));
    }

    //8
    @Test
    public void retirarElmntFim() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15,10,5", lista.toString());
    }

    //9
    @Test
    public void retirarElmntMeio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals("20,10,5", lista.toString());
    }

    //10
    @Test
    public void obterNoFinal() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20", lista.obterNo(0).getInfo().toString());
    }

    //11
    @Test
    public void obterNoInicio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5", lista.obterNo(3).getInfo().toString());
    }
    
    //12
    @Test(expected=IllegalArgumentException.class)
    public void obterNoErroAcima() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.obterNo(10);
    }    
    
    //13
    @Test
    public void obterComprimentoVazio() {
        assertEquals(lista.obterComprimento(), 0);
    }  
    
    //14
    @Test
    public void obterComprimentoItens() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.obterComprimento(), 4);
    }    
    
}
