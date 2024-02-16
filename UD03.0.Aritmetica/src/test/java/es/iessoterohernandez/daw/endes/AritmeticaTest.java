package es.iessoterohernandez.daw.endes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

	//@Test
	//public void testSuma() {
	//	fail("Not yet implemented");
	// }

	
	@Test
	public void testSuma() {
	    Aritmetica aritmetica = new Aritmetica(); // Instancia (objeto) de la clase aritmética
	    assertEquals(2, aritmetica.suma(1, 1));
	}
	
	@Test
	public void testResta() {
	    Aritmetica aritmetica = new Aritmetica(); // Instancia (objeto) de la clase aritmética
	    assertEquals(3, aritmetica.resta(4, 1));
	}
	@Test
	public void testMultiplicacion() {
	    Aritmetica aritmetica = new Aritmetica(); // Instancia (objeto) de la clase aritmética
	    assertEquals(6, aritmetica.multiplicacion(2, 3));
	}
	@Test
	public void testDivision() {
	    Aritmetica aritmetica = new Aritmetica(); // Instancia (objeto) de la clase aritmética
	    assertEquals(5, aritmetica.division(10, 2));
	}

}
