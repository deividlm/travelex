package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.IPessoa;

public class Pessoa implements IPessoa{
	
	private String nome;
	
	public Pessoa(String nome) {
		if(nome == null || "".equals(nome)
				|| nome.endsWith(" ")
				|| nome.startsWith(" ")) {
			throw new IllegalArgumentException("O nome não pode ser nulo ou vazio");
		}
		this.nome = nome;
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
