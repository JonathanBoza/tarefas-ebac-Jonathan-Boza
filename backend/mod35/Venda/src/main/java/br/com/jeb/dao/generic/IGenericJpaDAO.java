package br.com.jeb.dao.generic;

import br.com.jeb.dao.Persistente;
import br.com.jeb.exceptions.DAOException;
import br.com.jeb.exceptions.MaisDeUmRegistroException;
import br.com.jeb.exceptions.TableException;
import br.com.jeb.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJpaDAO<T extends Persistente, E extends Serializable> {
    
    /**
     * Método para cadastrar novos registros no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna o objeto salvo
     * @throws TipoChaveNaoEncontradaException
     * @throws DAOException
     */
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    
    /**
     * Método para excluir um registro do banco de dados
     *
     * @param entity a ser cadastrado
     * @throws DAOException
     */
    public void excluir(T entity) throws DAOException;
    
    /**
     * Método para alterar um registro no banco de dados
     *
     * @param entity a ser atualizado
     * @return retorna o objeto salvo
     * @throws TipoChaveNaoEncontradaException
     * @throws DAOException
     */
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    
    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return
     * @throws MaisDeUmRegistroException
     * @throws TableException
     */
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;
    
    /**
     * Método que retorna todos os registros do banco de dados de uma determinada tabela
     *
     * @return Registros encontrados
     * @throws DAOException
     */
    public Collection<T> buscarTodos() throws DAOException;
}
