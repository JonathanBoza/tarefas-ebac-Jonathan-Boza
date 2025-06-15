public class Main {
    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        garagem.adicionarCarro(new Honda("Civic"));
        garagem.adicionarCarro(new Toyota("Corolla"));

        garagem.listarCarros();
    }
}
