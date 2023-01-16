package br.com.prova.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.prova.model.Integrante;

@Repository
public interface IntegranteRepository extends JpaRepository<Integrante, Integer> {

}
