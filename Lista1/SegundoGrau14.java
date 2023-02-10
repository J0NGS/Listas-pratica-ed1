package Lista1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SegundoGrau14 {
    private static DecimalFormat df = new DecimalFormat("##.##");
    public static float Delta(float a, float b, float c){
        float delta = 0;
        delta =  ((b*b) - (4*(a * c)));
        return delta;
    }
    public static void Raizes(float a, float delta, float b){
        float x1, x2 = 0;
        x1 =(
            (b * -1) + ((float)Math.sqrt(delta)))/(2*a);
        x2 =(
            (b * -1) - ((float)Math.sqrt(delta)))/(2*a);
        System.out.println("X1 -> " + df.format(x1));
        System.out.println("X2 -> " + df.format(x2));
    }

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        float x,y,z = 0;
        System.out.println("Digite o X,Y,Z da equação respectivamente : ");
        x = keyboard.nextFloat();
        y = keyboard.nextFloat();
        z = keyboard.nextFloat();
        System.out.println("-----------------------------------------");
        System.out.println("O delta da equação é -> " + Delta(x, y, z));
        Raizes(x, Delta(x, y, z), y);
    }
}
