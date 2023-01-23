package br.com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.annotations.*;
import br.com.spring.repositories.AnimalRepository;

@RestController
public class VendasController {
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@Cachorro
	private AnimalRepository animal;
	
	@Value("${application.authorName}")
	private String authorName;
	
	@Value("${application.name}")
	private String applicationNameProperties;
	
	@GetMapping("/")
	public String ola() {
		return "O nome da aplicação: " + this.applicationName + 
			   "<br/><br/>Ou: " + applicationNameProperties + 
			   "<br/><br/>Direitos reservados por: " + authorName;
	}
	
	@Bean
	public CommandLineRunner testeAnimais() {
		return args -> {
			this.animal.fazerBarulho();
		};
	}
}