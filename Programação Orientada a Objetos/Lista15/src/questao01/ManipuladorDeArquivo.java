/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author evand
 */
public class ManipuladorDeArquivo {
    
    public void copiarDados(String origem, String destino) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // Verificar se origem é uma String válida
        if (origem == null || origem.isBlank()
                || destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("Origem ou Destino nulos ou vazios");
        }
        // Criar objeto de File
        File fileOrigem = new File(origem);
        
        // Verificar se o File existe e é um arquivo
        if (!fileOrigem.exists() 
                || !fileOrigem.isFile()) {
            throw new IllegalArgumentException("Origem não existe ou não é um arquivo");
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
        
        // Faz a copia do conteudo
        try(PrintWriter writter = new PrintWriter(fileDestino, "UTF-8");
                Scanner scanner = new Scanner(fileOrigem, "UTF-8")) {
            
            while (scanner.hasNext()) {
                writter.println(scanner.nextLine());
                
            }
            
        }
    }
    
}
