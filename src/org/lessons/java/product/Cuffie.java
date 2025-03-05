package org.lessons.java.product;

// imports
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto{

    private String colore;
    protected boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;

        // discounts
        if (!wireless) {
            this.sconto = new BigDecimal(0.07);
        }
        this.prezzoScontato = (prezzoConIva.subtract(prezzoConIva.multiply(sconto))).setScale(2, RoundingMode.DOWN);
    }

    // getters
    @Override
    public String getProduct() {
        return super.getProduct() + 
        "\n- colore: " + this.colore + 
        "\n- wireless: " + this.wireless;
    }


    public String getColore() {
        return colore;
    }

    public boolean isWireless() {   
        return wireless;
    }

    // setters
    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
