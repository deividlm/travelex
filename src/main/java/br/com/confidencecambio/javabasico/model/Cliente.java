package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.IPessoa;

public class Cliente extends Pessoa implements IPessoa{

	public Cliente(String nome) {
		super(nome);
	}
	

}
