package br.com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendasApplication {
	public static void main(String[] args) {
		//[...].run(Classe que irá inicializar, argumentos)
		SpringApplication.run(VendasApplication.class, args);
	}
}