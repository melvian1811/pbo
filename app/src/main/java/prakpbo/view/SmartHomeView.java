package prakpbo.view;


import prakpbo.controllers.SmartHomeController;
import prakpbo.util.InputUtil;
import prakpbo.model.smartTV;
import prakpbo.model.smartSpeaker;
import prakpbo.model.smartLockDoor;

public class SmartHomeView{
    private static InputUtil input;
    private static SmartHomeController home = new SmartHomeController();

    public static void render(){

        int menu;

        do{

            System.out.print("Pilih Menu : \n1. Tambah Perangkat \n2. Print Semua Perangkat\n0. Exit\nPilih :  ");
            menu = input.readInt();

            switch (menu) {
                case 1:
                    tambahPerangkat();
                    break;
                case 2:
                    System.out.println(home.getDetailSemuaPerangkat());
                    break;
            }
        } while (menu != 0);
    }

    public static void tambahPerangkat(){

        int menu;
        do{
            System.out.println("Tambah Perangkat yang mana ?\n1.Smart TV \n2.Smart Speaker \n3.Smart Lock Door\n0.Exit");
            menu = input.readInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Nama Tv : ");
                    String namatv = input.readLine();

                    System.out.println("Masukkan ID Tv : ");
                    String idtv = input.readLine();

                    System.out.println("Masukkan Daya TV : ");
                    double daya = input.readDouble();

                    System.out.println("Masukkan Status (Menyala atau Tidak Menyala) :");
                    String stats = input.readLine();

                    System.out.println("Masukkan Channel TV ke berapa : ");
                    int chan = input.readInt();

                    System.out.println("Masukkan volume TV : ");
                    int vol = input.readInt();

                    smartTV newTV = new smartTV(namatv, idtv, daya, stats, chan, vol);
                    home.tambahPerangkat(newTV);
                    break;
            
                case 2:
                    System.out.println("Masukkan Nama Speaker : ");
                    String namaspeak = input.readLine();

                    System.out.println("Masukkan ID Speaker : ");
                    String idspeak = input.readLine();

                    System.out.println("Masukkan Daya Speaker : ");
                    double dayaspeak = input.readDouble();

                    System.out.println("Masukkan Status (Menyala atau Tidak Menyala) :");
                    String statspeak = input.readLine();

                    System.out.println("Masukkan volume Speaker : ");
                    int volspeak = input.readInt();
                    
                    smartSpeaker speaker = new smartSpeaker(namaspeak, idspeak, dayaspeak, statspeak, volspeak);
                    home.tambahPerangkat(speaker);
                    break;
                    
                case 3:
                    System.out.println("Masukkan Nama Pintu : ");
                    String namapintu = input.readLine();

                    System.out.println("Masukkan ID Pintu : ");
                    String idpintu = input.readLine();

                    System.out.println("Masukkan Daya Pintu : ");
                    double dayapintu = input.readDouble();

                    System.out.println("Masukkan Status (Terkunci atau Tidak Terkunci) :");
                    String statspintu = input.readLine();

                    smartLockDoor pintu = new smartLockDoor(namapintu, idpintu, dayapintu, statspintu);
                    home.tambahPerangkat(pintu);
                break;
            }
        }while(menu != 0);
    }
        

}