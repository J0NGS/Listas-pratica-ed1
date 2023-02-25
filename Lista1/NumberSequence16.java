import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class NumberSequence16 {
    public static void NumberSequenceWhile(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando While : ");
        while(initialNumber <= finalNumber ){
            System.out.print(initialNumber+", ");
            initialNumber++;
        }
    }
    public static void NumberSequenceDoWhile(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando Do-While : ");
        do{
            System.out.print(initialNumber+", ");
            initialNumber++;
        } while(initialNumber <= finalNumber );
    }
    public static void NumberSequenceFor(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando For : ");
        for(int i = initialNumber; i<= finalNumber; i++){
            System.out.print(i + ", ");
        }
    }

    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Digite o número inicial e o número final do intervalo de números");
        int a, b = 0;
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        NumberSequenceDoWhile(a, b);
        NumberSequenceFor(a, b);
        NumberSequenceWhile(a, b);
    }
}
