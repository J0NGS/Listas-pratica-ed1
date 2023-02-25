import java.util.Scanner;

public class Tabuada19 {
    public static void MultiplactionTab(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (i*number));
        }
    }

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Digite um número para exibir a tabuada do mesmo");
        MultiplactionTab(keyboard.nextInt());
    }
}
