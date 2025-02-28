package org.lessons.java.product;

// imports
import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    protected int imeiCode;
    protected int storageInGB;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int imeiCode, int storageInGB) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.storageInGB = storageInGB;

    }

}
