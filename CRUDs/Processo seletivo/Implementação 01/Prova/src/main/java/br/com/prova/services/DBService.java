package br.com.prova.services;

/**
 * Estrutura de Dados
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Spring imports
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Classes
 */
import br.com.prova.model.ComposicaoTime;
import br.com.prova.model.Integrante;
import br.com.prova.model.Time;

/**
 * Repositorios
 */
import br.com.prova.repositories.ComposicaoTimeRepository;
import br.com.prova.repositories.IntegranteRepository;
import br.com.prova.repositories.TimeRepository;

@Service
public class DBService {
	@Autowired
	private IntegranteRepository integranteRepository;
	
	@Autowired
	private TimeRepository timeRepository;
	
	@Autowired
	private ComposicaoTimeRepository composicaoTimeRepository;
	
	@Bean
	public void instanciarDB() {
		String franquiaFutebol = "Futebol";
		
		LocalDate data2000 = LocalDate.of(2000, 1, 1);
		LocalDate data2001 = LocalDate.of(2001, 1, 1);
		LocalDate data2004 = LocalDate.of(2004, 1, 1);
		
		List<ComposicaoTime> composicaoTime2000 = new ArrayList<>();
		List<ComposicaoTime> composicaoTime2001 = new ArrayList<>();
		List<ComposicaoTime> composicaoTime2004 = new ArrayList<>();
		
		//Jogadores
		Integrante integrante1 = new Integrante(franquiaFutebol, "Gabigol", "Atacante", composicaoTime2000);
		Integrante integrante2 = new Integrante(franquiaFutebol, "R. Ceni", "Goleiro", composicaoTime2000);
		Integrante integrante3 = new Integrante(franquiaFutebol, "Caça Rato", "Ponta", composicaoTime2000);
		Integrante integrante4 = new Integrante(franquiaFutebol, "W. Rato", "Meia", composicaoTime2001);
		Integrante integrante5 = new Integrante(franquiaFutebol, "Dentinho", "Lateral", composicaoTime2001);
		Integrante integrante6 = new Integrante(franquiaFutebol, "Romarinho", "Meia", composicaoTime2001);
		Integrante integrante7 = new Integrante(franquiaFutebol, "Matheus Ferreira", "Ponta", composicaoTime2004);
		Integrante integrante8 = new Integrante(franquiaFutebol, "Roberto Dinamite", "Meia", composicaoTime2004);
		Integrante integrante9 = new Integrante(franquiaFutebol, "Pedro Queixada", "Atacante", composicaoTime2004);
		
		//Times
		Time santos = new Time(data2004, composicaoTime2004);
		Time flamengo = new Time(data2000, composicaoTime2000);
		Time portuguesa = new Time(data2001, composicaoTime2001);
		
		//ComposicaoDosTimes
		composicaoTime2000.add(new ComposicaoTime(santos, integrante1));
		composicaoTime2000.add(new ComposicaoTime(santos, integrante2));
		composicaoTime2000.add(new ComposicaoTime(santos, integrante3));
		composicaoTime2001.add(new ComposicaoTime(flamengo, integrante4));
		composicaoTime2001.add(new ComposicaoTime(flamengo, integrante5));
		composicaoTime2001.add(new ComposicaoTime(flamengo, integrante6));
		composicaoTime2004.add(new ComposicaoTime(portuguesa, integrante7));
		composicaoTime2004.add(new ComposicaoTime(portuguesa, integrante8));
		composicaoTime2004.add(new ComposicaoTime(portuguesa, integrante9));
		
		
		
		integranteRepository.saveAll(Arrays.asList(integrante1, integrante2, integrante3, integrante4, integrante5, integrante6, integrante7, integrante8, integrante9));
		timeRepository.saveAll(Arrays.asList(santos, portuguesa, flamengo));
	}
}