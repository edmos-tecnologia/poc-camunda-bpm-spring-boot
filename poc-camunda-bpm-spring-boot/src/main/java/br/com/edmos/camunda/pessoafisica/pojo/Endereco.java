package br.com.edmos.camunda.pessoafisica.pojo;

//import lombok.Data;

//@Data
public class Endereco {
	private Long id;
	private Integer tipoEndereco;
	private Boolean enderecoPrincipal;
	private String tipoLogradouro;
	private String logradouro;
	private String bairro;
	private Long numero;
	private String complemento;
	private String cep;
	private String cidade;
	private String uf;
}
