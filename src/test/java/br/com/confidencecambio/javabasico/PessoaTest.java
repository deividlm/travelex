package br.com.confidencecambio.javabasico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import br.com.confidencecambio.javabasico.model.Cliente;

@SpringJUnitConfig
public class PessoaTest {
	
	

	@Test
	public void nameNotNullTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Cliente(null);
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	public void nameNotBlanckTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Cliente(null);
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void nameStartsWithBlancSpaceTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Cliente(" Deivid Landim Mourão");
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void nameEndsWithBlancSpaceTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Cliente("Deivid Landim Mourão ");
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	



	@Test
	public void firstNameTest() {
		Cliente r = new Cliente("Deivid Landim Mourão");
		String shortName = "Deivid";

		assertEquals(shortName, r.getFirstName(r.getNome()));
	}

	@Test
	public void lastNameTest() {
		Cliente r = new Cliente("Deivid Landim Mourão");
		String shortName = "Mourão";

		assertEquals(shortName, r.getLastName(r.getNome()));
	}

	@Test
	public void shortNameTest() {
		Cliente r = new Cliente("Deivid Landim Mourão");
		String shortName = "Deivid L. Mourão";

		assertEquals(shortName, r.getShortName(r.getNome()));
	}

	@Test
	public void upercaseNameTest() {
		Cliente r = new Cliente("Deivid Landim Mourão");
		String shortName = "DEIVID LANDIM MOURÃO";

		assertEquals(shortName, r.getUpercaseName(r.getNome()));
	}


}
