package org.lessons.java.product;

// import
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // costruttori
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) { 
        this.codice = (int) Math.round(Math.random() * 1000);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva =  iva.setScale(2, RoundingMode.DOWN);;
    }

    // setters
    public void setNome(String nome) {
        if (nome.length() > 0 && nome.length() <= 50) {
            this.nome = nome;
        }
    }

    public void setMarca(String marca) {
        if (marca.length() > 100) {
            this.marca = marca;
        }
    }

    public void setPrezzo(BigDecimal prezzo) {
        if (prezzo.compareTo(BigDecimal.ZERO) >= 0) { 
            this.prezzo = prezzo.setScale(2, RoundingMode.DOWN); 
        };
    }

    public void setIva(BigDecimal iva) {
       if (iva.compareTo(BigDecimal.ZERO) >= 0) { 
        this.iva = iva.setScale(2, RoundingMode.DOWN); 
    };
    }

    // getters
    public String getProduct(){
        return (this.codice + " - " + this.nome + ":\n- marca: " + this.marca + "\n- prezzo: " + this.prezzo + "\n- iva: " + (this.iva.multiply(new BigDecimal(100))).setScale(0, RoundingMode.DOWN) + "%");
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    


    // metodi
    public void stampaPrezzo(){
        System.out.println("Il prezzo del prodotto e': " + this.prezzo + " euro");  
    }
    public void stampaPrezzoconIva(){
        System.out.println("Il prezzo del prodotto con iva e': " + (this.prezzo.add( this.prezzo.multiply(this.iva))).setScale(2, RoundingMode.DOWN) + " euro");
    }
    public void stampaNomeCompleto(){
        System.out.println("Il nome del completo del prodotto e': " + this.codice + "-" + this.nome);
    }
}
