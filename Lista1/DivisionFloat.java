package Lista1;

import java.util.*;

public class DivisionFloat {
    


    public static class Calculator{
        public float FloatDivision(float n1, float n2) throws Exception{
            if(n1  ==  0 || n2 == 0){
                throw new Exception("não é possivel realizar divisões por zero");
            }
            float division;
            division = n1/n2;
            return division;
        }
    }
    private static Scanner keyboard =  new Scanner(System.in);

    public static void main(String[] args) {
        float n1,n2, result = 0;
        Calculator calc = new Calculator();
        System.out.println("Digite o dividendo");
        n1 =  keyboard.nextFloat();
        System.out.println("Digite o divisor");
        n2 =  keyboard.nextFloat();
        try {
            result = calc.FloatDivision(n1, n2);
            System.out.println("-----------------------------------------------------");
            System.out.println(n1 + "/" + n2);
            System.out.println("O resultado é  : " + result);

        } catch (Exception e) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Não é possivel fazer divisões com 0");
            e.printStackTrace();
        }
        
    }
}