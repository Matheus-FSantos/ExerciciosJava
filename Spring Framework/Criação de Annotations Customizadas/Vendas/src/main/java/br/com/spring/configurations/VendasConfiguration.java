package br.com.spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendasConfiguration {
	
	@Bean(name="applicationName")
	public String applicationName() {
		return "Sistema de Vendas";
	}
}