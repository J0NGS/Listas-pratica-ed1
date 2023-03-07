package Q37;

import java.util.Scanner;

public class SumWithRec {
    public static int somaNumerosIntervalo(int num1, int num2) {
        if (num1 > num2) {
            return 0;
        } else {
            return num1 + somaNumerosIntervalo(num1 + 1, num2);
        }
    }
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o primeiro número: ");
        int num1 = kb.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = kb.nextInt();
        
        int soma = somaNumerosIntervalo(num1, num2);
        
        System.out.println("A soma dos números do intervalo [" + num1 + ", " + num2 + "] é: " + soma);
    }
    
}
