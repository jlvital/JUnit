package es.iessoterohernandez.daw.endes;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class PilaTest {

	private Pila pila;

	@BeforeEach
	public void testInicial() {
		pila = new Pila();
	}

	@AfterEach
	public void testFinal() {
		pila = null;
	}

	@Test
	void testPilaSeCreaVacia() {
		assertThat(pila.isEmpty(), is(true));
	}

	@Test
	void testAgregaItems() {
		pila.push(1);									               // Añade el 1
		pila.push(15);								               // Añade el 15
		pila.push(28);
		assertThat(pila.isEmpty(), is(false));			// Verifica que la lista no está vacía
	}

	@Test
	void testExtraeUltimoItem() {
		pila.push(3);
		assertThat(pila.pop(), is(3));					    // Extrae el último valor añadido con .push
		assertThat(pila.pop(), nullValue());			  // Verifica que no hay elementos en la pila
	}

	@Test
	void testConsultaUltimoItem() {
		pila.push(19);
		pila.push(6);
		assertThat(pila.top(), is(6));					  // Consulta el último elemento añadido a la pila
		assertThat(pila.pop(), is(6));
		assertThat(pila.pop(), is(19));					  // Extrae el último valor añadido (19).
		assertThat(pila.top(), nullValue());
	}
}
