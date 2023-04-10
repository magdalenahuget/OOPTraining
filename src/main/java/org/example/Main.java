package org.example;

import org.example.garnek.Garnek;
import org.example.garnek.Uzytkownik;

public class Main {

    public static void main(String[] args) {


//        System.out.println(garnek.srednica);
//        System.out.println(garnek.wysokosc);
//        System.out.println(garnek.kolor);

        Garnek garnek = new Garnek(7, 5, "Srebrny");
        garnek.kolor = "Zielony";

        System.out.println(garnek.srednica);
        System.out.println(garnek.wysokosc);
        System.out.println(garnek.kolor);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temperatura = garnek.zwrocTemperatureWrzeniaWody();
        System.out.println(temperatura);

        garnek.gotujBezInformacji();


        Uzytkownik majk = new Uzytkownik(20, "Majk");
        if (majk.czyMozeLegalnieKupicAlkohol()) {
            System.out.println("Moze kupic");
        } else {
            System.out.println("Nie moze kupic");
        }


        // Computer

        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setLowResolution();
        System.out.println(monitor.getResolution());
    }
}
