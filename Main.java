package main;

import modell.Asztal;
import modell.Etel;
import modell.Etterem;

public class Main {

    public static void main(String[] args) {
        megjelenit();
    }

    public static void megjelenit() {
        Asztal a1 = new Asztal("Piros asztal");
        a1.ujEtel(new Etel("Pörkölt", 1500));
        a1.ujEtel(new Etel("Palacsinta", 500));
        a1.kiirRendeltEtelekConsole();

        Asztal a2 = new Asztal("Zöld asztal");
        a2.ujEtel(new Etel("Yoghurt", 1530));
        a2.ujEtel(new Etel("Palacsinta", 1500));
        a2.ujEtel(new Etel("Gyros", 1200));
        a2.kiirRendeltEtelekConsole();

        Asztal a3 = new Asztal("Kék asztal");
        a3.ujEtel(new Etel("Pörkölt", 2300));
        a3.kiirRendeltEtelekConsole();
        
        Asztal a4 = new Asztal("Fehér asztal");
        a4.ujEtel(new Etel("Marhasült", 4000));
        a4.ujEtel(new Etel("Kóla", 300));
        a4.ujEtel(new Etel("Cékla leves", 500));
        a4.ujEtel(new Etel("Húsgombóc leves", 1500));
        a4.kiirRendeltEtelekConsole();
        
        Etterem e1 = new Etterem();
        e1.addAsztal(a1);
        e1.addAsztal(a2);
        e1.addAsztal(a3);
        e1.addAsztal(a4);
        
        e1.kiirRendelesekFajlba("Blokk.txt");
    }
}
