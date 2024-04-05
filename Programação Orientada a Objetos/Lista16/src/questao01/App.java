/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import io.ManipuladorArquivo;
import java.util.ArrayList;
import java.util.List;
import model.Municipio;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        
        try {
            // Recuperar os municipios
            List<Municipio> municipios = ManipuladorArquivo.lerArquivoMunicipio("etc\\municipios.csv");
            
            // Alternativa A
            Municipio municipioPesquisa = new Municipio("2706703");
            
            int index = municipios.indexOf(municipioPesquisa);
            if (index > -1) {
                System.out.println("O nome do municipio de código " 
                        + municipios.get(index).getCodigoIBGE() 
                        + " eh " + municipios.get(index).getNome());
            }
            
            // Alternativa B
            municipioPesquisa = new Municipio("148233");
            index = municipios.indexOf(municipioPesquisa);
            if (index > -1) {
                System.out.println("Existe um municipio de código " + municipios.get(index).getCodigoIBGE());
            } else {
                System.out.println("Não existe um municipio de código " + municipioPesquisa.getCodigoIBGE());
            }
            
            // Alternativa C
            municipioPesquisa = new Municipio("2919157");
            index = municipios.indexOf(municipioPesquisa);
            if (index > -1) {
                System.out.println("O estado do municipio de código " + municipios.get(index).getCodigoIBGE()
                + " eh " + municipios.get(index).getEstado());
            }
            
            // Realizando a exclusão
            List<Municipio> municipiosRemover = new ArrayList<>();
            municipiosRemover.add(new Municipio("2933000"));
            municipiosRemover.add(new Municipio("1301852"));
            municipiosRemover.add(new Municipio("2111805"));
            
            // Mostrar quanto s municipios existiam antes da exclusão
            System.out.println(municipios.size());
            /* Aqui foi usado o método removeAll que remove os elementos de uma coleção da outra
             * Uma forma alternativa poderia ser excluir um elemento por vez, como por exemplo:
             * municipios.remove(new Municipio("2111805"))
             */
            System.out.println(municipios.removeAll(municipiosRemover));
            // Mostrar quanto s municipios existiam depois da exclusão
            System.out.println(municipios.size());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
