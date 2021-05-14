package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.IPessoa;

public class Gerente extends Pessoa implements IPessoa{

	public Gerente(String nome) {
		super(nome);
	}
}
