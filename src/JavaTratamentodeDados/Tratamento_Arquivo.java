package JavaTratamentodeDados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_Arquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\Alysson\\IdeaProjects\\java\\src\\JavaTratamentodeDados\\Teste.txt";
        try {
            FileReader arquivoReader = new FileReader(caminhoArquivo); // Destaca o caminho do arquivo a ser lido
            BufferedReader leitor = new BufferedReader(arquivoReader); // realiza a otimização da leitura do arquivo
            String linha;
            while ((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
        }catch (IOException e){
            System.err.println("Ocorreu um erro na leitura do seu arquivo");
        }
    }

}
