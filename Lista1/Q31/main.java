package Q31;

import java.util.Scanner;

public class main {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int qtd;
        System.out.println("Quantas pessoas você irá inserir?");
        qtd = kb.nextInt();
        Pessoa vector [] = new Pessoa [qtd];
        for (int i = 0; i < qtd; i++) {
            
            System.out.println("Digite o CPF da pessoa " + (i + 1));
            String cpf = kb.next();
            
            System.out.println("Digite o nome da pessoa " + (i + 1));
            String nome = kb.next();
            
            System.out.println("Digite a idade da pessoa " + (i + 1));
            int idade = kb.nextInt();
            
            System.out.println("Digite o sexo da pessoa " + (i + 1));
            String sexo = kb.next();
            
            System.out.println("Digite o peso da pessoa " + (i + 1));
            float peso = kb.nextFloat();
            
            System.out.println("Digite a altura da pessoa " + (i + 1));
            float altura = kb.nextFloat();
            
            float imc = peso / (altura * altura);
            
            Pessoa pessoa = new Pessoa(cpf, nome, idade, sexo, altura, peso, imc);
            vector[i] = pessoa;
        }
        
        System.out.println("Pessoas cadastradas:");
        
        for (int i = 0; i < qtd; i++) {
            
            Pessoa pessoa = vector[i];
            
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("Peso: " + pessoa.getPeso());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("IMC: " + pessoa.getImc());
            System.out.println("");
        }
        kb.close();  
    }
}
