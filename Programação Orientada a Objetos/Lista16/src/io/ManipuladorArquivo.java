/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Municipio;

/**
 * Classe criada para auxiliar nos trabalhos de leitura e escrita de dados
 * @author evand
 */
public class ManipuladorArquivo {
    
    /**
     * Construtor privado pois é uma classe auxiliar, só com métodos estáticos
     */
    private ManipuladorArquivo() {}
    
    /**
     * Método para ler um arquivo de municípios no formato CSV
     * @param origem
     * @return
     * @throws FileNotFoundException 
     */
    public static List<Municipio> lerArquivoMunicipio(String origem) throws FileNotFoundException {
        // Verificar se origem é uma String válida
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        // Criar objeto de File
        File fileOrigem = new File(origem);
        
        // Verificar se o File existe e é um arquivo
        if (!fileOrigem.exists() 
                || !fileOrigem.isFile()) {
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
        }
        
        try (Scanner scanner = new Scanner(fileOrigem, "UTF-8")) {
            
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
                 * primeiro validamos para ver se não exitem dados faltantes ou nulos.
                 * Caso todos os dados sejam validos, então nós pegamos e criamos 
                 * um objeto de Municipio para representar manipular posteriormente.
                 * Caso algum dos dados não seja válido, nós não executamos nenhuma operação,
                 * por isso do if.
                 */
                if (dadoValido(dados[0])
                        && dadoValido(dados[1]) && dadoValido(dados[2])
                        && dadoValido(dados[3])) {
                   Municipio municipio = new Municipio(dados[0], 
                        dados[1], 
                        dados[2], 
                        Integer.parseInt(dados[3]));
                
                    // Adicionar o objeto no arraylist
                    municipios.add(municipio); 
                }
                
                
            }
            return municipios;
        }
    }
    
    /**
     * Método para validar se uma string não é nula ou vazia
     * @param dado
     * @return 
     */
    private static boolean dadoValido(String dado) {
        return dado != null && !dado.isBlank();
    }
    
    /**
     * Le um arquivo de municípios e retorna um Map, onde a chave do map é o nome de um estado e
     * o seu valor é uma lista com o municípios do estado
     * @param origem
     * @return
     * @throws FileNotFoundException 
     */
    public static Map<String, List<Municipio>> lerArquivoMunicipioMap(String origem) throws FileNotFoundException {
        // Verificar se origem é uma String válida
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        // Criar objeto de File
        File fileOrigem = new File(origem);
        
        // Verificar se o File existe e é um arquivo
        if (!fileOrigem.exists() 
                || !fileOrigem.isFile()) {
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
        }
        
        try (Scanner scanner = new Scanner(fileOrigem, "UTF-8")) {
            
            // Verificar se tem uma linha para ser lida
            if (scanner.hasNext()) {
                // ignorar a primeira linha pois ela só tem dados do cabeçalho
                scanner.nextLine();
            }
            
            Map<String, List<Municipio>> estados = new HashMap<>();
            
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
                 * primeiro validamos para ver se não exitem dados faltantes ou nulos.
                 * Caso todos os dados sejam validos, então nós pegamos e criamos 
                 * um objeto de Municipio para representar manipular posteriormente.
                 * Caso algum dos dados não seja válido, nós não executamos nenhuma operação,
                 * por isso do if.
                 */
                if (dadoValido(dados[0])
                        && dadoValido(dados[1]) && dadoValido(dados[2])
                        && dadoValido(dados[3])) {
                   Municipio municipio = new Municipio(dados[0], 
                        dados[1], 
                        dados[2], 
                        Integer.parseInt(dados[3]));
                   
                   // Se o Map não contem a chave
                   if (!estados.containsKey(municipio.getEstado())) {
                       // Incluimos a chave, com um ArrayList vazio como valor
                       estados.put(municipio.getEstado(), new ArrayList<>());
                   }
                   
                   /* Recuperamos o valor da chave (um arrayList) e adicionamos 
                    * o municipio a ele. É importante garantir que a chave tenha um
                    * valor, senão o vamos ter um nullpointer, por isso o if anterior
                    */
                   estados.get(municipio.getEstado()).add(municipio);
                }
                
                
            }
            return estados;
        }
    }
    
    /**
     * Escreve o lista de municipios no destino
     * @param destino
     * @param municipios
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public static void escreverMunicipio(String destino, List<Municipio> municipios) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // Verificar se destino é uma String válida
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        // Criar um Path para fazer as operações/verificações com caminho de destino
        Path caminhoDestinho = Paths.get(destino);
        // Verifica o se o path existe.
        if (!Files.exists(caminhoDestinho)) {
            // se o path não existir verifica os diretórios pais
            if (!Files.exists(caminhoDestinho.getParent())) {
                // se os diretórios pais não existirem, cria
                Files.createDirectories(caminhoDestinho.getParent());
            }
            // Depois de criados os diretórios pais, se cria o path como um arquivo
            Files.createFile(caminhoDestinho);
        }
        
        // Transforma o objeto de Path em um objeto de File
        File fileDestino = caminhoDestinho.toFile();
        
        try(PrintWriter writter = new PrintWriter(fileDestino, "UTF-8");) {
            
            // Para cada municipio da lista
            for (Municipio municipio : municipios) {
                // Criar uma String com os dados do municipio separados por ';'
                String linha = String.join(";", 
                        municipio.getCodigoIBGE(),
                        municipio.getNome(),
                        municipio.getEstado(),
                        municipio.getPopulacao() + "");
                
                // Escrever a String no arquivo
                writter.println(linha);
            }
        }
    }
    
    /**
     * Retorna um Map com as palavras de um arquivo e quantas vezes elas ocorreram
     * @param origem
     * @return
     * @throws FileNotFoundException 
     */
    public static Map<String, Integer> contarPalavrasArquivos(String origem) throws FileNotFoundException {
        // Verificar se origem é uma String válida
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        // Criar objeto de File
        File fileOrigem = new File(origem);
        
        // Verificar se o File existe e é um arquivo
        if (!fileOrigem.exists() 
                || !fileOrigem.isFile()) {
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
        }
        
        try (Scanner scanner = new Scanner(fileOrigem, "UTF-8")) {
            // Define os delimitadores das palavras
            // \s = espaços em branco = \n\r\t
            // ,;.:?!- pontuações
            // () parenteses
            // \\'\\\" aspas simples e duplas
            // \\\\| pipe (|), que também pode ser usado como delimitador
            scanner.useDelimiter("[\s,;.:?!()-/\\'\\\"\\\\|]");
            // map para armazenar o retorno
            Map<String, Integer> palavras = new HashMap<>();
            
            // verificar se o arquivo tem mais linhas para serem lidas
            while (scanner.hasNext()) {
                String palavra = scanner.next().toLowerCase();
                
                // se o map não tem a palavra ainda
                if (!palavras.containsKey(palavra)) {
                    // adiciona a palavra como chave e atribui o valor dela como 1
                    palavras.put(palavra, 1);
                } else {
                    // Caso a palavra já exista, a gente incrementa o valor previamente armazenado
                    // recuperando o valor anterior e somando mais 1 e atribuindo ela a mesma chave
                    palavras.put(palavra, palavras.get(palavra) + 1);
                }
            }
            
            return palavras;
        }
    }
    
}
