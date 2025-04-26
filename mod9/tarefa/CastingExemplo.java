package mod9.tarefa;

import java.util.Scanner;

public class CastingExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um número decimal
        System.out.print("Digite um número decimal: ");
        double numeroDouble = scanner.nextDouble();

        // Fazendo o casting de double para int
        int numeroInt = (int) numeroDouble;

        // Imprimindo os valores
        System.out.println("Valor original (double): " + numeroDouble);
        System.out.println("Valor convertido (int): " + numeroInt);

        scanner.close();
    }
}
