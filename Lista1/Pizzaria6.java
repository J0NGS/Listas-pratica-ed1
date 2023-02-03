package Lista1;

import java.util.Scanner;
import java.text.*;

public class Pizzaria6 {
    static float soda  = (float)1.50;
    static float pizza = (float)3.00;
    static float tax   = (float)0.10;
    

    public static class Cashier{
        public float tab(int sodaAux, int pizzaAux){
            float bill;
            float billTax;

            bill    = (soda*sodaAux + pizza*pizzaAux);
            billTax = tax * bill;
            bill += billTax;

            return bill; 
        }

        public float tabNoTax(int sodaAux, int pizzaAux){
            float bill;
            bill    = (soda*sodaAux + pizza*pizzaAux);
            return bill; 
        }

        public float tabDivision(int sodaAux, int pizzaAux, int clients){
            float bill = tab(sodaAux, pizzaAux)/clients;
            return bill;
        }
        
    }

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        int qtdPizza, qtdSoda, qtdClients;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Quantas fatias de pizza foram consumidas?");
        qtdPizza   = keyboard.nextInt();
        System.out.println("Quantos refrigerantes foram consumidos?");
        qtdSoda    = keyboard.nextInt();
        System.out.println("É necessário dividir a conta para quantas pessoas?");
        qtdClients = keyboard.nextInt();
        System.out.println("-------------------------------------------------------------");
        System.out.println("O total ficou : "  + df.format(cashier.tabNoTax(qtdSoda, qtdPizza)));
        System.out.println("O total com os 10% do garçom ficou : " + df.format(cashier.tab(qtdSoda, qtdPizza)));
        System.out.println("O total por pessoa ficou : "  + df.format(cashier.tabDivision(qtdSoda, qtdPizza, qtdClients)));

    }
}
