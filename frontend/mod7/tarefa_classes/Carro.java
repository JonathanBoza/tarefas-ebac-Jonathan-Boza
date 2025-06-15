public class Carro {

    // Atributos
    public String modelo;
    public String cor;
    private int ano;

    /**
     * Método que liga o carro
     */
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    /**
     * Método que buzina
     */
    public void buzinar() {
        System.out.println("Biiiiii!");
    }

    // Método com acesso ao ano (encapsulamento)
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}
