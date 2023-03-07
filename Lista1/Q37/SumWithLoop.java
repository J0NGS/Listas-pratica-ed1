package Q37;

import java.util.Scanner;

public class SumWithLoop {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o primeiro número: ");
        int num1 = kb.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = kb.nextInt();
        
        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            soma += i;
        }
        
        System.out.println("A soma dos números do intervalo " + num1 + ", " + num2 + " é: " + soma);
    }
}
