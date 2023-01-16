package br.com.prova;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvaApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}
