package br.com.spring.domain.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.spring.domain.entity.Cliente;
import br.com.spring.domain.repository.Clientes;

@Configuration
public class ClientesConfiguration {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			System.out.println("Inserindo valores");
			clientes.post(new Cliente("Matheus Ferreira"));
			clientes.post(new Cliente("Pedro Henrique"));
			clientes.post(new Cliente("Algusto Silva"));
			clientes.post(new Cliente("Antônio José"));
			
			List<Cliente> todosClientes = clientes.get();
			todosClientes.forEach(System.out::println);
			
			todosClientes.forEach(c -> {
				c.setNome(c.getNome() + " Atualizado.");
				clientes.put(c);
			});
			
			System.out.println("\n\n\n\n");
			System.out.println("Listando valores");
			todosClientes.forEach(System.out::println);
			
			List<Cliente> buscaClientes = clientes.search("Atua");
			System.out.println("\n\n\n\n");
			System.out.println("Buscando valores");
			buscaClientes.forEach(System.out::println);
			
			clientes.delete(2);
			todosClientes = clientes.get();
			System.out.println("\n\n\n\n");
			System.out.println("Deletando valores");
			todosClientes.forEach(System.out::println);
			
			System.out.println("\n\n\n\n");
			System.out.println("Deletando valores 2");
			todosClientes.forEach(cliente -> {
				clientes.delete(cliente);
			});
			todosClientes = clientes.get();
			if(todosClientes.isEmpty())
				System.out.println("Está vázio");
			else 
				todosClientes.forEach(System.out::println);
		};
	}
}