package br.com.edmos.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.edmos.controller.dto.PessoaFisicaDto;
import br.com.edmos.controller.form.PessoaFisicaForm;
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
	
	@GetMapping
	public Page<PessoaFisicaDto> listAll(@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 10) Pageable pageable) {
		log.info("Executando serviço ListAll");
		Page<PessoaFisica> pagePessoas = repository.findAll(pageable);
		
		return PessoaFisicaDto.converter(pagePessoas);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PessoaFisicaDto> getPessoaFisicaById(@PathVariable Long id) {
		Optional<PessoaFisica> pessoaFisica = repository.findById(id);
		
		if(pessoaFisica.isPresent()) {
			return ResponseEntity.ok(new PessoaFisicaDto(pessoaFisica.get()));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<PessoaFisicaDto> addNewPessoaFisica(@RequestBody PessoaFisicaForm form, UriComponentsBuilder uriBuilder) {
		PessoaFisica pessoa = repository.save(form.toPessoaFisica());
		
		URI uri = uriBuilder.path("").buildAndExpand(pessoa.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new PessoaFisicaDto(pessoa));
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<PessoaFisicaDto> updatePessoaFisica(@PathVariable Long id, @RequestBody PessoaFisicaForm form) {
		Optional<PessoaFisica> pessoa = repository.findById(id);
		
		if(pessoa.isPresent()) {
			PessoaFisica novaPessoa = form.update(id, repository);
			return ResponseEntity.ok(new PessoaFisicaDto(novaPessoa));
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> removePessoaFisica(@PathVariable Long id) {
		Optional<PessoaFisica> pessoa = repository.findById(id);
		
		if(pessoa.isPresent()) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
