package Q40;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Codificador {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o nome do arquivo a ser codificado: ");
        String nomeArquivo = kb.nextLine();
        File arquivoEntrada = new File(nomeArquivo);

        StringBuilder textoCodificado = new StringBuilder();
        try (Scanner leitor = new Scanner(arquivoEntrada)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                for (char c : linha.toCharArray()) {
                    char cCodificado = codificarCaractere(c);
                    textoCodificado.append(cCodificado);
                }
                textoCodificado.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de entrada: " + e.getMessage());
            return;
        }

        String nomeArquivoSaida = nomeArquivo + ".codificado";
        try (FileWriter escritor = new FileWriter(nomeArquivoSaida)) {
            escritor.write(textoCodificado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de saída: " + e.getMessage());
            return;
        }

        System.out.println("Arquivo codificado gerado com sucesso: " + nomeArquivoSaida);
    }

    private static char codificarCaractere(char c) {
        switch (c) {
            case 'Z':
                return 'P';
            case 'P':
                return 'Z';
            case 'E':
                return 'O';
            case 'O':
                return 'E';
            case 'N':
                return 'L';
            case 'L':
                return 'N';
            case 'I':
                return 'A';
            case 'A':
                return 'I';
            case 'T':
                return 'R';
            case 'R':
                return 'T';
            default:
                return c;
        }
    }
}