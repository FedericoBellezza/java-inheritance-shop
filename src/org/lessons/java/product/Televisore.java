package org.lessons.java.product;

// imports
import java.math.BigDecimal;

public class Televisore extends Prodotto {
    protected int pollici;
    protected boolean isSmartTV;

    // Constructor
    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici, boolean isSmartTV) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmartTV = isSmartTV;
    }
}