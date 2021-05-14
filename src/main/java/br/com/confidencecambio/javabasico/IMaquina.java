package br.com.confidencecambio.javabasico;

public interface IMaquina {

	public default String getFirstName(String nome) {;
	String[] names = nome.split(" ");

	return names[0];
	}
	public default String getLastName(String nome) {
		return Utils.getLastName(nome);
	}

	public default String getUpercaseName(String nome) {
		return Utils.toUpperCase(nome);
	}

	public default String getShortName(String nome) {
		return Utils.getShortName(nome);
	}
}
