package br.com.confidencecambio.javabasico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import br.com.confidencecambio.javabasico.model.Robo;

@SpringJUnitConfig
public class RoboTest {


	@Test
	public void nameNotNullTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Robo(null);
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	public void nameNotBlanckTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Robo(null);
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void nameStartsWithBlancSpaceTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Robo(" Deivid Landim Mourão");
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void nameEndsWithBlancSpaceTest() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Robo("Deivid Landim Mourão ");
		});

		String expectedMessage = "O nome não pode ser nulo ou vazio";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
	



	@Test
	public void firstNameTest() {
		Robo r = new Robo("Deivid Landim Mourão");
		String shortName = "Deivid";

		assertEquals(shortName, r.getFirstName(r.getNome()));
	}

	@Test
	public void lastNameTest() {
		Robo r = new Robo("Deivid Landim Mourão");
		String shortName = "Mourão";

		assertEquals(shortName, r.getLastName(r.getNome()));
	}

	@Test
	public void shortNameTest() {
		Robo r = new Robo("Deivid Landim Mourão");
		String shortName = "Deivid L. Mourão";

		assertEquals(shortName, r.getShortName(r.getNome()));
	}

	@Test
	public void upercaseNameTest() {
		Robo r = new Robo("Deivid Landim Mourão");
		String shortName = "DEIVID LANDIM MOURÃO";

		assertEquals(shortName, r.getUpercaseName(r.getNome()));
	}

}
