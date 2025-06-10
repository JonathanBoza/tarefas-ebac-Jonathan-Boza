import java.util.Arrays;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        // Forma tradicional
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // Com expressão lambda
        nomes.forEach(nome -> System.out.println(nome));
        
        // Ou ainda mais conciso
        nomes.forEach(System.out::println);
    }
}