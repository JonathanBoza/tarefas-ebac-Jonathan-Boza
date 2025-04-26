package mod9.tarefa;

import java.util.Scanner;

public class CastingExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        // Convertendo de int para Integer (primitivo para wrapper)
        Integer numeroWrapper = Integer.valueOf(numeroInt);

        // Imprimindo os valores
        System.out.println("Valor primitivo (int): " + numeroInt);
        System.out.println("Valor Wrapper (Integer): " + numeroWrapper);

        scanner.close();
    }
}

