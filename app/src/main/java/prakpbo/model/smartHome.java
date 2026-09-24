package prakpbo.model;

public abstract class smartHome {
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

    public smartHome(String nama, String id, double daya, String status){
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this.status = status;
    }

    public String printSemua(){
        return nama +" (ID: "+ id +")"+" - Daya: "+ daya +"W |" + "Status : "+status+" | ";
    }

}
