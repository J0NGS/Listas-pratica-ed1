package Q15;
import java.util.Scanner;

public class NumberInt15 {

    private static Scanner keyboard = new Scanner(System.in);
    public static void main (String [] args){
        float number = 0;
        System.out.println("Digite um número");
        number = keyboard.nextInt();
        try {
            if(number >= 1 && number <= 5){
                if(number == 1){
                System.out.println("Um");
            }
            if(number == 2){
                System.out.println("Dois");
            }
            if(number == 3){
                System.out.println("Três");
            }
            if(number == 4){
                System.out.println("Quatro");
            }
            if(number == 5){
                System.out.println("Cinco");
            }
            } else {
                throw new Exception("Número inválido");
                
            }
        } catch (Exception e) {
            System.out.println("Valor inválido, digite um número no intervalo de 1 a 5");
            number = keyboard.nextInt();
            if(number >= 1 && number <= 5){
                if(number == 1){
                System.out.println("Um");
            }
            if(number == 2){
                System.out.println("Dois");
            }
            if(number == 3){
                System.out.println("Três");
            }
            if(number == 4){
                System.out.println("Quatro");
            }
            if(number == 5){
                System.out.println("Cinco");
            }
        }
    }
}
}