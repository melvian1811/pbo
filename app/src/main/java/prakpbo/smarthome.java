// package prakpbo;

// import java.util.ArrayList;
// import java.util.Scanner;

// public abstract class smarthome {
//     String id;
//     String nama;
//     double daya;
//     String status;

//     public String getid(){
//         return id;
//     }
    
//     public void setid(String id){
//         this.id = id;
//     }

//     public String getnama(){
//         return nama;
//     }

//     public void setnama(String nama){
//         this.nama = nama;
//     }

//     public double getdaya(){
//         return daya;
//     }

//     public void setdaya(double daya){
//         this.daya = daya;
//     }

//     public String getstatus(){
//         return status;
//     }

//     public void setstatus(String status){
//         this.status = status;
//     }

//     public smarthome(String nama, String id, double daya, String status){
//         this.id = id;
//         this.nama = nama;
//         this.daya = daya;
//         this. status = status;
//     }

//     public String printSemua(){
//         return nama +" (ID: "+ id +")"+" - Daya: "+ daya +"W |" + "Status : "+status+" | ";
//     }

// }

// enum ConnectionType{
//     WIFI,
//     BLUETOOTH,
//     NONE
// }

// interface Connectable{
//     void Connectable(ConnectionType type);
//     void disconnect();
// }

// interface Switchable{
//     void turnOn();
//     void turnOff();
// }

// interface Lockable{
//     void lock();
//     void unlock();
    
// }

// class SmartTV extends smarthome implements Connectable,Switchable{

//     ConnectionType koneksi = ConnectionType.WIFI;
//     int channel;
//     int volume;

//     public SmartTV(String nama, String id, double daya, String status, int channel, int volume){
//         super(nama,id,daya,status);
//         this.channel = channel;
//         this.volume = volume;
//     }

//     @Override 
//     public void turnOn() {
//         System.out.println("Perangkat Dinyalakan");
//     }

//     @Override 
//     public void turnOff(){
//         System.out.println("Perangkat Dimatikan");
//     }


//     @Override 
//     public void Connectable(ConnectionType type){
//         this.koneksi = type;
//     }

//     @Override 
//     public void disconnect(){
//         koneksi = ConnectionType.NONE;
//     }

//     @Override 
//     public String printSemua(){
//         return super.printSemua() + "Koneksi : " +koneksi +"Channel : "+  channel +"Volume :" + volume;
//     }

// }

// class smartSpeaker extends smarthome implements Switchable, Connectable{

//     ConnectionType konek = ConnectionType.BLUETOOTH;
//     int volume;

//     public smartSpeaker(String nama, String id, double daya, String status, int volume){
//         super(nama, id, daya, status);
//         this.volume = volume;
//     }

//     @Override 
//     public void turnOn(){
//         System.out.println("Perangkat dihidupkan");
//     }

//     @Override 
//     public void turnOff(){
//         System.out.println("Perangkat dimatikan");
//     }

//     @Override 
//     public void Connectable(ConnectionType type){
//         this.konek = type;
//     }

//     @Override 
//     public void disconnect(){
//         konek = ConnectionType.NONE;
//     }

//     @Override 
//     public String printSemua(){
//         return super.printSemua() +" Koneksi : "+ konek +" Volume : "+ volume;
//     }
// }

// class Smartlockdoor extends smarthome implements Lockable{

//     String pin = "****";

//     public Smartlockdoor(String nama, String id, double daya, String status){
//         super(nama, id, daya, status);
        
//     }

//     @Override 
//     public void lock(){
//         System.out.println("Terkunci");
//     }

//     @Override 
//     public void unlock(){
//         System.out.println("Tidak terkunci");
//     }

//     @Override
//     public String printSemua(){
//         return super.printSemua() + " Pin : "+pin;
//     }



// }

// class inputUtil{

// private static Scanner scanner = new Scanner(System.in);

//     public static int readIInt(){
//            return scanner.nextInt();
//     }

//     public static String readLine(){
//            return scanner.nextLine();
//     }
        
//         public static void main(String[] args) {
    
//         ArrayList<smarthome> daftarPerangkat = new ArrayList<>();

//         daftarPerangkat.add(new SmartTV("Smart TV [TV Living Room]", "TV-01", 120.0, "Menyala", 5, 20));
//         daftarPerangkat.add(new smartSpeaker("Smart Speaker [Echo Studio]", "SP-02", 30.0, "Menyala", 15));
//         daftarPerangkat.add(new Smartlockdoor("Smart Lock Door [Pintu Utama]", "DL-03", 15.0, "Terkunci"));



//         System.out.println("=====  Perangkat SamrtHome  =====\n");
//         for (smarthome perangkat : daftarPerangkat) {
//             System.out.println(perangkat.printSemua());
//         }

//         System.out.println("\n===== MENYALAKAN PERANGKAT YANG SWITCHABLE =====\n");

//         // INI DARI AI KO (KURANG MENGERTI MAAF) yang bagian instanceof
//         // Memilih hanya perangkat yang bisa di-ON/OFF
//         for (smarthome perangkat : daftarPerangkat) {
//             if (perangkat instanceof Switchable) {
//                 // Type casting ke interface Switchable
//                 Switchable sakelar = (Switchable) perangkat;
//                 System.out.print(perangkat.getnama() + " -> ");
//                 sakelar.turnOn();
//             }
//         }
//         }
// }
