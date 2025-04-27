package com.example;

public class Facture {
    private int id;
    private String numero;
    private String date;
    private String client;
    private double montantTotal;

    public Facture() {}

    public Facture(int id, String numero, String date, String client, double montantTotal) {
        this.id = id;
        this.numero = numero;
        this.date = date;
        this.client = client;
        this.montantTotal = montantTotal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public String getClient() {
        return client;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}

