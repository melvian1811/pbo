package prakpbo.model;

public class smartTV extends smartHome implements Connectable,Switchable {
    
    ConnectionType type = ConnectionType.WIFI;
    int channel;
    int volume;

    public smartTV(String nama, String id, double daya, String status, int channel, int volume){
        super(nama,id,daya,status);
        this.channel = channel;
        this.volume = volume;
    }
 
    @Override
    public String printSemua() {
        return super.printSemua() +" Channel "+ channel +" | Volume : "+ volume + " | "+"Koneksi "+type;
    }

    @Override
    public void turnOn(){
        setstatus("Menyala");
    }

    @Override
    public void turnOff(){
        setstatus("Tidak Menyala");
    }

    @Override
    public void connected(){
        this.type = type;
    }

    @Override 
    public void disconnect(){
        this.type = type.NONE;
    }

}
