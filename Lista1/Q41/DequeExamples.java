package Q41;

import java.util.LinkedList;

public class DequeExamples {
    public static void main(String[] args) {
        // Cria uma LinkedList vazia
        LinkedList<String> list = new LinkedList<>();

        // Adiciona elementos ao final do deque
        list.addLast("baz");
        list.addLast("bar");
        list.addLast("foo");

        // Adiciona elementos ao início do deque
        list.addFirst("qux");
        list.addFirst("quux");

        // Remove e imprime o primeiro elemento do deque
        System.out.println(list.removeFirst());

        // Remove e imprime o último elemento do deque
        System.out.println(list.removeLast());

        // Imprime todos os elementos do deque
        for (String element : list) {
            System.out.println(element);
        }
    }
}
