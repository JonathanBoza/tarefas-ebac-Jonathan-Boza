import java.util.Arrays;
import java.util.List;

public class lista {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("João", "Maria", "Pedro");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(nome -> System.out.println(nome));
        
        nomes.forEach(System.out::println);
    }
}