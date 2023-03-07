package Q35;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountString2 {
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite uma frase:");
        String frase = kb.nextLine();

        Map<String, Integer> ocorrencias = new HashMap<String, Integer>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (!ocorrencias.containsKey(palavra)) {
                ocorrencias.put(palavra, 1);
            } else {
                int contagem = ocorrencias.get(palavra);
                ocorrencias.put(palavra, contagem + 1);
            }
        }

        System.out.println("Resultado:");
        for (String palavra : ocorrencias.keySet()) {
            int contagem = ocorrencias.get(palavra);
            System.out.println(palavra + "=" + contagem);
        }
        
        //Salva arquivo csv
        try {
            FileWriter writer = new FileWriter("resultado.csv");
            writer.write("palavra,ocorrencias\n");
            for (String palavra : ocorrencias.keySet()) {
                int contagem = ocorrencias.get(palavra);
                writer.write(palavra + "," + contagem + "\n");
            }
            writer.close();
            System.out.println("Resultado salvo em resultado.csv");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
        }

    // Lê arquivo csv
    try {
        File arquivo = new File("resultado.csv");
        Scanner leitor = new Scanner(arquivo);
    
        // Ignora primeira linha (cabeçalho)
        leitor.nextLine();
    
        // Lê as demais linhas e exibe o conteúdo na tela
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] campos = linha.split(",");
            String palavra = campos[0];
            int contagem = Integer.parseInt(campos[1]);
            System.out.println(palavra + "=" + contagem);
        }

        leitor.close();
    } catch (IOException e) {
        System.out.println("Erro ao ler arquivo");
    }

        kb.close();
    }
}
