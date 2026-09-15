package main.java.prakpbo;


public abstract class smarthome {
    String id;
    String nama;
    double daya;
    String status;

    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id = id;
    }

    public String getnama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public double getdaya(){
        return daya;
    }

    public void setdaya(double daya){
        this.daya = daya;
    }

    public String getstatus(){
        return status;
    }

    public void setstatus(String status){
        this.status = status;
    }

    public smarthome(String nama, String id, double daya, String status){
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this. status = status;
    }

    public String printSemua(){
        return nama +" " + id +" " +"Daya : "+ daya +" W" + "Status : "+status;
    }

}

enum ConnectionType{
    WIFI,
    BLUETOOTH,
    NONE
}

interface Connectable{
    void Connectable(ConnectionType type);
    void disconnect();
}

interface Switchable{
    void turnOn();
    String turnOff();
}

interface Lockable{
    void lock();
    void unlock();
    
}

class SmartTV extends smarthome implements Connectable,Switchable{

    ConnectionType koneksi = ConnectionType.WIFI;
    int channel;
    int volume;

    public SmartTV(String nama, String id, double daya, String status, int channel, int volume){
        super(nama,id,daya,status);
        this.channel = channel;
        this.volume = volume;
    }

    @Override 
    public void Switchable(){
        turnOn();
    }


    @Override 
    public void Connectable(ConnectionType type){
        this.koneksi = type;

        switch (type) {
            case WIFI:
                break;
            default:
                break;
        }
    }

    @Override 
    public void Connectable(){
        disconnect();
    }

    @Override 
    public String printSemua(){
        return super.printSemua() + "Koneksi : " +koneksi +"Channel : "+  channel +"Volume :" + volume;
    }

}

class smartSpeaker extends smarthome implements Switchable, Connectable{

    ConnectionType konek = ConnectionType.BLUETOOTH;
    int volume;

    public smartSpeaker(String nama, String id, double daya, String status, int volume){
        super(nama, id, daya, status);
        this.volume = volume;
    }

    @Override 
    public void Switchable(){
        turnOn();
    }

    @Override 
    public void Connectable(ConnectionType type){
        this.konek = type;

        switch (type) {
            case BLUETOOTH: 
                break;
            default:
                break;
        }
    }

    @Override 
    public String printSemua(){
        return super.printSemua() +"Koneksi : "+ konek +"Volume : "+ volume;
    }
}

class Smartlockdoor extends smarthome implements Switchable{

    String pin = "****";

    public Smartlockdoor(String nama, String id, double daya, String status){
        super(nama, id, daya, status);
        
    }

    @Override
    public String printSemua(){
        return super.printSemua() + "Pin : ";
    }

    @Override 
    public void Switchable(String statBaru){
        this.status = statBaru;
    }

    @Override 
    public String getStatusAwal(){
        return status;
    }


}

class MainTesr{
    public static void main(String[] args) {


        SmartTV k = new SmartTV("Melvian", "12", 233, "Mati", 5, 32);
        System.out.println(k.printSemua());


    }
}