package Q24;
import java.util.Scanner;

public class Calculator24 {

    public static void Row(int n){
        for(int i  = 0; i <= n; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void Clear(){
        for(int i  = 0; i <= 50; i++){
            System.out.println();
        }
    }

    public static class CalculatorInt {
        private int number = 0;
        public void CalculatorInt(){
            this.number = 0;
        }
        
        public void CalculatorInt(int number){
            this.number = number;
        }
        public void setNumber(int number){
            this.number =   number;
            System.out.println("Number changed to " +  this.number);
        }
        public int getNumber(){
            return this.number;
        }

        public int potentialization(int index){
            return (int)Math.pow(this.number, index);
        }

        public int squareRoot(){
            return (int)Math.sqrt(this.number);
        }

        public int factorial(){
            int aux = 1;
            for(int i = this.number; i <= 1; i--){
                aux *= i ;
            }
            return aux;
        }
    }

    private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int aux = 10;
        while (aux !=0) {
            Row(15);
            System.out.println("Escolha uma operação");
            System.out.println("1. Potencialização");
            System.out.println("2. Raiz Quadrada");
            System.out.println("3. Fatorial");
            System.out.println("0. Para sair");
            aux = kb.nextInt();
            CalculatorInt calculator =  new CalculatorInt();
            switch (aux) {
                case 1:
                    System.out.println("Digite um número e o expoente");
                    calculator.setNumber(kb.nextInt());
                    int expo = kb.nextInt();
                    kb.nextLine();
                    System.out.println("O resultado é -> " + calculator.potentialization(expo));
                    break;
                case 2:
                    System.out.println("Digite um número para calcular a raiz quadrada");
                    calculator.setNumber(kb.nextInt());
                    System.out.println("O resultado é -> " + calculator.squareRoot());
                    break;
                case 3:
                    Row(15);
                    System.out.println("Digite um número para calcular o fatorial");
                    calculator.setNumber(kb.nextInt());
                    System.out.println("O resultado é -> " + calculator.factorial());                    
                    break;
            }
            

        }

    }
}
