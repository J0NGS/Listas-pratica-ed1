package Lista1;

import java.util.*;;

public class mathOperations {
    static class Numbers{
        int n1, n2;
        // Metodo para soma
        int sum(){
            int summation;
            summation = n1+ n2;
            return summation;
        }
        // Metodo para subtração
        int substraction(){
            int sub;
            sub = n1 - n2;
            return sub;
        }
        // Metodo para multiplicação
        int multiplication(){
            int mult;
            mult = n1 * n2;
            return mult;
        }
        
        // Metodo para divisão
        int division(){
        int mult;
        mult = n1/n2;
        return mult;
        }
        
        // Metodo para resto da divisão
        int remainder(){
            int rem;
            rem = n1%n2;
            return rem;
        }
    }


    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Numbers num = new Numbers();
        System.out.println("Digite dois números inteiros, n1 e n2 respectivamente");
        num.n1 = keyboard.nextInt();
        num.n2 = keyboard.nextInt();
        System.out.println("---------------------------------------------------------");
        System.out.println("RESULTADO DAS OPERAÇÕES");
        System.out.println("---------------------------------------------------------");
        System.out.println("ADIÇÃO (n1 + n2) : ");
        System.out.println("Total = " + num.sum());
        System.out.println("---------------------------------------------------------");
        System.out.println("SUBTRAÇÃO (n1 - n2) : ");
        System.out.println("Total = " + num.substraction());
        System.out.println("---------------------------------------------------------");
        System.out.println("MULTIPLICAÇÃO (n1 * n2) : ");
        System.out.println("Total = " + num.multiplication());
        System.out.println("---------------------------------------------------------");
        System.out.println("Divisão (n1/n2) : ");
        System.out.println("Quociente da divisão = " + num.division());
        System.out.println("Resto da divisão = "     + num.remainder());
        System.out.println("---------------------------------------------------------");


    }
}
