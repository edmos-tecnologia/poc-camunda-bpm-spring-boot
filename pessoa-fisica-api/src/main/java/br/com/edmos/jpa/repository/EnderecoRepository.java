package br.com.edmos.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edmos.pessoa.fisica.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
