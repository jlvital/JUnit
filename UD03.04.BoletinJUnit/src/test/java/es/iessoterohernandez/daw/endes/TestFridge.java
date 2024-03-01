package es.iessoterohernandez.daw.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FridgeTest {
	
	private Fridge frigo;
	@BeforeEach
	public void testInicial() {
		frigo = new Fridge();
	}

	@AfterEach
	public void testFinal() {
		frigo = null;
	}
    @ParameterizedTest
    @ValueSource(strings = {"yogurt", "batido", "leche"})
    void testPut(String item) {
    }

    @Test
    void testContains() {
        String item = "tomate";
        assertFalse(frigo.contains(item));
        frigo.put(item);
        assertTrue(frigo.contains(item));
    }

    @ParameterizedTest
    @ValueSource(strings = {"yogurt", "batido", "leche"})
    void testTake(String item) {
        try {
			frigo.take(item);
		} catch (NoSuchItemException e) {
			
		}
    }
}
