package Q40;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decodificador {
    public static void main(String[] args) {
        try {
            // Abre o arquivo de entrada
            File arquivoEntrada = new File("teste.txt.codificado");
            Scanner scanner = new Scanner(arquivoEntrada);

            // Abre o arquivo de saída
            File arquivoSaida = new File("testedecodificado.txt");
            PrintWriter printWriter = new PrintWriter(arquivoSaida);

            // Loop para processar cada linha do arquivo de entrada
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();

                // Loop para processar cada caractere da linha
                for (int i = 0; i < linha.length(); i++) {
                    char c = linha.charAt(i);

                    // Realiza a troca de letras
                    if (c == 'Z') {
                        c = 'P';
                    } else if (c == 'P') {
                        c = 'Z';
                    } else if (c == 'E') {
                        c = 'O';
                    } else if (c == 'O') {
                        c = 'E';
                    } else if (c == 'N') {
                        c = 'L';
                    } else if (c == 'L') {
                        c = 'N';
                    } else if (c == 'I') {
                        c = 'A';
                    } else if (c == 'A') {
                        c = 'I';
                    } else if (c == 'T') {
                        c = 'R';
                    } else if (c == 'R') {
                        c = 'T';
                    }

                    // Escreve o caractere no arquivo de saída
                    printWriter.print(c);
                }

                // Escreve uma quebra de linha no arquivo de saída
                printWriter.println();
            }

            // Fecha os arquivos
            scanner.close();
            printWriter.close();

            System.out.println("Arquivo decodificado com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}