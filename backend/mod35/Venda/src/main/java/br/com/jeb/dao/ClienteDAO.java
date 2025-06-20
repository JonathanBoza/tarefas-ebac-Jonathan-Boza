package br.com.jeb.dao;

import br.com.jeb.dao.generic.GenericJpaDAO;
import br.com.jeb.domain.Cliente;

public class ClienteDAO extends GenericJpaDAO<Cliente, Long> implements IClienteDAO {
    
    public ClienteDAO() {
        super(Cliente.class);
    }

	@Override
	protected String getQueryInsercao() {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_CLIENTE ");
		sb.append("(ID, NOME, CPF, TEL, ENDERECO, NUMERO, CIDADE, ESTADO, CEP, EMAIL)");
		sb.append("VALUES (nextval('sq_cliente'),?,?,?,?,?,?,?,?,?)");
		return sb.toString();
	}

	@Override
	protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {
		stmInsert.setString(1, entity.getNome());
		stmInsert.setLong(2, entity.getCpf());
		stmInsert.setLong(3, entity.getTel());
		stmInsert.setString(4, entity.getEnd());
		stmInsert.setLong(5, entity.getNumero());
		stmInsert.setString(6, entity.getCidade());
		stmInsert.setString(7, entity.getEstado());
		stmInsert.setString(8, entity.getCep());
		stmInsert.setString(9, entity.getEmail());

	}

	@Override
	protected String getQueryExclusao() {
		return "DELETE FROM TB_CLIENTE WHERE CPF = ?";
	}

	@Override
	protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, Long valor) throws SQLException {
		stmExclusao.setLong(1, valor);
	}

	@Override
	protected String getQueryAtualizacao() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_CLIENTE ");
		sb.append("SET NOME = ?,");
		sb.append("TEL = ?,");
		sb.append("ENDERECO = ?,");
		sb.append("NUMERO = ?,");
		sb.append("CIDADE = ?,");
		sb.append("ESTADO = ?,");
		sb.append("CEP = ?,");
		sb.append("EMAIL = ?");
		sb.append(" WHERE CPF = ?");
		return sb.toString();
	}

	@Override
	protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {
		stmUpdate.setString(1, entity.getNome());
		stmUpdate.setLong(2, entity.getTel());
		stmUpdate.setString(3, entity.getEnd());
		stmUpdate.setLong(4, entity.getNumero());
		stmUpdate.setString(5, entity.getCidade());
		stmUpdate.setString(6, entity.getEstado());
		stmUpdate.setString(7, entity.getCep());
		stmUpdate.setString(8, entity.getEmail());
		stmUpdate.setLong(9, entity.getCpf());
	}

	@Override
	protected void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {
		stmSelect.setLong(1, valor);
	}
}
