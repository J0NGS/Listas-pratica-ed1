package Q39;

public class teste {
        public static void main(String[] args) {
            PessoaCrud<Pessoa> crud = new PessoaCrud<>();
            
            // Adicionando algumas pessoas
            Pessoa pessoa1 = new Pessoa("João", 30,1);
            Pessoa pessoa2 = new Pessoa("Maria", 25,2);
            Pessoa pessoa3 = new Pessoa("Pedro", 40, 3);
            crud.adicionar(pessoa1);
            crud.adicionar(pessoa2);
            crud.adicionar(pessoa3);
            
            // Buscando uma pessoa
            Pessoa pessoaBuscada = crud.buscar(2);
            if (pessoaBuscada != null) {
                System.out.println("Pessoa encontrada: " + pessoaBuscada);
            } else {
                System.out.println("Pessoa não encontrada.");
            }
            
            // Atualizando uma pessoa
            Pessoa pessoaAtualizada = new Pessoa("José", 27, 0);
            pessoaAtualizada.setId(2);
            crud.atualizar(pessoaAtualizada);
            
            // Removendo uma pessoa
            Pessoa pessoaRemovida = crud.buscar(1);
            if (pessoaRemovida != null) {
                crud.remover(pessoaRemovida);
            }
            
            // Listando todas as pessoas
            crud.listar();
        }
}
