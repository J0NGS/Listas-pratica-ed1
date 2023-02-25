package Q11;
import java.text.DecimalFormat;
import java.util.*;

public class TransferBank {
    public static class Account{
        float balance = (float)100;

        public void MakeTransfer(float value){
            this.balance -= value ;
            System.out.println("Transferência concluida");
        }

        public void ReceiveTransfer(float value){
            this.balance += value ;
            System.out.println("Transferência de " + value + " Recebida");
        }

        public float GetBalance(){
            return this.balance;
        }
    }
    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args){
        Account account1 =  new Account();
        Account account2 =  new Account();
        float value;
        DecimalFormat df = new DecimalFormat("#,###.##' R$'");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Saldo da conta 1 : " + df.format(account1.GetBalance()));
        System.out.println("Saldo da conta 2 : " + df.format(account2.GetBalance()));
        System.out.println("Digite Quanto você deseja transferir da conta 1 para a conta 2");
        value = keyboard.nextFloat();
        try {
            if(value > account1.GetBalance()){
                throw new Exception("Saldo insuficiente");
            }
            account1.MakeTransfer(value);
            account2.ReceiveTransfer(value);
        } catch (Exception e) {
            System.out.println("O saldo da conta 1 é insuifciente para a transferência, por favor tente novamente");
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Saldo da conta 1 : " + df.format(account1.GetBalance()));
        System.out.println("Saldo da conta 2 : " + df.format(account2.GetBalance()));
    }
}
