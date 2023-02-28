package Q26;

import java.util.Scanner;

public class MatrixDinamic {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int row, colun;
        System.out.println("Quantos linhas você deseja inserir na matriz");
        row = kb.nextInt();
        System.out.println("Quantos colunas você deseja inserir na matriz");
        colun = kb.nextInt();
        int matrix [][] = new int [row][colun];
        for(int i = 0;i<=(row - 1); i++){
            for(int l = 0; l <=(colun - 1); l++){
                System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (l+1));
                matrix[i][l] = kb.nextInt(); 
            }
        }
        for(int i = 0;i<=(row - 1); i++){
            for(int l = 0; l <=(colun - 1); l++){
                System.out.print("elemento da linha " + (i+1) + " e coluna " + (l+1) + ": ");
                System.out.println(matrix[i][l]);
                
            }
        }
        kb.close();  
    
}

}
