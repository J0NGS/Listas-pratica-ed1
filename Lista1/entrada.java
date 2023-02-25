
import java.util.*;

public class entrada {
    static class Info{
        int age;
        float heigh;
        char firstChar;
        String name;
    }

    private static Scanner keyboard = new Scanner(System.in);

     public static void main(String[] args) {
        Info data = new Info();
        System.out.println("Digite sua idade");
        data.age = keyboard.nextInt();
        System.out.println("Digite sua altura");
        data.heigh = keyboard.nextFloat();
        System.out.println("Digite a primeira letra do seu nome");
        data.firstChar = keyboard.next().charAt(0);                      //função que pega apenas o char representado pelo index
        
        keyboard.nextLine();                                            //limpando o buffer do teclado
        
        System.out.println("Digite seu nome");
        data.name = keyboard.nextLine();
        
        System.out.println("Olá " + data.name  + " seu nome começa com a letra " + data.firstChar +  " você possui " + data.heigh + " de altura, e tem " +  data.age + " anos." );
    }
}
