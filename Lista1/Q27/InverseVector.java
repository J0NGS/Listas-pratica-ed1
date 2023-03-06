package Q27;
import java.util.Scanner;

public class InverseVector {
    static Scanner kb = new Scanner(System.in);

    public static int[] Inverse(int v[]){
        int tan = v.length;
        int inverse [] = new int [tan];
        for(int i = 0; i< tan; i++){
            inverse[i] = v[tan - 1 - i];
        }
        return inverse;
    }

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
        System.out.println("Vetor invertido");

        int inverse[] = Inverse(vector);
        for(int i = 0; i <= (inverse.length - 1); i++ ){
            System.out.println("Elemento " + i + " = " + inverse[i]);
        }
        kb.close();  
    }
}

