package br.com.spring.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.spring.domain.entity.Cliente;

@Repository
public class Clientes {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public Cliente post(Cliente cliente) {
		entityManager.persist(cliente);
		return cliente;
	}

	@Transactional
	public List<Cliente> get() {
		return entityManager.createQuery("from Cliente", Cliente.class).getResultList();
	}

	@Transactional
	public Cliente put(Cliente cliente) {
		entityManager.merge(cliente);
		return cliente;
	}

	@Transactional
	public void delete(Cliente cliente) {
		if(!entityManager.contains(cliente))
			cliente = entityManager.merge(cliente);
		entityManager.remove(cliente);
	}

	@Transactional
	public void delete(Integer id) {
		Cliente cliente = entityManager.find(Cliente.class, id);
		delete(cliente);
	}

	@Transactional(readOnly = true)
	public List<Cliente> search(String nome){
		String JPQL = "select c from Cliente c where c.nome = :nome";
		TypedQuery<Cliente> query = entityManager.createQuery(JPQL, Cliente.class);
		query.setParameter("nome", "%" + nome + "%");
		return query.getResultList();
		
	}
}