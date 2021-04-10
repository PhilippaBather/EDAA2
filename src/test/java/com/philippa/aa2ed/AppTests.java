package com.philippa.aa2ed;

import domain.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTests {
    //declaramos las variables
    private static final String email = "test@test.com";
    private static final String telephone = "1111";

    /**
     * Este test comprueba que el constructor en la clase CD funciona como lo esperado
     */
    @Test
    public void testCDConstructor() {
        CD cd1 = new CD("Mark Lettieri", "Knows", false, 7, 10.99, false);
        assertEquals("Mark Lettieri", cd1.getArtist());
        assertEquals("Knows", cd1.getName());
        assertFalse(cd1.isExplicit());
        assertEquals(7, cd1.getTracks());
        assertEquals(10.99, cd1.getPrice());
        assertFalse(cd1.isImport());
    }

    /**
     * Este test comprueba que el constructor en la clase CD funciona como lo esperado
     */
    @Test
    public void testVinylConstructor() {
        Vinyl vinyl1 = new Vinyl("Smashing Pumpkins", "Siamese Dream", true, 13, 16.77, true);
        assertEquals("Smashing Pumpkins", vinyl1.getArtist());
        assertEquals("Siamese Dream", vinyl1.getName());
        assertTrue(vinyl1.isExplicit());
        assertEquals(13, vinyl1.getTracks());
        assertEquals(16.77, vinyl1.getPrice());
        assertTrue(vinyl1.isSecondHand());
    }

    /**
     * Este test comprueba que el constructor en la clase CD funciona como lo esperado
     */
    @Test
    public void testOrderConstructor() {
        Order order1 = new Order(37, OBJECT_TYPE.VINYL, "Unleash the Archers", "Awakening", 22);
        assertEquals(37, order1.getOrderId());
        assertEquals(OBJECT_TYPE.VINYL, order1.getItem());
        assertEquals("Unleash the Archers", order1.getArtist());
        assertEquals("Awakening", order1.getName());
        assertEquals(22, order1.getCustomerId());
    }

    /**
     * Este test comprueba que el constructor completo en la clase CD funciona como lo esperado
     */
    @Test
    public void testCustomerConstructor1() {
        Customer customer = new Customer(666, "Sean", "Noble", telephone, email, 99);
        assertEquals(666, customer.getCustomerId());
        assertEquals("Sean", customer.getName());
        assertEquals("Noble", customer.getSurname());
        assertEquals(telephone, customer.getTelephone());
        assertEquals(email, customer.getEmail());
        assertEquals(99, customer.getOrderNum());
    }

    /**
     * Este test comprueba que el constructor sin la propiedad orderNum (número del pedido) en la clase CD funciona como lo esperado
     */
    @Test
    public void testCustomerConstructor2() {
        Customer customer = new Customer(77, "Philippa", "Bather", telephone, email);
        assertEquals(77, customer.getCustomerId());
        assertEquals("Philippa", customer.getName());
        assertEquals("Bather", customer.getSurname());
        assertEquals(telephone, customer.getTelephone());
        assertEquals(email, customer.getEmail());
    }
}
