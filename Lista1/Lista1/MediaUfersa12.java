package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaUfersa12 {
 public static class Student{
    private float n1,n2,n3 = 0;
    private String studentState = " " ;
    
    public float studentAverage(){
        float average = (this.n1 + this.n2 + this.n3)/3;
        if(average > 7){
            this.studentState = "Aprovado";
        }if (average >= 3.5 && average < 7){
            this.studentState = "Recuperação";
        } if(average < 3.5) {
            this.studentState = "Reprovado";
        } 
        System.out.println("O estado do aluno é " + studentState);
        return average;
    }

    public float studentFinalAverage(float number){
        float finalAverage = 0;
        finalAverage = ((studentAverage() * 6) + (number * 4))/10;  
        this.studentState = (finalAverage >= 5 ? "Aprovado" : "Reprovado");
        System.out.println("o aluno está " + studentState);
        return finalAverage;
    }

    public void SetN1(float number){
        this.n1 = number;
    }
    public void SetN2(float number){
        this.n2 = number;
    }
    public void SetN3(float number){
       this.n3 = number;
    }
    public float GetN1(){
       return this.n1;
    }
    public float GetN2(){
        return this.n2;
    }
    public float GetN3(){
        return this.n3;
    }
    public String GetState(){
        return this.studentState;
    }

}

private static Scanner keyboard = new Scanner(System.in);

public static void main(String[] args){
    DecimalFormat df = new DecimalFormat("#.##");
    Student aluno = new Student();
    System.out.println("Qual as notas do aluno");
    aluno.SetN1(keyboard.nextFloat());
    aluno.SetN2(keyboard.nextFloat());
    aluno.SetN3(keyboard.nextFloat());
    System.out.println("A media do aluno foi : " + df.format(aluno.studentAverage()));
 }
}
