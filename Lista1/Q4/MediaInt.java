package Q4;
import java.util.*;

public class MediaInt {
     static class Notas{
        int n1,n2,n3 = 0;
        int media(){
            int mediaAri;
            mediaAri = (n1 + n2 + n3)/3;
            return mediaAri;
        }
    }

    private static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        Notas notas = new Notas();
        System.out.println("digite 3 numeros");
        notas.n1 = keyboard.nextInt();
        notas.n2 = keyboard.nextInt();
        notas.n3 = keyboard.nextInt();
        System.out.println("A media dos 3 números inteiros é : " + notas.media());
    }
}
