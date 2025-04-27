package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactureTest {

    @Test
    public void testFactureCreation() {
        Facture facture = new Facture(1, "F001", "2025-04-27", "Client Test", 150.0);

        assertEquals(1, facture.getId());
        assertEquals("F001", facture.getNumero());
        assertEquals("2025-04-27", facture.getDate());
        assertEquals("Client Test", facture.getClient());
        assertEquals(150.0, facture.getMontantTotal(), 0.001);
    }

    @Test
    public void testSettersAndGetters() {
        Facture facture = new Facture();

        facture.setId(2);
        facture.setNumero("F002");
        facture.setDate("2025-04-28");
        facture.setClient("Client Deux");
        facture.setMontantTotal(200.0);

        assertEquals(2, facture.getId());
        assertEquals("F002", facture.getNumero());
        assertEquals("2025-04-28", facture.getDate());
        assertEquals("Client Deux", facture.getClient());
        assertEquals(200.0, facture.getMontantTotal(), 0.001);
    }
}
