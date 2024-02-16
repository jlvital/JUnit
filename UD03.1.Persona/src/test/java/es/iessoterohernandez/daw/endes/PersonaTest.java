package es.iessoterohernandez.daw.endes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	private Persona persona;

	@BeforeEach
	public void init() {
		persona = new Persona("Paco", 37, 'H', 82.6, 1.88);
	}

	@AfterEach
	public void finish() {
		persona = null;
	}
	// Verificar que el método esMayorDeEdad() devuelve true cuando la edad es mayor o igual a 18, y false cuando es menor
	
	@Test
	public void testMayorDeEdad() {
		assertTrue(persona.esMayorDeEdad());
	}
	// Verificar que el método calcularIMC() devuelve el código correcto para diferentes valores de peso.
	@Test
	public void testPesoIdeal() {
		assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
	}

	@Test
	public void testInfrapeso() {
		persona.setPeso(50.0); // Peso bajo el ideal
		assertEquals(Persona.INFRAPESO, persona.calcularIMC());
	}

	@Test
	public void testSobrepeso() {
		persona.setPeso(90.0); // Peso por encima del ideal
		assertEquals(Persona.SOBREPESO, persona.calcularIMC());
	}

}
