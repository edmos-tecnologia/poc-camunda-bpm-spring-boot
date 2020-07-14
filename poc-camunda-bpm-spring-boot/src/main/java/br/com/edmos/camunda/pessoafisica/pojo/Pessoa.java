package br.com.edmos.camunda.pessoafisica.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Pessoa {
	private Long id;
	private String tipo;
	private PessoaFisica pessoaFisica;
	private List<Endereco> enderecos;
}
