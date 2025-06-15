package mod19.tarefa_reflexao;

public class Main {
    public static void main(String[] args) {
        if (Cliente.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = Cliente.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("Anotação @Tabela não encontrada.");
        }
    }
}
