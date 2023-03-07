package Q33;

import java.util.Scanner;

public class CountChar {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite uma palavra:");
        String palavra = kb.nextLine();

        int[] letras = new int[50]; 
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                letras[c - 'a']++;
            }
        }

        System.out.println("Quantidade de letras na palavra digitada :");
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] > 0) {
                System.out.println((char) (i + 'a') + " - " + letras[i]);
            }
        }
        kb.close();
    }
}
