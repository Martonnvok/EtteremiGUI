package modell;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Asztal extends javax.swing.JFrame {

    private String asztal;
    private List<Etel> rendeltEtelek;

    public Asztal(String asztal) {
        this.asztal = asztal;
        rendeltEtelek = new ArrayList<>();
    }

    public void ujEtel(Etel etel) {
        rendeltEtelek.add(etel);
    }

    public List<Etel> getRendeltEtelek() {
        return rendeltEtelek;
    }

    public String getAsztal() {
        return asztal;
    }

    public void kiirRendeltEtelekGUI(javax.swing.JList<String> jList) {
        int ossz = 0;
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Rendelt ételek:");
        listModel.addElement("=============================================");
        for (Etel etel : rendeltEtelek) {
            String item = String.format("%-37s %-4d Ft", etel.getNev(), etel.getAr());
            listModel.addElement(item);
            ossz += etel.getAr();
        }
        listModel.addElement("_____________________________________________");
        listModel.addElement(" ");
        listModel.addElement("Összesen: " + ossz + " Ft");
        jList.setModel(listModel);
    }

    public void kiirRendeltEtelekConsole() {
        int ossz = 0;
        System.out.println(asztal + ": ");
        System.out.println("=============================================");
        System.out.println("---------------------------------------------");
        for (Etel etel : rendeltEtelek) {
            System.out.printf("%-37s %-4d Ft%n", etel.getNev(), etel.getAr());
            ossz += etel.getAr();
        }
        System.out.println("_____________________________________________");
        System.out.println(" ");
        System.out.println("Összesen: " + ossz + " Ft");
        System.out.println("");

    }

}
