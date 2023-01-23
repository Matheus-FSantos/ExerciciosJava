package br.com.spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.spring.repositories.AnimalRepository;

@Configuration
public class AnimalConfiguration {
	
	@Bean(name = "Cachorro")
	public AnimalRepository cachorro() {	
		return new AnimalRepository() {
			@Override
			public void fazerBarulho() {
				System.out.print("Latido");
			}
		};
	}
	
	
	@Bean(name = "Gato")
	public AnimalRepository gato() {
		return new AnimalRepository() {
			@Override
			public void fazerBarulho() {
				System.out.print("Miado");
			}
		};
	}
}