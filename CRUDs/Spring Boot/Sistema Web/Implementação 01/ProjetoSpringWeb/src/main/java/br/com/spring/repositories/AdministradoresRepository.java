package br.com.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.spring.model.Administrador;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{

}