package br.com.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.prova.model.ComposicaoTime;

@Repository
public interface ComposicaoTimeRepository extends JpaRepository<ComposicaoTime, Integer>{

}