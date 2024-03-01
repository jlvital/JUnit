package es.iessoterohernandez.daw.endes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

public class OperadorAritmeticoTest {
	
	@Test
	public void testSumar() {
		 OperadorAritmetico op = new OperadorAritmetico();
		assertEquals(25, OperadorAritmetico.suma(22, 3));
	}

	@Test
	public void testDividir() throws Exception {
		assertEquals(0, OperadorAritmetico.division(0, 1));
		assertEquals(-2, OperadorAritmetico.division(-6, 3));
	}

		@Test 
		public void testDivision() throws Exception {
			assertEquals(0, OperadorAritmetico.division(0, 12));
			assertEquals(9, OperadorAritmetico.division(27, 3));
			assertEquals(-5, OperadorAritmetico.division(25, -5));
			try {
				OperadorAritmetico.division(18, 0);
				fail("Excepción esperada pero no lanzada");
			} catch (Exception e) {
				assertTrue(e instanceof Exception);
			}
		}
}
