package Q17;
import java.util.Scanner;

public class NumberSequenceOdd {
    public static void NumberSequenceWhile(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando While : ");
        while(initialNumber <= finalNumber ){
            if(initialNumber%2 != 0){
                System.out.print(initialNumber+", ");
            }
            initialNumber++;
        }
    }
    public static void NumberSequenceDoWhile(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando Do-While : ");
        do{
            if(initialNumber%2 != 0){
                System.out.print(initialNumber+", ");}
            initialNumber++;
        } while(initialNumber <= finalNumber );
    }
    public static void NumberSequenceFor(int initialNumber, int finalNumber){
        System.out.print("Sequencia usando For : ");
        for(int i = initialNumber; i<= finalNumber; i++){
            if(i%2 != 0){
                System.out.print(i + ", ");}
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
