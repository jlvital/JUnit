package es.iessoterohernandez.daw.endes;

import java.text.NumberFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AccountTest {
	private static Account account;

	@BeforeEach
	public void testInicial() {
		account = new Account("Jose", 359359359, 500);
	}

	@AfterEach
	public void testFinal() {
		account = null;
	}

	@Test
	public void testDepositoDinero() {

		assertTrue(account.deposit(500));
		assertEquals(1000, account.getBalance());
		assertFalse(account.deposit(180));
	}

	@Test
	public void testRetiradaEfectivo() {
		assertTrue(account.withdraw(300, 0));
		assertEquals(700, account.getBalance());
	}

	@Test
	public void testNumeroCuenta() {
		assertEquals(359359359, account.getAccountNumber());
	}

	@Test
	public void testTipoInteres() {
		float initialBalance = account.getBalance();
		account.addInterest();
		float finalBalance = account.getBalance();
		assertEquals(104.5f, finalBalance);
	}

	@Test
	public void testDecimalFailure() {
		float balance = account.getBalance();
		for (int i = 0; i < 100; i++) {
			balance += 0.23f;
		}
		assertNotEquals(balance, 773f);

	}

	@Test
	public void testToString()
    {
        assertEquals("359359359\tJose\t500 €", account.toString());
}
}
