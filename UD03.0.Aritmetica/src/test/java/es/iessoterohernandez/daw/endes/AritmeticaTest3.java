package es.iessoterohernandez.daw.endes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest3 {

	//@Test
	//public void testSuma() {
	//	fail("Not yet implemented");
	// }
	
	/* Con @BeforeAll tenemos que marcar como STATIC tanto el MÉTODO como la
	 * PROPIEDAD / ATRIBUTO al que se accede, que también será private */
	
	private static Aritmetica aritmetica;
	
	// @BeforeEach
	// public void init() {
	// 	aritmetica = new Aritmetica();
	// }
	
	@BeforeAll // El MÉTODO tiene que ser STATIC
	public static void init () {
		aritmetica = new Aritmetica();
	}
	
	@Test
	public void testSuma() {
	    // Aritmetica aritmetica = new Aritmetica(); -> Ya no es necesario crear el objeto dentro del test
	    assertEquals(2, aritmetica.suma(1, 1));
	}
	
	@Test
	public void testResta() {
	    // Aritmetica aritmetica = new Aritmetica(); -> Ya no es necesario crear el objeto dentro del test
	    assertEquals(3, aritmetica.resta(4, 1));
	}
	@Test
	public void testMultiplicacion() {
	    // Aritmetica aritmetica = new Aritmetica(); -> Ya no es necesario crear el objeto dentro del test
	    assertEquals(6, aritmetica.multiplicacion(2, 3));
	}
	@Test
	public void testDivision() {
	    // Aritmetica aritmetica = new Aritmetica(); -> Ya no es necesario crear el objeto dentro del test
	    assertEquals(5, aritmetica.division(10, 2));
	}

}