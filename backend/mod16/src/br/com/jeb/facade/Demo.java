package br.com.jeb.facade;

public class Demo {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "Rua A, 123"));
    }
}
