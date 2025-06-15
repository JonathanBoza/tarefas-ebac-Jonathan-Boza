public class Honda extends Carro {

    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Honda: " + getModelo());
    }
}
