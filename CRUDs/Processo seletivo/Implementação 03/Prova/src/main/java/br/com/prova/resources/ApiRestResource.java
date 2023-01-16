package br.com.prova.resources;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.prova.model.ComposicaoTime;
import br.com.prova.model.Integrante;
import br.com.prova.model.Time;

import br.com.prova.services.ApiRestService;

@RestController
@RequestMapping(value = "/cartola")
public class ApiRestResource {
	
	@Autowired
	private ApiRestService apiRestService;
	
	/*
	 	* EndPoints para cadastro de Time/Integrante (Topico 02)
	*/
	
	@RequestMapping(value="/novoIntegrante", method=RequestMethod.POST)
	public ResponseEntity<Integrante> gravarIntegrante(@RequestBody Integrante integrante){
		integrante = apiRestService.gravarIntegrante(integrante);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(integrante.getId()).toUri();
		return ResponseEntity.created(uri).body(integrante);
	}
	
	@RequestMapping(value="/novoTime", method=RequestMethod.POST)
	public ResponseEntity<Time> gravarTime(@RequestBody Time time){
		time = apiRestService.gravarTime(time);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(time.getId()).toUri();
		return ResponseEntity.created(uri).body(time);
	}
	
	
	/*
		 * EndPoints para teste de requisicao do Spring boot
	*/
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Integrante> findById(@PathVariable Integer id){
		Integrante integrante = apiRestService.findById(id);
		return ResponseEntity.ok().body(integrante);
	}
	
	@GetMapping(value="/integrantes")
	public ResponseEntity<List<Integrante>> integrantes(){
		System.out.print("Listando todos integrantes.");
		List<Integrante>  integrantes = apiRestService.integrantes();
		return ResponseEntity.ok().body(integrantes);
	}
	
	@GetMapping(value="/times")
	public ResponseEntity<List<Time>> times(){
		List<Time> times = apiRestService.times();
		return ResponseEntity.ok().body(times);
	}
	
	@GetMapping(value="/composicao")
	public ResponseEntity<List<ComposicaoTime>> composicao(){
		List<ComposicaoTime> composicao = apiRestService.composicao();
		return ResponseEntity.ok().body(composicao);
	}
	
	
	/*
 		* Regra de negocio EndPoints (Topico 03)
 	*/
	
	@GetMapping("/TimeDaData/{data}")
	public ResponseEntity<List<String>> timesDaData(@PathVariable LocalDate data){
		List<String> jogadores = apiRestService.timeDaData(data);
		return ResponseEntity.ok().body(jogadores);
	}
	
	@GetMapping("/FuncaoMaisComum/{dataInicial}/{dataFinal}")
	public ResponseEntity<String> funcaoMaisComum(@PathVariable LocalDate dataInicial, @PathVariable LocalDate dataFinal){
		String funcao = apiRestService.funcaoMaisComum(dataInicial, dataFinal);
		return ResponseEntity.ok().body(funcao);
	}
	
	@GetMapping("/FranquiaMaisComum/{dataInicial}/{dataFinal}")
	public ResponseEntity<String> franquiaMaisFamosa(@PathVariable LocalDate dataInicial, @PathVariable LocalDate dataFinal){
		String franquia = apiRestService.franquiaMaisFamosa(dataInicial, dataFinal);
		return ResponseEntity.ok().body(franquia);
	}
	
	@GetMapping("/ContagemPorFranquia/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<String>> contagemPorFranquia(@PathVariable LocalDate dataInicial, @PathVariable LocalDate dataFinal){
		List<String> franquias = apiRestService.contagemPorFranquia(dataInicial, dataFinal);
		return ResponseEntity.ok().body(franquias);
	}
	
	@GetMapping("/ContagemPorFuncao/{dataInicial}/{dataFinal}")
	public ResponseEntity<List<String>> contagemPorFuncao(@PathVariable LocalDate dataInicial, @PathVariable LocalDate dataFinal){
		List<String> funcao = apiRestService.contagemPorFuncao(dataInicial, dataFinal);
		return ResponseEntity.ok().body(funcao);
	}
	
	
}