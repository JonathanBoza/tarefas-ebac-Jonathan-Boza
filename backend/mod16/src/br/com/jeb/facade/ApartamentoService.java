package br.com.jeb.facade;

public class ApartamentoService implements IApartamentoService {

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isPartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        }

        return cadastrarNoBanco(apartamento);
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        // Lógica para cadastrar o apartamento no banco de dados
        return true;
    }

    private Boolean isPartamentoCadastrado(Apartamento apartamento) {
        // Ir no banco de dados e verificar se o apartamento já está cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        // Validar os campos do apartamento
        return true;
    }
}
