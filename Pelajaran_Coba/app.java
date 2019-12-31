public class app{
    public static void main (String[] args){
        Rumah jakarta = new Rumah();
        jakarta.jenis = "31";
        jakarta.warna();
        jakarta.pintu();
        jakarta.diberinama("Rumah Jelek");
        jakarta.getNama();
        Lantai rumah = new Lantai();
        rumah.tingkat();
    }
}

class Rumah{
    String jenis;

    void warna(){
        System.out.println("Putih");
    }
    void pintu(){
        System.out.println("5");
    }
    void diberinama(String nama){//Setter
        this.jenis = nama;
    }
    String getNama(){
        return this.jenis;
    }
    void fixRumah(){
        System.out.println(this.jenis);
    }
}

class Lantai extends Rumah{
    void tingkat(){
        System.out.println("7 Lantai");
    }

    @Override

    void warna(){
        super.warna();
        this.fixRumah();
    }
}