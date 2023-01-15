package br.com.prova.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prova.model.Time;
import br.com.prova.model.Integrante;

import br.com.prova.repositories.IntegranteRepository;
import br.com.prova.repositories.TimeRepository;

@Service
public class ApiRestService {
	
	@Autowired
	IntegranteRepository integranteRepository;
	
	@Autowired
	TimeRepository timeRepository;
	
	/*
	 	* EndPoints para cadastro de Time/Integrante (Topico 02)
	*/
	public Integrante gravarIntegrante(Integrante integrante) {
		return integranteRepository.save(integrante);
	}

	public Time gravarTime(Time time) {
		return timeRepository.save(time);
	}

	/*
		 * EndPoints para requisicao (Topico 03)
		 * 
		 * (Alguns para teste do Spring Boot)
	*/

	public Integrante findById(Integer id) {
		Optional<Integrante> integrante = integranteRepository.findById(id);
		return integrante.orElse(null);
	}
	
	public List<Integrante> findAll() {
		System.out.print("Dentro de serviços - Listando todos integrantes.");
		List <Integrante>  empresas = integranteRepository.findAll();
		return empresas;
	}

	public List<Time> times() {
		List<Time> time = timeRepository.findAll();
		return time;
	}
	
	public List<Integrante> timeDaData(LocalDate data){
		Optional<List<Integrante>> integrantes = integranteRepository.timeDaData(data);
		return integrantes.orElse(null);
	}
}