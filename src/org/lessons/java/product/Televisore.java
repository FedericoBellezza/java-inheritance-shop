package org.lessons.java.product;

// imports
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto {
    protected int pollici;
    protected boolean isSmartTV;

    // Constructor
    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici, boolean isSmartTV) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmartTV = isSmartTV;

        // discounts
        if (!isSmartTV) {
            this.sconto = new BigDecimal(0.1);
        }
        this.prezzoScontato = (prezzoConIva.subtract(prezzoConIva.multiply(sconto))).setScale(2, RoundingMode.DOWN);
    }

    // getters
    @Override
    public String getProduct() {
        return super.getProduct() + 
        "\n- pollici: " + this.pollici + " pollici" + 
        "\n- smart tv: " + this.isSmartTV;
    }
    public int getPollici() {
        return pollici;
    }
    public boolean isSmartTV() {
        return isSmartTV;
    }

    // setters
    public void setPollici(int pollici) {
        this.pollici = pollici;
    }
    public void setSmartTV(boolean isSmartTV) {
        this.isSmartTV = isSmartTV;
    }
}