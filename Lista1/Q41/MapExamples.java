package Q41;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        // Cria um HashMap vazio
        Map<String, Integer> Hashmap = new HashMap<>();
        // Cria um LinkedHashMap vazio
        Map<String, Integer> Linkmap = new LinkedHashMap<>();
        // Cria um TreeMap vazio
        Map<String, Integer> Treemap = new TreeMap<>();

        // Adiciona elementos ao HashMap
        Hashmap.put("bar", 20);
        Hashmap.put("foo", 10);
        Hashmap.put("baz", 15);

        System.out.println("Hashmap");

        // Imprime o valor associado à chave "foo"
        System.out.println(Hashmap.get("foo"));

        // Itera sobre os elementos do HashMap
        for (Map.Entry<String, Integer> entry : Hashmap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Adiciona elementos ao TreeMap
        Treemap.put("foo", 10);
        Treemap.put("bar", 20);
        Treemap.put("baz", 15);

        System.out.println("Treemap");


        // Imprime o valor associado à chave "foo"
        System.out.println(Treemap.get("foo"));

        // Itera sobre os elementos do TreeMap
        for (Map.Entry<String, Integer> entry : Treemap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // Adiciona elementos ao LinkedHashMap
        Linkmap.put("foo", 10);
        Linkmap.put("bar", 20);
        Linkmap.put("baz", 15);

        System.out.println("Linkmap");


        // Imprime o valor associado à chave "foo"
        System.out.println(Linkmap.get("foo"));

        // Itera sobre os elementos do LinkedHashMap
        for (Map.Entry<String, Integer> entry : Linkmap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
