import java.util.Scanner;

public class PasswordVerifyDoWhile18 {
    private static String password = "ABCabc";
    public static boolean PassworldCheck(String pass){
        if(pass.equals(password)){
            return true;
        } else{
            return false;
        }
    }
    private static Scanner keyboard =  new Scanner(System.in);
    public static void main(String[] args){
        String pass = "";
        do{
            System.out.println("Digite a senha");
            pass = keyboard.nextLine();
            if(PassworldCheck(pass)){
                System.out.println("Senha correta. Sistema finalizado");
            } else{
                System.out.println("Senha incorreta, tente novamente");
            }
        }while(PassworldCheck(pass) == false);
    }
}
