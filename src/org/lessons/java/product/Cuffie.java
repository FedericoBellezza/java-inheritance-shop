package org.lessons.java.product;

// imports
import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    private String colore;
    protected boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

}
