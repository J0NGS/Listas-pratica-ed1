
import java.text.DecimalFormat;
import java.util.Scanner;

import Lista1.MediaUfersa12.Student;
public class MediaFinalUfersa {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        Student aluno = new Student();
        System.out.println("Qual as notas do aluno");
        aluno.SetN1(keyboard.nextFloat());
        aluno.SetN2(keyboard.nextFloat());
        aluno.SetN3(keyboard.nextFloat());
        System.out.println("A media do aluno foi : " + df.format(aluno.studentAverage()));
        if(aluno.GetState() == "Recuperação"){
            System.out.println("Qual a nota da prova final do aluno?");
            df.format(aluno.studentFinalAverage(keyboard.nextFloat()));
        }
        
     }
}
