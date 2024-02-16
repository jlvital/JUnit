package es.iessoterohernandez.daw.endes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
/*
 * NO HACE FALTA COMENTAR LOS SETTERS Y LOS GETTERS
 Realiza los test necesarios para asegurarte que se cumplan las siguientes especificaciones:
- Cuando se crea, el carro tiene 0 elementos.
- Cuando está vacío, el carro tiene 0 elementos.
- Cuando se añade un producto, el número de elementos debe incrementarse.
- Cuando se añade un producto, el balance nuevo debe ser la suma del balance anterior y el precio del producto añadido.
- Cuando se elimina un producto, el número de elementos debe decrementarse.
- Cuando se intenta eliminar un producto que no está en el carro, se debe lanzar una 
  excepción ProductNotFoundException. Pista: inserta la llamada en un bloque try y pon un método fail() después de la llamada a removeItem().
 */
	
	private ShoppingCart cart;

    @BeforeEach
    public void iniciarTest() {
        cart = new ShoppingCart();
    }

    @Test
    public void carritoVacio() {
        assertEquals(0, cart.getItemCount());
    }
	
}
