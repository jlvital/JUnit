package es.iessoterohernandez.daw.endes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.*;

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
    private Product product1;
    private Product product2;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        product1 = new Product("Product 1", 10.0);
        product2 = new Product("Product 2", 20.0);
    }

    @Test
    public void testInitialItemCountIsZero() {
        assertThat(cart.getItemCount(), is(0));
    }

    @Test
    public void testEmptyCartHasZeroItems() {
        assertThat(cart.getItemCount(), is(0));
    }

    @Test
    public void testAddItemIncreasesItemCount() {
        cart.addItem(product1);
        assertThat(cart.getItemCount(), is(1));
    }

    @Test
    public void testAddItemIncreasesBalance() {
        cart.addItem(product1);
        assertThat(cart.getBalance(), is(closeTo(10.0, 0.001)));
    }

    @Test
    public void testRemoveItemDecreasesItemCount() throws ProductNotFoundException {
        cart.addItem(product1);
        cart.removeItem(product1);
        assertThat(cart.getItemCount(), is(0));
    }

    @Test
    public void testRemoveNonExistingItemThrowsException() {
        assertThrows(ProductNotFoundException.class, () -> {
            cart.removeItem(product1); // This should throw ProductNotFoundException
        });
    }

    @Test
    public void testGetBalanceAfterAddingAndRemovingItems() throws ProductNotFoundException {
        cart.addItem(product1);
        cart.addItem(product2);
        cart.removeItem(product1);
        assertThat(cart.getBalance(), is(closeTo(20.0, 0.001)));
    }

    @Test
    public void testEmptyCart() {
        cart.addItem(product1);
        cart.empty();
        assertThat(cart.getItemCount(), is(0));
    }
}


