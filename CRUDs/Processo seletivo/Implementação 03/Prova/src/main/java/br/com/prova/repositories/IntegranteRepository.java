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

	/*
		 * A ideia é buscar a lista dos integrantes dos times cujo a data de criação
		 * seja a mesma que a data informada, porém nesse exemplo irá retornar nulo (já
		 * que não tem nenhum time composto por conta do problema da recursão infinita)
		 * porém sempre que eu tento criar um método aqui na interface da um erro
		 * 
		 * OBS: utilizei data = '2001-01-01' por que fiz o DQL no h2 console usando uma
		 * data existente
	*/
}