package br.com.edmos.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edmos.pessoa.fisica.pojos.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
	
}
