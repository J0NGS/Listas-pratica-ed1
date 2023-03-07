package Q29;

import java.util.Scanner;

public class FirstToLast {

    public static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Digite a quantidade de números que deseja inserir no vetor:");
        int tamanhoVetor = kb.nextInt();
        
        int[] vetor = new int[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = kb.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor inicial elemento " + i + " :" + vetor[i]);
        }
        while (tamanhoVetor > 1) {
            int ultimoNumero = vetor[tamanhoVetor - 1];
            for (int i = tamanhoVetor - 1; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = ultimoNumero;
            tamanhoVetor--;
            for(int i = 0; i < vetor.length; i++){
                System.out.println("Vetor final elemento " + i + " :" + vetor[i]);
            }
        }

    }
}
