package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListaDuplaTest {

    ListaDupla<Integer> lista = new ListaDupla<Integer>();

    public ListaDuplaTest() {
    }

    @Test
    public void testIncluir() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.toString(), "20,15,10,5");
    }
    
    @Test
    public void buscaInicio() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(20), "20,15,10,5");
    }
    
}
