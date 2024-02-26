package modell;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Etterem {

    private ArrayList<Asztal> asztalok;
    private ArrayList<Asztal> etlap;

    public Etterem() {
        asztalok = new ArrayList<>();
        etlap = new ArrayList<>();
    }

    public void addAsztal(Asztal asztal) {
        asztalok.add(asztal);
    }

    public void addToEtlap(Asztal etel) {
        etlap.add(etel);
    }

    public void kiirRendelesekFajlba(String fajlnev) {
        try (PrintWriter kiir = new PrintWriter(new FileWriter(fajlnev))) {
            for (Asztal asztal : asztalok) {
                kiir.println(asztal.getAsztal() + ": ");
                kiir.println("=============================================");
                kiir.println("---------------------------------------------");
                for (Etel etel : asztal.getRendeltEtelek()) {
                    kiir.println( etel.getNev());
                }
                kiir.println("_____________________________________________");
                kiir.println();
                kiir.println();
            }
            System.out.println("A rendelések ki lettek írva a(z) " + fajlnev + " fájlba.");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írása közben.");
            e.printStackTrace();
        }
    }
}
