package br.com.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prova.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer>{

}