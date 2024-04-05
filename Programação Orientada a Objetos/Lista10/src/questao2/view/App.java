/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.view;

import questao2.model.Album;
import questao2.model.Colecao;
import questao2.model.Filme;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        Colecao colecao = new Colecao();
        colecao.setNome("Meu null");
        
        Filme f1 = new Filme();
        f1.setTitulo("Filme 1");
        f1.setDuracao(120);
        f1.setAnoLancamento(2010);
        f1.setDiretor("Diretor 1");
        colecao.incluirItem(f1);
        
        Filme f2 = new Filme();
        f2.setTitulo("Filme 2");
        f2.setDuracao(150);
        f2.setAnoLancamento(2010);
        f2.setDiretor("Diretor 2");
        colecao.incluirItem(f2);
        
        Album a1 = new Album();
        a1.setAnoLancamento(2011);
        a1.setDuracao(15);
        a1.setFaixas(3);
        a1.setNomeArtistas("Artista 1");
        a1.setTitulo("Album 1");
        
        Album a2 = new Album();
        a2.setAnoLancamento(2011);
        a2.setDuracao(20);
        a2.setFaixas(4);
        a2.setNomeArtistas("Artista 5");
        a2.setTitulo("Album 5");
        
        Album a3 = new Album();
        a3.setAnoLancamento(2011);
        a3.setDuracao(30);
        a3.setFaixas(5);
        a3.setNomeArtistas("Artista 7");
        a3.setTitulo("Album 7");
        
        colecao.incluirItem(a1);
        colecao.incluirItem(a2);
        colecao.incluirItem(a3);
        
        System.out.println("Duração total da coleção " + colecao.getNome() 
                + " é " + colecao.getDuracaoColecao() + " minutos");
    }
    
}
