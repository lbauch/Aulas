/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;

import io.ManipuladorArquivo;
import java.util.Collections;
import java.util.List;
import model.Municipio;
import model.MunicipioEstadoComparator;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        try {
            // Recuperar os municipios
            List<Municipio> municipios = ManipuladorArquivo.lerArquivoMunicipio("ect\\municipios.csv");
            
            // Esse Collections.sort executa a ordenação natural (Comparable.compareTo)
            Collections.sort(municipios);
            
            // Escrever o arquivo ordenado por ordem alfabetica crescente de nome de municipio
            ManipuladorArquivo.escreverMunicipio("ect\\municipios2.csv", municipios);
            
            // Collections.sort usando o Comparator executa a ordenação artificial (Comparator.compare)
            // nesse caso o reversed serve para pegar a ordem artificial inversa, ou seja, o contário.
            Collections.sort(municipios, new MunicipioEstadoComparator().reversed());
            
            // Escrever o arquivo ordenado por ordem alfabetica descrescente de nome de estado
            ManipuladorArquivo.escreverMunicipio("ect\\municipios3.csv", municipios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
