
import java.text.DecimalFormat;
import java.util.Scanner;

public class ImcCalculator8 {
    public static class Imc{
        public float height, Weight;
        public float ImcCalculator(){
            float w = this.Weight;
            float h = this.height;
            float imc  = (w/(h*h));
            return imc;
        }
    }

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Imc imc  = new Imc();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Qual o seu peso?");
        imc.Weight = keyboard.nextFloat();
        System.out.println("Qual a sua altura?");
        imc.height = keyboard.nextFloat();
        System.out.println("--------------------------------------------------");
        System.out.println("Seu imc é -> " + df.format(imc.ImcCalculator()));
    }
}
