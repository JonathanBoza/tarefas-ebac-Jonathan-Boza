package br.com.jeb.dao.generic;

import br.com.jeb.dao.Persistente;
import br.com.jeb.exceptions.DAOException;
import br.com.jeb.exceptions.MaisDeUmRegistroException;
import br.com.jeb.exceptions.TableException;
import br.com.jeb.exceptions.TipoChaveNaoEncontradaException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public abstract class GenericJpaDAO<T extends Persistente, E extends Serializable> implements IGenericJpaDAO<T,E> {

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    private Class<T> persistenteClass;

    public GenericJpaDAO(Class<T> persistenteClass) {
        this.persistenteClass = persistenteClass;
        entityManagerFactory = Persistence.createEntityManagerFactory("VendaPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new DAOException("Erro ao cadastrar", e);
        }
    }

    @Override
    public void excluir(T entity) throws DAOException {
        try {
            entityManager.getTransaction().begin();
            entity = entityManager.merge(entity);
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new DAOException("Erro ao excluir", e);
        }
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        try {
            entityManager.getTransaction().begin();
            entity = entityManager.merge(entity);
            entityManager.getTransaction().commit();
            return entity;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new DAOException("Erro ao alterar", e);
        }
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        try {
            return entityManager.find(persistenteClass, valor);
        } catch (Exception e) {
            throw new DAOException("Erro ao consultar", e);
        }
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        try {
            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(persistenteClass);
            Root<T> root = query.from(persistenteClass);
            query.select(root);
            return entityManager.createQuery(query).getResultList();
        } catch (Exception e) {
            throw new DAOException("Erro ao buscar todos", e);
        }
    }
}
