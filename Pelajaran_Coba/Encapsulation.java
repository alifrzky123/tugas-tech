import java.util.jar.Attributes.Name;

public class Encapsulation{
    public static void main(String[] args){
        Identitas diri = new Identitas();
        diri.setNama("Tono");
        diri.setAlamat("Bintaro");
        diri.setUmur("50");
        diri.getNama();
        diri.getAlamat();
        diri.getUmur();
    }
}

class Identitas{
    private String nama;
    private String alamat;
    private String umur;

    public void setNama (String name){
        this.nama = name;
    }
    public void setAlamat (String tinggal){
        this.alamat = tinggal;
    }
    public void setUmur (String Umur){
        this.umur = Umur;
    }
    public void getNama (){
        System.out.println(nama);
    }
    public void getAlamat(){
        System.out.println(alamat);
    }
    public void getUmur(){
        System.out.println(umur);
    }
}