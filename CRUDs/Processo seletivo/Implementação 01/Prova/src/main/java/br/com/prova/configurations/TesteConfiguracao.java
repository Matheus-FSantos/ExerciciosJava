package br.com.prova.configurations;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.prova.services.DBService;

@Configuration
@Profile("teste")
public class TesteConfiguracao {
	
	@Autowired
	DBService dbService;
	
	private boolean instanciar() throws ParseException {
		this.dbService.instanciarDB();
		return true;
	}
}