package br.com.edmos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edmos.jpa.repository.EnderecoRepository;
import br.com.edmos.jpa.repository.PessoaFisicaRepository;
import br.com.edmos.pessoa.fisica.entity.PessoaFisica;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController()
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/pessoa-fisica")
public class PessoaFisicaController {
	
	private final PessoaFisicaRepository repository;
	
	private final EnderecoRepository enderecoRepository;
	
	@GetMapping("/pessoas")
	public List<PessoaFisica> listAll() {
		log.info("Executando serviço ListAll");
		List<PessoaFisica> listPessoas = repository.findAll();
		return listPessoas ;
	}
	
	@GetMapping("/pessoas/{id}")
	public PessoaFisica getPessoaFisicaById(Long id) {
		return repository.getOne(id);
	}
	
	@PostMapping(path = "/pessoas", consumes = "application/json")
	public PessoaFisica addNewPessoaFisica(@RequestBody(required = true) PessoaFisica pessoa) {
		
		pessoa.setEnderecoComercial(enderecoRepository.save(pessoa.getEnderecoComercial()));
		pessoa.setEnderecoResidencial(enderecoRepository.save(pessoa.getEnderecoResidencial()));
		
		pessoa = repository.save(pessoa);
		return pessoa;
	}
}
