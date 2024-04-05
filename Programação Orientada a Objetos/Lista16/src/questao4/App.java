/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

import io.ManipuladorArquivo;
import java.util.List;
import java.util.Map;
import model.Municipio;

/**
 *
 * @author evand
 */
public class App {
    
    public static void main(String[] args) {
        try {
            // Recuperar os municipios, separados por estado
            Map<String, List<Municipio>> listaMunicipios = ManipuladorArquivo.lerArquivoMunicipioMap("ect\\municipios.csv");
            
            // Percorrer a lista de EntrySet (Par de chave, valor) para mostrar os estados seus municipios
            for (Map.Entry<String, List<Municipio>> par : listaMunicipios.entrySet()) {
                System.out.println(par.getKey() + " " + par.getValue());
                
                /* Agora uma aplicação: Usar esse Map, para mostrar a população total de cada estado,
                 * somando as populações de cada municipio do estado
                 */
                // Criamos uma variável contadora
                int i = 0;
                // Vamos percorrer o valor do EntrySet, que a lista de municipios para o estado
                for (Municipio municipio : par.getValue()) {
                    // Para cada municipios, adicionamos a populações dele ao total
                    i += municipio.getPopulacao();
                }
                System.out.println(par.getKey() + " tem " + i + " habitantes, de acordo com o arquivo municipios.csv ");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
