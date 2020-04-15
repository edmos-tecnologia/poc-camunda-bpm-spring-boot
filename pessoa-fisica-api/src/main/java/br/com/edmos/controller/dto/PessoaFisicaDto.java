package br.com.edmos.controller.dto;

import org.springframework.data.domain.Page;

import br.com.edmos.pessoa.fisica.entity.PessoaFisica;
import lombok.Getter;

@Getter
public class PessoaFisicaDto {
	
	private Long id;
	private String primeiroNome;
	private String nomeDoMeio;
	private String sobreNome;
	private String cpf;
	
	public PessoaFisicaDto(PessoaFisica pessoaFisica) {
		this.id = pessoaFisica.getId();
		this.primeiroNome = pessoaFisica.getPrimeiroNome();
		this.nomeDoMeio = pessoaFisica.getNomeDoMeio();
		this.sobreNome = pessoaFisica.getSobreNome();
		this.cpf = pessoaFisica.getCpf();
	}

	public static Page<PessoaFisicaDto> converter(Page<PessoaFisica> pagePessoas) {
		return pagePessoas.map(PessoaFisicaDto::new);
	}
}
