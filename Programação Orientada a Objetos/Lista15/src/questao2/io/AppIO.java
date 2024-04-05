/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evand
 */
public class AppIO {
    
    private AppIO() {}
    
    public static void salvarDadosArquivo(String conteudo, String destino) throws IOException {
        // Verifica se a String de destino é válida
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("Destino nulos ou vazios");
        }
        
        // // Criar um Path para fazer as operações/verificações com caminho de destino
        Path caminhoDestinho = Paths.get(destino);
        // Verifica o se o arquivo existe.
        if (!Files.exists(caminhoDestinho)) {
            // se o arquivo não existir verifica os diretoórios
            if (!Files.exists(caminhoDestinho.getParent())) {
                // se os diretórios não existirem, cria
                Files.createDirectories(caminhoDestinho.getParent());
            }
            
            // Depois de criados os diretórios pais, se cria o arquivo
            Files.createFile(caminhoDestinho);
        }
        
        // Transforma o objeto de Path em um objeto de File
        File fileDestino = caminhoDestinho.toFile();
        
        // Escreve os dados
        try(PrintWriter writter = new PrintWriter(fileDestino, "UTF-8")) {
                writter.print(conteudo);
            
        }
    }
    
    public static String lerDadosArquivoBufferedReader(String origem) throws IOException {
        // Verifica se a String de origem é válida
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        
        // Cria o objeto de File, representando o arquivo
        File fileOrigem = new File(origem);
        
        // Valida o arquivo de origem, para verificar se ele existe e é um arquivo
        if (!fileOrigem.exists()) {
            // Se o arquivo não existe, retorna null, pois não temos dados iniciais
            return null;
        } else if (!fileOrigem.isFile()) {
            // Se o objeto de File não representa um arquivo, isso é um erro
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
        }
        // Faz a leitura das linhas
        ArrayList<String> linhas = new ArrayList<>();
        String linha;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOrigem, Charset.forName("UTF-8")))) {
            while((linha = bufferedReader.readLine()) != null) {
                linhas.add(linha);
            }
        }
        // Junta todas as linhas em um String. As linhas são separadas por \n
        return String.join("\n", linhas);
    }
    
    public static String lerDadosArquivoScanner(String origem) throws IOException {
        // Verifica se a String de origem é válida
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        
        // Cria o objeto de File, representando o arquivo
        File fileOrigem = new File(origem);
        
        // Valida o arquivo de origem, para verificar se ele existe e é um arquivo
        if (!fileOrigem.exists()) {
            // Se o arquivo não existe, retorna null, pois não temos dados iniciais
            return null;
        } else if (!fileOrigem.isFile()) {
            // Se o objeto de File não representa um arquivo, isso é um erro
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
        }
        // Faz a leitura das linhas
        ArrayList<String> linhas = new ArrayList<>();
        try(Scanner scanner = new Scanner(fileOrigem, "UTF-8")) {
            while(scanner.hasNext()) {
                linhas.add(scanner.nextLine());
            }
        }
        // Junta todas as linhas em um String. As linhas são separadas por \n
        return String.join("\n", linhas);
    }
    
}
