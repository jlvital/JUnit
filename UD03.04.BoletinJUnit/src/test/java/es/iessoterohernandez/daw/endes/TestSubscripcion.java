package es.iessoterohernandez.daw.endes;
// Realizar todos los test de prueba necesarios para tener una cobertura del 100% en las clases Subscripcion

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class SubscripcionTest {

	private Subscripcion subs;

	@BeforeEach
	void testInicial() {
		subs = new Subscripcion(1200, 12);
	}

	@AfterEach
	void testFinal() {
		subs = null;
	}

	@Test
	void testPrecioMensualSubscripcion() {
		assertEquals(subs.precioPorMes(), 100);
		
		subs = new Subscripcion (209, 5);
		assertEquals(42.8, subs.precioPorMes());

		subs = new Subscripcion(0, -12);
		assertEquals(0, subs.precioPorMes());

		subs = new Subscripcion(-1000, 3);
		assertEquals(0, subs.precioPorMes(), 1);
	}

	@Test
	public void testSubscripcionCanceladaCorrectamente() {
		subs.cancel();
		assertEquals(0, subs.precioPorMes());

	}

}
