package es.iessoterohernandez.daw.endes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class BoaTest {
	private Boa boa;

	@BeforeEach
	/*
	 * Se crea una nueva instancia de la clase Boa antes de cada test, garantizando
	 * que todas las pruebas trabajen con la misma instancia/objeto
	 */
	public void setUp() {
		boa = new Boa("Boo", 5, "granola bars");
	}

	@Test
	public void testIsHealthy() {
		MatcherAssert.assertThat(boa.isHealthy(), Matchers.is(true));

		boa = new Boa("Boo", 5, "chicken");
		MatcherAssert.assertThat(boa.isHealthy(), Matchers.is(false));
	}

	@Test
	/*
	 * Se está verificando que la boa con un largo de 5 pies cabe en una jaula de 10
	 * pies pero no en una de 4 pies
	 */
	public void testFitsInCage() {
		MatcherAssert.assertThat(boa.fitsInCage(10), Matchers.is(true));
		MatcherAssert.assertThat(boa.fitsInCage(4), Matchers.is(false));
	}
}
