package prakpbo.controllers;

import java.util.ArrayList;
import prakpbo.model.smartHome;

public class SmartHomeController{
    private ArrayList<smartHome> daftarPerangkat;

    public SmartHomeController() {
        daftarPerangkat = new ArrayList<>();
    }

    public void tambahPerangkat(smartHome perangkatBaru) {
        daftarPerangkat.add(perangkatBaru);
    }

    public String getDetailSemuaPerangkat() {
        String hasil = "";
        for (smartHome perangkat : daftarPerangkat) {
            hasil += perangkat.printSemua() + "\n";
        }

        return hasil;
    }
}
