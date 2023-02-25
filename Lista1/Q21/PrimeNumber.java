package Q21;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean IsPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(number); i++){     //se um número x tem um divisor maior que sua raiz quadrada
            if(number%i == 0){                          // ele tem um divisor menor que sua raiz quadrada
                return false;
            }
        }
        return true;
    }

    private static Scanner keyboard =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um número para verificar se é primo");
        if(IsPrime(keyboard.nextInt())){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
