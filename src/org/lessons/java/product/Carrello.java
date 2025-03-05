package org.lessons.java.product;

import java.util.Scanner;
import java.math.BigDecimal;


public class Carrello {

    // config
    Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("-----------------------------------------");

        System.out.println("Inserisci nome prodotto");
        String nome = scanner.next();

        System.out.println("Inserisci la marca del prodotto");
        String marca = scanner.next();

        System.out.println("Inserisci il prezzo (120,99)");
        BigDecimal prezzo = scanner.nextBigDecimal();

        System.out.println("Inserisci l'iva del prodotto (0,22)");
        BigDecimal iva = scanner.nextBigDecimal();

        System.out.println("Che tipo di prodotto è? (Smartphone, Televisore, Cuffie)");
        String type = scanner.next().toLowerCase();

        if (type.equals("smartphone")) {
            System.out.println("Inserisci il codice imei del telefono");
            int imei = scanner.nextInt();
            System.out.println("Inserisci la memoria del telefono (64)");
            int storage = scanner.nextInt();

            Smartphone telefono = new Smartphone(nome, marca, prezzo, iva, imei, storage);
            System.out.println(telefono.getProduct());
        }
        if (type.equals("televisore")) {
            System.out.println("Inserisci il numero di pollici del televisore");
            int pollici = scanner.nextInt();
            System.out.println("Il televisore ha la funzione smart? (true/false)");
            boolean smart = scanner.nextBoolean();  

            Prodotto televisore = new Televisore(nome, marca, prezzo, iva, pollici, smart);
            System.out.println(televisore.getProduct());
        }   
        if (type.equals("cuffie")) {
            System.out.println("Inserisci il colore delle cuffie");
            String colore = scanner.next();
            System.out.println("Le cuffie sono wireless? (true/false)");
            boolean wireless = scanner.nextBoolean();

            Prodotto cuffie = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
            System.out.println(cuffie.getProduct());
        }


        System.out.println("-----------------------------------------");
    }
}
