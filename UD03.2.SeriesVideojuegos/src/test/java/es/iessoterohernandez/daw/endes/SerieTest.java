package es.iessoterohernandez.daw.endes;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerieTest {
	private Serie serieA, serieB;

	@BeforeEach
	public void iniciarTest() {
		serieA = new Serie("Friends", 10, "Sitcom", "Marta Kauffman");
		serieB = new Serie ("The West Wing", 8, "Drama", "Aaron Sorkin");
	}

	@AfterEach
	public void limpiarTest() {
		serieA = serieB = null;
	}

	@Test
	public void testMismaSerie() {
		assertTrue(serieB.equals(serieB)); // Si dos series son iguales,  devuelve true;
		assertFalse(serieA.equals(serieB)); // Si dos series son diferentes devuelve false;
	}

	@Test
	public void testNumTemporadas() {
		assertNotEquals(0, serieA.compareTo(serieB)); // Comprueba que dos series con diferentes temporadas no devuelve 0
		serieA.setNumeroTemporadas(8);
		assertEquals(0, serieB.compareTo(serieA)); // Comprueba que dos series con el mismo número de temporadas devuelve 0
		
		serieB.setNumeroTemporadas(5);
		assertFalse(serieA.compareTo(serieB) < 0); // Comprueba que una serie tiene menos temporadas que otra
		assertTrue(serieA.compareTo(serieB) > 0); // Comprueba que una serie tiene más temporadas que otra
	}
	
	@Test
	public void testTitulo() {
		serieA.setTitulo("Castle");
		assertThat(serieA.getTitulo(), is("Castle"));
		
		serieB.setTitulo("Game of Thrones");
		assertThat(serieB.getTitulo(), not ("Friends"));
	}
	
	@Test
	public void testTemporadasEmitidas() {
		serieA.setNumeroTemporadas(4);
		assertThat(serieA.getNumeroTemporadas(), is(4));
		assertThat(serieB.getNumeroTemporadas(), is(8));
	}
	
	@Test
	public void testGeneroSerie() {
		serieA.setGenero("Fantasía");
		assertThat(serieA.getGenero(), is("Fantasía"));
		assertThat(serieB.getGenero(), is("Drama"));
	}
	
	@Test
	public void testCreadorSerie() {
		serieA.setCreador("David Benioff");
		assertThat(serieA.getCreador(), not ("Marta Kauffman")); // ¿Le tengo que pasar el valor correcto, que sería "David Benioff"? O puedo dejar uno que no es parq qué explote?
		assertThat(serieB.getCreador(), is("Aaron Sorkin"));
	}
}
