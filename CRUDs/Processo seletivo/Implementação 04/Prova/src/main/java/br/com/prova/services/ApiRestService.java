package br.com.prova.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prova.model.Time;
import br.com.prova.model.ComposicaoTime;
import br.com.prova.model.Integrante;
import br.com.prova.repositories.ComposicaoTimeRepository;
import br.com.prova.repositories.IntegranteRepository;
import br.com.prova.repositories.TimeRepository;

@Service
public class ApiRestService {
	
	@Autowired
	IntegranteRepository integranteRepository;
	
	@Autowired
	TimeRepository timeRepository;
	
	@Autowired
	ComposicaoTimeRepository composicaoTimeRepository;
	
	/*
	 	* EndPoints para cadastro de Time/Integrante (Topico 02)
	*/
	public Integrante gravarIntegrante(Integrante integrante) {
		return integranteRepository.save(integrante);
	}

	public Time gravarTime(Time time) {
		return timeRepository.save(time);
	}

	/*
	 	 * Para ver o funcionamento correto dos metodos abaixo, ir ao caminho
		 * br.com.prova.services > DBService.java 
		 * e comentar as linhas da composicao dos time
		 * (OBS: Nos metodos abaixo composicao do time não da recursao infinita)
		 *  
		 *  
		 * EndPoints para teste de requisicao do Spring Boot
	*/

	public Integrante findById(Integer id) {
		Optional<Integrante> integrante = integranteRepository.findById(id);
		return integrante.orElse(null);
	}
	
	public List<Integrante> integrantes() {
		System.out.print("Dentro de serviços - Listando todos integrantes.");
		List <Integrante>  integrantes = integranteRepository.findAll();
		return integrantes;
	}

	public List<Time> times() {
		List<Time> time = timeRepository.findAll();
		return time;
	}
	
	public List<ComposicaoTime> composicao() {
		List<ComposicaoTime> composicao = composicaoTimeRepository.findAll();
		return composicao;
	}

	
	/*
	 	* Regra de negocio Estrutura de Dados (Topico 01)
	*/
	
	/**
		 * Para ver o funcionamento correto dos metodos abaixo, ir ao caminho
		 * br.com.prova.services > DBService.java 
		 * e descomentar as linhas da composicao dos time
		 * (OBS: Nos metodos abaixo composicao do time não da recursao infinita)
		 * 
		 * 
		 * Vai retornar uma lista com os nomes dos integrantes do time daquela data
	*/
	public List<String> timeDaData(LocalDate data) {
		List<Time> times = times();
		List<ComposicaoTime> composicao = composicao();
		List<Integrante> jogadores = integrantes();
			
		List<Integer> IDTimes = new ArrayList<>();
		List<Integer> IDsJogadores = new ArrayList<>();
		List<String> nomeJogadores = new ArrayList<>();
		
		
		for(Time time : times) {
			if(time.getData().isEqual(data)) {
				IDTimes.add(time.getId());
			}
		}
		
		
		for(ComposicaoTime elencos : composicao) {
			for(Integer id : IDTimes) {
				if(elencos.getTime().getId() == id) {
					IDsJogadores.add(elencos.getIntegrante().getId());
				}
			}
		}
		
		
		for(Integrante jogador : jogadores) {
			for(Integer id : IDsJogadores) {
				if(jogador.getId() == id) {
					nomeJogadores.add(jogador.getNome());
				}
			}
		}
		
		return nomeJogadores;
	}
	
	/**
	     * Vai retornar o integrante que tiver presente na maior quantidade de times
	     * dentro do período
    */
	public Integrante integranteMaisUsado(LocalDate dataInicial, LocalDate dataFinal, List<Time> todosOsTimes){
        return null;
    }

	/**
	     * Vai retornar uma lista com os nomes dos integrantes do time mais comum
	     * dentro do período
    */
    public List<String> timeMaisComum(LocalDate dataInicial, LocalDate dataFinal, List<Time> todosOsTimes){
        return null;
    }

    /**
     	 * Vai retornar a função mais comum nos times dentro do período
    */
    public String funcaoMaisComum(LocalDate dataInicial, LocalDate dataFinal){
    	List<Time> times = times();
		List<ComposicaoTime> composicao = composicao();
		List<Integrante> jogadores = integrantes();
		
		List<Integer> IDTimes = new ArrayList<>();
		List<Integer> IDsJogadores = new ArrayList<>();
		List<String> funcaoJogadoresDuplicados = new ArrayList<>();
		List<String> funcaoJogadores = new ArrayList<>();
		
		
		String funcaoMaisJogadores = "";
		int numeroFuncaoAntiga = 0;
		int contador = 0;
		
		
		for(Time time : times) {
			if((time.getData().isAfter(dataInicial) && time.getData().isBefore(dataFinal)) || (time.getData().equals(dataInicial) || time.getData().equals(dataFinal))) {
				IDTimes.add(time.getId());
			}
		}
		
		
		for(ComposicaoTime elencos : composicao) {
			for(Integer id : IDTimes) {
				if(elencos.getTime().getId() == id) {
					IDsJogadores.add(elencos.getIntegrante().getId());
				}
			}
		}
		
		
		for(Integrante jogador : jogadores) {
			for(Integer id : IDsJogadores) {
				if(jogador.getId() == id) {
					funcaoJogadoresDuplicados.add(jogador.getFuncao());
				}
			}
		}
		
		funcaoJogadores = funcaoJogadoresDuplicados.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		
		for(String funcao : funcaoJogadores) {
			for(String clone : funcaoJogadoresDuplicados) {
				if(funcao.equals(clone)) {
					contador++;
				}
			}
			
			if(contador > numeroFuncaoAntiga) {
				funcaoMaisJogadores = funcao;
				numeroFuncaoAntiga = contador;
			} else if (contador == numeroFuncaoAntiga) {
				funcaoMaisJogadores += " / " + funcao;
				numeroFuncaoAntiga = contador;
			}
			
			contador = 0;
		}
		
        return "Funcao: "+ funcaoMaisJogadores + "  ➔ " + numeroFuncaoAntiga;
    }

    /**
     	 * Vai retornar o nome da Franquia mais comum nos times dentro do período
    */
    public String franquiaMaisFamosa(LocalDate dataInicial, LocalDate dataFinal) {
    	List<Time> times = times();
		List<ComposicaoTime> composicao = composicao();
		List<Integrante> jogadores = integrantes();
		
		List<Integer> IDTimes = new ArrayList<>();
		List<Integer> IDsJogadores = new ArrayList<>();
		List<String> franquiaJogadoresDuplicados = new ArrayList<>();
		List<String> franquiaJogadores = new ArrayList<>();
		
		
		String franquiaMaisFamosa = "";
		int numeroFuncaoAntiga = 0;
		int contador = 0;
		
		for(Time time : times) {
			if((time.getData().isAfter(dataInicial) && time.getData().isBefore(dataFinal)) || (time.getData().equals(dataInicial) || time.getData().equals(dataFinal))) {
				IDTimes.add(time.getId());
			}
		}
		
		
		for(ComposicaoTime elencos : composicao) {
			for(Integer id : IDTimes) {
				if(elencos.getTime().getId() == id) {
					IDsJogadores.add(elencos.getIntegrante().getId());
				}
			}
		}
		
		
		for(Integrante jogador : jogadores) {
			for(Integer id : IDsJogadores) {
				if(jogador.getId() == id) {
					franquiaJogadoresDuplicados.add(jogador.getFranquia());
				}
			}
		}

		franquiaJogadores = franquiaJogadoresDuplicados.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		
		for(String funcao : franquiaJogadores) {
			for(String clone : franquiaJogadoresDuplicados) {
				if(funcao.equals(clone)) {
					contador++;
				}
			}
			
			if(contador > numeroFuncaoAntiga) {
				franquiaMaisFamosa = funcao;
				numeroFuncaoAntiga = contador;
			} else if (contador == numeroFuncaoAntiga) {
				franquiaMaisFamosa += " / " + funcao;
				numeroFuncaoAntiga = contador;
			}
			
			contador = 0;
		}
		
    	return "Franquia: "+ franquiaMaisFamosa + "  ➔ " + numeroFuncaoAntiga;
    }

    /**
     	 * Vai retornar o nome da Franquia mais comum nos times dentro do período
    */
    public List<String> contagemPorFranquia(LocalDate dataInicial, LocalDate dataFinal){
    	List<Time> times = times();
		List<ComposicaoTime> composicao = composicao();
		List<Integrante> jogadores = integrantes();
		
		List<Integer> IDTimes = new ArrayList<>();
		List<Integer> IDsJogadores = new ArrayList<>();
		List<String> franquiaJogadoresDuplicados = new ArrayList<>();
		List<String> franquiaJogadores = new ArrayList<>();
		List<String> franquias = new ArrayList<>();
		
		int contador = 0;
		
		
		for(Time time : times) {
			if((time.getData().isAfter(dataInicial) && time.getData().isBefore(dataFinal)) || (time.getData().equals(dataInicial) || time.getData().equals(dataFinal))) {
				IDTimes.add(time.getId());
			}
		}
		
		for(ComposicaoTime elencos : composicao) {
			for(Integer id : IDTimes) {
				if(elencos.getTime().getId() == id) {
					IDsJogadores.add(elencos.getIntegrante().getId());
				}
			}
		}
		
		
		for(Integrante jogador : jogadores) {
			for(Integer id : IDsJogadores) {
				if(jogador.getId() == id) {
					franquiaJogadoresDuplicados.add(jogador.getFranquia());
				}
			}
		}
		
		franquiaJogadores = franquiaJogadoresDuplicados.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		
		
		for(String franquia : franquiaJogadores) {
			for(String clone : franquiaJogadoresDuplicados) {
				if(franquia.equals(clone)) {
					contador++;
				}
			}
			
			franquias.add(franquia + " ➔ " + contador);
			contador = 0;
		}
		
    	return franquias;
    }

    /**
      	 * Vai retornar o número (quantidade) de Funções dentro do período
    */
    public List<String> contagemPorFuncao(LocalDate dataInicial, LocalDate dataFinal){
    	List<Time> times = times();
		List<ComposicaoTime> composicao = composicao();
		List<Integrante> jogadores = integrantes();
		
		List<Integer> IDTimes = new ArrayList<>();
		List<Integer> IDsJogadores = new ArrayList<>();
		List<String> funcaoJogadoresDuplicados = new ArrayList<>();
		List<String> funcaoJogadores = new ArrayList<>();
		List<String> funcao = new ArrayList<>();
		
		int contador = 0;
		
		for(Time time : times) {
			if((time.getData().isAfter(dataInicial) && time.getData().isBefore(dataFinal)) || (time.getData().equals(dataInicial) || time.getData().equals(dataFinal))) {
				IDTimes.add(time.getId());
			}
		}
		
		for(ComposicaoTime elencos : composicao) {
			for(Integer id : IDTimes) {
				if(elencos.getTime().getId() == id) {
					IDsJogadores.add(elencos.getIntegrante().getId());
				}
			}
		}
		
		
		for(Integrante jogador : jogadores) {
			for(Integer id : IDsJogadores) {
				if(jogador.getId() == id) {
					funcaoJogadoresDuplicados.add(jogador.getFuncao());
				}
			}
		}
		

		funcaoJogadores = funcaoJogadoresDuplicados.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		
		for(String funcaoJogador: funcaoJogadores) {
			for(String clone : funcaoJogadoresDuplicados) {
				if(funcaoJogador.equals(clone)) {
					contador++;
				}
			}
			
			funcao.add(funcaoJogador + " ➔ " + contador);
			contador = 0;
		}
		
    	return funcao;
    }
}