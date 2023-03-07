package Q32;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

import Q31.Pessoa;

public class Binary {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int qtd;
        System.out.println("Quantas pessoas você irá inserir?");
        qtd = kb.nextInt();
        LinkedList<Pessoa> listaPessoas = new LinkedList<Pessoa>();
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
            listaPessoas.add(pessoa);
        }
        
        // Salvando a lista de pessoas em um arquivo binário
        try {
            FileOutputStream fos = new FileOutputStream("listaPessoas.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaPessoas);
            oos.close();
            fos.close();
            System.out.println("Lista de pessoas salva em listaPessoas.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Carregando a lista de pessoas do arquivo binário
        try {
            FileInputStream fis = new FileInputStream("listaPessoas.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            LinkedList<Pessoa> listaPessoasLida = (LinkedList<Pessoa>) ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("Pessoas cadastradas:");
            for (Pessoa pessoa : listaPessoasLida) {
                System.out.println("CPF: " + pessoa.getCpf());
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("Sexo: " + pessoa.getSexo());
                System.out.println("Peso: " + pessoa.getPeso());
                System.out.println("Altura: " + pessoa.getAltura());
                System.out.println("IMC: " + pessoa.getImc());
                System.out.println("");
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        kb.close();  
    }
}
