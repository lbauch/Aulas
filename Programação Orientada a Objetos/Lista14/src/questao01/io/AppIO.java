/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import questao01.model.Municipio;

/**
 *
 * @author evand
 */
public class AppIO {
    
    public static void main(String[] args) {
        
        File arquivo = new File("ect\\municipios.csv");
        
        try (Scanner scanner = new Scanner(arquivo, "UTF-8")) {
            
            // Verificar se tem uma linha para ser lida
            if (scanner.hasNext()) {
                // ignorar a primeira linha pois ela só tem dados do cabeçalho
                scanner.nextLine();
            }
            
            // Criar um arraylist para armazenar os dados de todos os municipios
            ArrayList<Municipio> municipios = new ArrayList<>();
            
            // verificar se o arquivo tem mais linhas para serem lidas
            while (scanner.hasNext()) {
                // ler a linha
                String linha = scanner.nextLine();
                /* o padrão de formatação da linha é 'dado1;dado2;dado3;dado4',
                 * sendo assim podemos usar o ';' para dividir a linha em um array,
                 * sendo que cada posição do array vai conter um dos dados.
                 * Para dividir a string, podemos usar o método split
                 */
                String[] dados = linha.split(";");
                
                /* Cada posição do array dados contem uma informação sobre o municipio,
                 * então nós pegamos e criamos um objeto de Municipio para representar
                 * manipular posteriormente
                 *
                 */
                Municipio municipio = new Municipio(dados[0], 
                        dados[1], 
                        dados[2], 
                        Integer.parseInt(dados[3]));
                
                // Adicionar o objeto no arraylist
                municipios.add(municipio);
                
            }
            
            // Criando as variaveis para fazer a pesquisa
            Municipio maiorPopulacao = null;
            Municipio menorPopulacao = null;
            
            // for para percorrer a lista de municipios que foi criada com base no arquivo
            for (Municipio municipio : municipios) {
                
                if (maiorPopulacao == null ||
                        menorPopulacao == null) {
                    /* se as variáveis estão nulas, é a primeira iteração, então
                     * podemos setar o objeto da iteração.
                     */
                    maiorPopulacao = municipio;
                    menorPopulacao = municipio;
                } else {
                    /* Se as variáveis não estão nulas, isso quer dizer que 
                     * devemos fazer a comparação de atributos de forma normal.
                     */
                    if (menorPopulacao.getPopulacao() > municipio.getPopulacao()) {
                        menorPopulacao = municipio;
                    }
                    
                    if (maiorPopulacao.getPopulacao() < municipio.getPopulacao()) {
                        maiorPopulacao = municipio;
                    }
                }
            }
            
            // Exibir o resultado
            if (maiorPopulacao == null || menorPopulacao == null) {
                // Caso as variáveis estejam nulas o arquivo não tinha dados, 
                // então tratamos isso com uma mensagem diferente
                
                System.out.println("O arquivo não tinha dados para pesquisa as cidades com maior e menor população");
            } else {
                System.out.println("Maior populacao: " + maiorPopulacao);
                System.out.println("Menor populacao: " + menorPopulacao);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
