package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaEstaticaTest {
    
    private ListaEstatica lista = new ListaEstatica();
    
    public ListaEstaticaTest() {
    }

    @Test
    public void TesteIncluirItens() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals("5,10,15,20", lista.toString());
    }

    @Test
    public void testObterTamanho() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }

    @Test
    public void testBuscarExis() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(2, lista.buscar(15));

    }

    @Test
    public void testBuscarInexis() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(-1, lista.buscar(30));
    }

    @Test
    public void testRetirarElmnt() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(10);

        assertEquals("5,15,20", lista.toString());

        assertEquals(3, lista.getTamanho());
    }

    @Test
    public void testRealocar() {
        final int QTDE = 15;
        for (int i = 1; i<=QTDE; i++) {
            lista.inserir(i);
        }

        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", lista.toString());

        assertEquals(QTDE, lista.getTamanho());
    }

    @Test
    public void testObterElmnt() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        Object valorEncontrado = lista.obterElemento(3);

        assertEquals(20, valorEncontrado);
    }

    @Test
    public void testObterElmntInexis() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        try {
            lista.obterElemento(5);
            fail();
        } catch (IndexOutOfBoundsException e) {
            // se recusou obterElemento(5), está correto
        }
    }

    @Test
    public void testLiberar() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.liberar();

        assertEquals(true, lista.estaVazia());
    }
    
    @Test
    public void testInverterPar(){
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inverter();
        
        assertEquals(lista.toString(), "20,15,10,5");
    }

}

