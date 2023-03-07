package Q28;

import java.util.Scanner;

public class MaiorMenorVector {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que deseja inserir no vetor:");
        int qtd = kb.nextInt();
        
        int[] vector = new int[qtd];
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o " + (i + 1) + " número:");
            vector[i] = kb.nextInt();
        }
        
        int max = vector[0];
        int min = vector[0];
        
        for (int i = 1; i < qtd; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        
        System.out.println("O maior número é: " + max);
        System.out.println("O menor número é: " + min);
        kb.close();
    }
}
