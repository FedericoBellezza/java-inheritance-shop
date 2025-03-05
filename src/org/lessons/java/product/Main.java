package org.lessons.java.product;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {    
        System.out.println("--------------------------------------");

        // Smartphone creation
        Prodotto IPhone12 = new Smartphone("Iphone 12", "Apple", new BigDecimal("1000"), new BigDecimal("0.22"), 123456789, 30);

        // Televisore creation
        Prodotto Samsung = new Televisore("Samsung", "Samsung", new BigDecimal("1000"), new BigDecimal("0.22"), 123456789, true);

        // Cuffie creation
        Prodotto AirPods = new Cuffie("AirPods", "Apple", new BigDecimal("1000"), new BigDecimal("0.22"), "Bianco", true);

        // stampa prodotto
        System.out.println(IPhone12.getProduct());
        System.out.println(Samsung.getProduct());
        System.out.println(AirPods.getProduct());
        
        IPhone12.stampaPrezzoconIva();
        IPhone12.stampaPrezzoScontato();

        System.out.println("--------------------------------------");
    }
    
}
