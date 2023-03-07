package Q41;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        // Cria um HashSet vazio
        Set<String> set = new HashSet<>();
        // Cria um LinkedHashSet vazio
        Set<String> Linkset = new LinkedHashSet<>();
        // Cria um TreeSet vazio
        Set<String> Treeset = new TreeSet<>();
        // Adiciona elementos ao HashSet
        set.add("foo");
        set.add("bar");
        set.add("baz");

        // Itera sobre os elementos do HashSet
        System.out.println("Hashset");
        for (String element : set) {
            System.out.println(element);
        }

        // Adiciona elementos ao TreeSet
        Treeset.add("foo");
        Treeset.add("bar");
        Treeset.add("baz");

        // Itera sobre os elementos do TreeSet
        System.out.println("Treeset");
        for (String element : Treeset) {
            System.out.println(element);
        }

        // Adiciona elementos ao LinkedHashSet
        Linkset.add("foo");
        Linkset.add("bar");
        Linkset.add("baz");

        // Itera sobre os elementos do LinkedHashSet
        System.out.println("Linkset");
        for (String element : Linkset) {
            System.out.println(element);
        }
    }
    }

