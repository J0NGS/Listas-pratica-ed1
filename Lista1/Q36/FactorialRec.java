package Q36;

import java.util.Scanner;

import Q31.main;

public class FactorialRec {
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n-1);
        }
    }

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Qual número vocÇe deseja calcular o fatorial?");
        int number = kb. nextInt();
        System.out.println(calcularFatorial(number));
    }
}
