import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Sumofintervals {
    public static int SumIntervals(int n1, int n2){
        int aux = 0;
        for(int i = n1; i <= n2; i++){
            aux += i;
        }
        return aux;
    }

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite dois números para somar o intervalo entre eles");
        System.out.println(SumIntervals(kb.nextInt(),kb.nextInt()));
        kb.close();
    }
}
