package Q31;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String cpf;
    private String nome;
    private int idade;
    private String sexo;
    private float altura;
    private float peso;
    private float imc;

    public float getImc() {
        return this.imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    public Pessoa(String cpf, String nome, int idade, String sexo, float altura, float peso, float imc) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.imc =  imc;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
