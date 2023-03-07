package Q39;

import java.util.ArrayList;
import java.util.List;

public class PessoaCrud<T extends Pessoa> {
    private List<T> listaPessoas;
    
    // construtor
    public PessoaCrud() {
        listaPessoas = new ArrayList<>();
    }
    
    // método para adicionar pessoa
    public void adicionar(T pessoa) {
        listaPessoas.add(pessoa);
    }
    
    // método para buscar pessoa pelo id
    public T buscar(int id) {
        for (T pessoa : listaPessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }
    
    // método para atualizar pessoa
    public void atualizar(T pessoa) {
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getId() == pessoa.getId()) {
                listaPessoas.set(i, pessoa);
            }
        }
    }
    
    // método para remover pessoa
    public void remover(T pessoa) {
        listaPessoas.remove(pessoa);
    }
    
    // método para listar todas as pessoas
    public void listar() {
        for (T pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}