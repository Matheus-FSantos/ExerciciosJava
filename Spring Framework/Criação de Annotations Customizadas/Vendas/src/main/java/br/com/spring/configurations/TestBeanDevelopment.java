package br.com.spring.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import br.com.spring.annotations.Development;

@Development
public class TestBeanDevelopment {

	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("Rodando o perfil de Desenvolvimento!");
		};
	}
}