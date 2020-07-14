package br.com.edmos.camunda.pessoafisica.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Pessoas {
	private final List<Pessoa> pessoas = new ArrayList<Pessoa>();
}
