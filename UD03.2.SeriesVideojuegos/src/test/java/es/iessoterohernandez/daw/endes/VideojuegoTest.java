package es.iessoterohernandez.daw.endes;

import static org.junit.Assert.*; //Pertenece a JUnit4. Actualizar por JUnit5
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideojuegoTest {

	private Videojuego videojuego1, videojuego2, videojuego3;
	
    @BeforeEach
    public void iniciarTest() {
        videojuego1 = new Videojuego("The Last of Us", "Naughty Dog");
        videojuego2 = new Videojuego("God of War", 125, "Aventura", "Santa Monica Studio");
    }
    @AfterEach
    public void limpiarTest() {
    	videojuego1 = videojuego2 = null;
    }
    
    @Test
	public void testDistintoVideojuego() {
    	videojuego3 = new Videojuego("Prince of Persia", 140, "Aventura", "Ubisoft");
    	assertFalse(videojuego1.equals(videojuego3));
	}
	
	@Test
	public void testMismoVideojuego() {
		videojuego1=videojuego2;
		assertTrue(videojuego1.equals(videojuego2));
	}
    @Test
    public void tesTitulo() {
        videojuego1.setTitulo("God of War");
        assertEquals("God of War", videojuego1.getTitulo());
    }

    @Test
    public void testHorasEstimadas() {
        videojuego2.setHorasEstimadas(50);
        assertThat(videojuego2.getHorasEstimadas(), is(50));
    }

    @Test
    public void testGenero() {
        videojuego1.setGenero("Acción");
        assertThat(videojuego1.getGenero(), not ("Aventura"));
    }

    @Test
    public void testCompania() {
        videojuego2.setCompania("Santa Monica Studio");
        assertEquals("Santa Monica Studio", videojuego2.getCompania());
    }
    
    @Test
	public void testHorasVideojuego() {
    	videojuego1.setHorasEstimadas(120);
		assertNotEquals(0, videojuego1.compareTo(videojuego2)); // Comprueba que dos videojuegos con una duración estimada diferente, no devuelve 0
		videojuego1.setHorasEstimadas(125);
		assertEquals(0, videojuego1.compareTo(videojuego2)); // Comprueba que dos videojuegos con la misma duración devuelve 0
		
		videojuego2.setHorasEstimadas(95);
		assertFalse(videojuego2.compareTo(videojuego1) > 0); // Comprueba que un videojuego dura más que otro
		assertTrue(videojuego2.compareTo(videojuego1) < 0); // Comprueba que un videojuego dura menos que otro
	}
    @Test
    public void testEsEntregado () {
    	assertFalse(videojuego1.isEntregado());
    	videojuego1.entregar();
    	assertTrue(videojuego1.isEntregado());
    }
}
