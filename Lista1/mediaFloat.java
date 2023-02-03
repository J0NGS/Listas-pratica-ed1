package Lista1;
import java.text.DecimalFormat;
import java.util.*;

public class mediaFloat {
    static class Notas{
       float n1,n2,n3 = 0;
       float media(){
           float mediaAri;
           mediaAri = (n1 + n2 + n3)/3;
           return mediaAri;
       }
   }

   private static Scanner keyboard = new Scanner(System.in);


   public static void main(String[] args) {
       Notas notas = new Notas();
       System.out.println("digite 3 numeros");
       notas.n3 = keyboard.nextFloat();
       notas.n2 = keyboard.nextFloat();
       notas.n1 = keyboard.nextFloat();
       DecimalFormat df = new DecimalFormat("#.##");
       String strFloat = df.format(notas.media());
       System.out.println("A media dos 3 números inteiros é : " + strFloat );
   }
}