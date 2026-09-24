package prakpbo.model;

public class smartLockDoor extends smartHome implements Lockable {

    private String pin;

    public smartLockDoor(String nama, String id, double daya, String status){
        super(nama, id, daya, status);
        
    }

    @Override 
    public void locked(){
        setstatus("Terkunci");;
    }

    @Override 
    public void unlock(){
        setstatus("Tidak Terkunci");;
    }

    @Override
    public String printSemua(){
        return super.printSemua() + " |  Pin : "+pin;
    }

    
    public String getPin() {
        String hasil = "";

        for(int i = 0; i < pin.length(); i++) {
            hasil += "*";
        }

        return hasil;
    }
}
