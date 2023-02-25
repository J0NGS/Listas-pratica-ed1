package Q10;
import java.util.Scanner;

public class ParOuImpar10 {
    public static class ParOuImpar{
        public Boolean CheckPair(int number){
            Boolean pair = true;
            if(number % 2 > 0){
                pair = false;
            }
            return pair;
        }
    }

    private static Scanner keyboard =  new Scanner(System.in);

    public static void main(String[] args){
        int num;
        ParOuImpar parImpar = new ParOuImpar();
        System.out.println("Digite um número inteiro para saber se é par ou impar");
        num = keyboard.nextInt();
        System.out.println("-------------------------------------------------------------");
        if(parImpar.CheckPair(num)){
            System.out.println("Número " + num + " é par");
        } else{
            System.out.println("Número " + num + " é impar");
        }
    }
}