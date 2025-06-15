public class TesteCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fiat Uno";
        meuCarro.cor = "Preto";
        meuCarro.setAno(2010);

        meuCarro.ligar();
        meuCarro.buzinar();

        System.out.println("Ano do carro: " + meuCarro.getAno());
    }
}
