package Q41;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueExamples {
    public static void main(String[] args) {
        // Cria uma PriorityQueue vazia
        PriorityQueue<Integer> Priorityqueue = new PriorityQueue<>();
        // Cria uma LinkedList vazia
        LinkedList<String> list = new LinkedList<>();

        // Adiciona elementos à PriorityQueue
        Priorityqueue.add(10);
        Priorityqueue.add(20);
        Priorityqueue.add(15);

        // Itera sobre os elementos da PriorityQueue
        System.out.println("Priority queue");
        while (!Priorityqueue.isEmpty()) {
            System.out.println(Priorityqueue.poll());
        }

        // Adiciona elementos à LinkedList
        list.add("foo");
        list.add("bar");
        list.add("baz");

        // Itera sobre os elementos da LinkedList
        System.out.println("List");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
