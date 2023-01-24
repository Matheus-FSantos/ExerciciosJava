package br.com.spring.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.spring.domain.entity.Cliente;

@Repository
public class Clientes {

	public static String INSERT = "INSERT INTO CLIENTE (NOME) VALUES (?)";
	private static String SELECT_ALL = "SELECT * FROM CLIENTE";
	private static String UPDATE = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?";
	private static String DELETE = "DELETE FROM CLIENTE WHERE ID = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Cliente post(Cliente cliente) {
		jdbcTemplate.update(INSERT, new Object[] { cliente.getNome() });
		return cliente;
	}

	public List<Cliente> get() {
		List<Cliente> clientes = jdbcTemplate.query(SELECT_ALL, rowMapper());
		return clientes;
	}

	public Cliente put(Cliente cliente) {
		jdbcTemplate.update(UPDATE, new Object[] { cliente.getNome(), cliente.getId() });
		return cliente;
	}

	public void delete(Cliente cliente) {
		delete(cliente.getId());
	}

	public void delete(Integer id) {
		jdbcTemplate.update(DELETE, new Object[] { id });
	}

	public List<Cliente> search(String nome){
		return jdbcTemplate.query(SELECT_ALL.concat(" WHERE NOME LIKE ?"),
				new Object[]{"%" + nome + "%"},
				rowMapper()
		);
	}

	private RowMapper<Cliente> rowMapper() {
		return new RowMapper<Cliente>() {
			@Override
			public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
				Integer id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				return new Cliente(id, nome);
			}
		};
	}
}