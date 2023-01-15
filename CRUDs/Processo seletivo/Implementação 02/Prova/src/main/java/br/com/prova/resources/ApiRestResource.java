package br.com.prova.resources;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.prova.model.Integrante;
import br.com.prova.model.Time;

import br.com.prova.services.ApiRestService;

@RestController
@RequestMapping(value = "/cartola")
public class ApiRestResource {
	
	@Autowired
	private ApiRestService apiRestService;
	
	/*
	 	* EndPoints para cadastro de Time/Integrante (Topico 02)
	*/
	
	@RequestMapping(value="/novoIntegrante", method=RequestMethod.POST)
	public ResponseEntity<Integrante> gravarIntegrante(@RequestBody Integrante integrante){
		integrante = apiRestService.gravarIntegrante(integrante);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(integrante.getId()).toUri();
		return ResponseEntity.created(uri).body(integrante);
	}
	
	@RequestMapping(value="/novoTime", method=RequestMethod.POST)
	public ResponseEntity<Time> gravarTime(@RequestBody Time time){
		time = apiRestService.gravarTime(time);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(time.getId()).toUri();
		return ResponseEntity.created(uri).body(time);
	}
	
	/*
		 * EndPoints para requisicao (Topico 03)
		 * 
		 * (Alguns para teste do Spring Boot)
	*/
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Integrante> findById(@PathVariable Integer id){
		Integrante integrante = apiRestService.findById(id);
		return ResponseEntity.ok().body(integrante);
	}
	
	@GetMapping(value="/integrantes")
	public ResponseEntity<List<Integrante>> findAll(){
		System.out.print("Listando todos integrantes.");
		List<Integrante>  empresas = apiRestService.findAll();
		return ResponseEntity.ok().body(empresas);
	}
	
	@GetMapping(value="/times")
	public ResponseEntity<List<Time>> times(){
		List<Time> time = apiRestService.times();
		return ResponseEntity.ok().body(time);
	}
	
	@GetMapping(value="/timeDaData")
	public ResponseEntity<List<Integrante>> timeDaData(@PathVariable LocalDate data){
		List<Integrante> time = apiRestService.timeDaData(data);
		return ResponseEntity.ok().body(time);
	}
}