package prakpbo.model;

public class smartSpeaker extends smartHome implements Connectable, Switchable {
    
    ConnectionType konek = ConnectionType.BLUETOOTH;
    int volume;

    public smartSpeaker(String nama, String id, double daya, String status, int volume){
        super(nama, id, daya, status);
        this.volume = volume;
    }

    @Override 
    public void turnOn(){
        setstatus("Menyala");;
    }

    @Override 
    public void turnOff(){
        setstatus("Tidak Menyala");
    }

    @Override 
    public void connected(){
        this.konek = konek.WIFI;
    }

    @Override 
    public void disconnect(){
        this.konek = konek.NONE;
    }

    @Override 
    public String printSemua(){
        return super.printSemua() +" Koneksi : "+ konek +"|  Volume : "+ volume;
    }

}
