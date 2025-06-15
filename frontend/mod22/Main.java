import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a lista (ex: Maria-feminino, João-masculino):");
        String entrada = sc.nextLine();
        sc.close();

        List<Pessoa> pessoas = Arrays.stream(entrada.split(","))
            .map(String::trim)
            .map(p -> p.split("-"))
            .map(arr -> new Pessoa(arr[0].trim(), arr[1].trim()))
            .collect(Collectors.toList());

        // Imprimir todos
        System.out.println("\nLista completa:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getSexo());
        }

        // Apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("feminino"))
            .collect(Collectors.toList());

        System.out.println("\nApenas mulheres:");
        for (Pessoa p : mulheres) {
            System.out.println(p.getNome());
        }
    }
}
