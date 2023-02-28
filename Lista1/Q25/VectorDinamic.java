package Q25;

import java.util.Scanner;
import java.util.Vector;

public class VectorDinamic {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int qtd;
        System.out.println("Quantos inteiros você deseja inserir no vetor");
        qtd = kb.nextInt();
        int vector [] = new int [qtd];
        for(int i = 0;i<=(qtd - 1); i++){
            System.out.println("Digite o elemento " + i + " do vetor");
            vector[i] = kb.nextInt(); 
        }
        for(int i = 0; i <= (vector.length - 1); i++ ){
            System.out.println("Elemento " + i + " = " + vector[i]);
        }
        kb.close();  
    }
}
