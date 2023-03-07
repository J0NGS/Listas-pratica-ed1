package Q34;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountString {
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

        kb.close();
        }
    }

