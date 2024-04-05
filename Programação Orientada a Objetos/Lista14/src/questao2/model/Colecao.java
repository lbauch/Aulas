package questao2.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author evand
 */
public class Colecao implements Serializable{
    
    private String nome;

    private ArrayList<Midia> itens = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Midia> getItens() {
        return itens;
    }
    
    public void incluirItem(Midia media) {
        itens.add(media);
    }
    
    public void removerItem(Midia media) {
        itens.remove(media);
    }
    
    public double getDuracaoColecao() {
        double duracaoTotal = 0;
        for (Midia item : itens) {
            duracaoTotal += item.getDuracao();
        }
        
        return duracaoTotal;
    }
    
}
