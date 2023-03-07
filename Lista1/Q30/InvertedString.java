package Q30;

import java.util.Scanner;

public class InvertedString {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite a frase que deseja inverter:");
        String frase = kb.nextLine();
        
        StringBuilder fraseInvertida = new StringBuilder();
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        
        System.out.println("Frase invertida: " + fraseInvertida.toString());
    }
}
