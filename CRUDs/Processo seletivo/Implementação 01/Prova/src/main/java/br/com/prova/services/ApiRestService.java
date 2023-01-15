package br.com.prova.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.prova.model.Time;
import br.com.prova.model.Integrante;
import br.com.prova.model.ComposicaoTime;

import br.com.prova.repositories.IntegranteRepository;
import br.com.prova.repositories.TimeRepository;
import br.com.prova.repositories.ComposicaoTimeRepository;

@Service
public class ApiRestService {
	
	@Autowired
	IntegranteRepository integranteRepository;
	
	@Autowired
	TimeRepository timeRepository;
	
	/**
	 * Metodos para cadastro (Topico 02)
	 */
	public Integrante gravarIntegrante(Integrante integrante) {
		return integranteRepository.save(integrante);
	}

	public Time gravarTime(Time time) {
		return timeRepository.save(time);
	}

	/**
	 * Metodos para requisicao (Topico 01)
	 */

	public Integrante findById(Integer id) {
		Optional<Integrante> integrante = integranteRepository.findById(id);
		return integrante.orElse(null);
	}
}