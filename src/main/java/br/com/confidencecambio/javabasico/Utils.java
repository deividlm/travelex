package br.com.confidencecambio.javabasico;

public class Utils {
	
	public static String getFirstName(String nome) {;
	String[] names = nome.split(" ");

	return names[0];
	}
	public static String getLastName(String nome) {
		String[] names = nome.split(" ");

		return names[names.length -1];
	}

	public static String toUpperCase(String nome) {
		return nome.toUpperCase();
	}

	public static String getShortName(String nome) {
		String[] names = nome.split(" ");

		StringBuilder shortName = new StringBuilder();

		for (int i = 0; i < names.length; i ++) {
			if(i != 0 && i < names.length -1) {
				shortName.append(names[i].substring(0,1));
				shortName.append(".");
			}else {
				shortName.append(names[i]);
			}
			if(i != names.length -1) {
				shortName.append(" ");
			}

		}

		return shortName.toString();

	}

}
