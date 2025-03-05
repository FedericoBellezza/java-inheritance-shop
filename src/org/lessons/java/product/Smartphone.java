package org.lessons.java.product;

// imports
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Smartphone extends Prodotto {

    protected int imeiCode;
    protected int storageInGB;
    

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int imeiCode, int storageInGB) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.storageInGB = storageInGB;

        // discounts
        if (storageInGB < 32) {
            this.sconto = new BigDecimal(0.05);
        }
        this.prezzoScontato = (prezzoConIva.subtract(prezzoConIva.multiply(sconto))).setScale(2, RoundingMode.DOWN);
    }

    // getters
    @Override
    public String getProduct() {
        return super.getProduct() + 
        "\n- codice imei: " + this.imeiCode + 
        "\n- memoria: " + this.storageInGB + " GB";
    }

    public int getImeiCode() {
        return imeiCode;
    }

    public int getStorageInGB() {
        return storageInGB;
    }

    // setters
    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }   

    public void setStorageInGB(int storageInGB) {
        if (storageInGB > 0) {
            this.storageInGB = storageInGB;
        }
    }

}
