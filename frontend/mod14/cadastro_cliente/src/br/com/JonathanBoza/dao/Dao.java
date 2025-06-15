package src.br.com.JonathanBoza.dao;

import java.util.Collection;

import src.br.com.JonathanBoza.domain.Cliente;

public interface Dao {
    
    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
