package com.philippa.aa2ed;

import domain.*;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
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

    /**
     * Este test comprueba que el método sobrescrito equals() en la clase CD funciona como lo esperado
     */
    @Test
    public void testEqualsCd() {
        CD cd1 = new CD("Snarky Puppy", "Immigrance", false, 9, 15.99, false);
        CD cd2 = new CD("Snarky Puppy", "Immigrance", false, 9, 15.99, false);
        CD cd3 = new CD("Joe Satriani", "Surfing with the Alien", false,  10, 8.46, true);
        assertEquals(cd1, cd2);
        assertNotEquals(cd1, cd3);
    }

    /**
     * Este test comprueba que el método sobrescrito equals() en la clase Vinyl funciona como lo esperado
     */
    @Test
    public void testEqualsVinyl() {
        Vinyl v1 = new Vinyl("Jurassic 5", "Quality Control", false, 12, 5.67, false);
        Vinyl v2 = new Vinyl("Jurassic 5", "Quality Control", false, 12, 5.67, false);
        Vinyl v3 = new Vinyl("A Tribe Called Quest", "People´s Instinctive Travels and the Paths of Rhythm", false, 12, 11.82, true);
        assertEquals(v1, v2);
        assertNotEquals(v1, v3);
    }

    /**
     * Este test comprueba que el método sobrescrito equals() en la clase Order funciona como lo esperado
     */
    @Test
    public void testEqualsOrder() {
        Order order1 = new Order(16, OBJECT_TYPE.VINYL, "Rufus and Chaka Khan", "Rufus", 6);
        Order order2 = new Order(16, OBJECT_TYPE.VINYL, "Rufus and Chaka Khan", "Rufus", 6);
        Order order3 = new Order(54, OBJECT_TYPE.CD, "Ry Cooder", "Bop Till You Drop", 89);
        assertEquals(order1, order2);
        assertNotEquals(order1, order3);
    }

    /**
     * Este test comprueba que el método sobrescrito equals() en la clase Customer funciona como lo esperado
     */
    @Test
    public void testEqualsCustomer() {
        Customer c1 = new Customer(85, "Mare", "Brown", telephone, email);
        Customer c2 = new Customer(85, "Mare", "Brown", telephone, email);
        Customer c3 = new Customer(86, "James", "Jones", telephone, email);
        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
    }
}
