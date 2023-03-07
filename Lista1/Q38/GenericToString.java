package Q38;

public class GenericToString {
    // Método que recebe um objeto genérico e o exibe utilizando o método toString
    public static <T> void showObject(T object) {
        System.out.println(object.toString());
    }
    
    // Método que recebe um vetor genérico e exibe seus elementos
    public static <T> void showVector(T[] vector) {
        for (T elemento : vector) {
            System.out.print(elemento.toString() + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer numero = 10;
        showObject(numero);
        
        String[] nomes = {"Botafogo", "Vasco", "Fluminense"};
        showVector(nomes);
    }
}
