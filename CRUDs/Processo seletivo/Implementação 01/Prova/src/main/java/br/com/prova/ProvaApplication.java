package br.com.prova;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.prova.model.ComposicaoTime;
import br.com.prova.model.Integrante;
import br.com.prova.repositories.IntegranteRepository;

@SpringBootApplication
public class ProvaApplication implements CommandLineRunner{
	
	@Autowired
	private IntegranteRepository integranteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}
