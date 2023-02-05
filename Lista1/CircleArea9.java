package Lista1;
import java.text.DecimalFormat;
import java.util.Scanner;;

public class CircleArea9 {
   public static class Circle{
    private Double radius;

    public Double CircleArea(){
        double area;
        area = Math.PI * Math.pow(this.radius, 2);
        return area; 
    }

    public Double GetArea(){
        return CircleArea();
    }

    public Double GetRadius(){
        return this.radius;
    }

    public void SetRadius(Double Radius){
        this.radius = Radius;
        System.out.println("Radius of circle changed to :" + this.radius);
    }
   }

   private static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args){
    Circle circle = new Circle();
    DecimalFormat df = new DecimalFormat("##.###");
    System.out.println("Qual o raio do circulo?");
    circle.SetRadius(keyboard.nextDouble());
    System.out.println("-------------------------------------------------------------");
    System.out.println("the area of the circle is: " +  df.format(circle.CircleArea()));
   }
}
