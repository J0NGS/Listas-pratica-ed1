package Q39;
public class Pessoa{
    private int id;
    private String nome;
    private int idade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
    }
}
