package Q41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String[] args) {
        // criando um ArrayList de String
        ArrayList<String> lista = new ArrayList<String>();
        // criando um Vector de String
        Vector<String> vetor = new Vector<String>();
        // criando uma LinkedList de String
        LinkedList<String> listEncadeada = new LinkedList<String>();
        
        // adicionando elementos na lista
        lista.add("maçã");
        lista.add("banana");
        lista.add("laranja");
        lista.add("abacaxi");

        // imprimindo a lista
        System.out.println("Lista: " + lista);

        // acessando um elemento pelo índice
        String fruta = lista.get(2);
        System.out.println("Fruta na posição 2: " + fruta);

        // removendo um elemento pelo índice
        lista.remove(1);
        System.out.println("Lista após remoção do elemento na posição 1: " + lista);

        // tamanho da lista
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
        
        // adicionando elementos na lista encadead
        listEncadeada.add("Botafogo");
        listEncadeada.add("Vasco");
        listEncadeada.add("Fluminense");
        listEncadeada.add("Framengo");

        // imprimindo a lista encadeada
        System.out.println("ListaEncadeada: " + listEncadeada);

        // acessando um elemento pelo índice
        String numero = listEncadeada.get(2);
        System.out.println("Time na posição 2: " + numero);

        // removendo um elemento pelo índice
        listEncadeada.remove(1);
        System.out.println("Lista Encadeada após remoção do elemento na posição 1: " + listEncadeada);

        // tamanho da listaEncadeada
        int tamanho2 = listEncadeada.size();
        System.out.println("Tamanho da lista Encadeada: " + tamanho2);

        // adicionando elementos no vetor
        vetor.add("azul");
        vetor.add("verde");
        vetor.add("amarelo");
        vetor.add("vermelho");

        // imprimindo o vetor
        System.out.println("Vetor: " + vetor);

        // acessando um elemento pelo índice
        String cor = vetor.get(2);
        System.out.println("Cor na posição 2: " + cor);

        // removendo um elemento pelo índice
        vetor.remove(1);
        System.out.println("Vetor após remoção do elemento na posição 1: " + vetor);

        // tamanho do vetor
        int tamanho3 = vetor.size();
        System.out.println("Tamanho do vetor: " + tamanho3);
    }
}
