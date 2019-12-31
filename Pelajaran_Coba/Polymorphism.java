public class Polymorphism{
    public static void main(String[] args){
        Alamat add = new Alamat();
        add.age();
        add.almt();
        add.name();
        add.judul();
    }
}

class Identitas{
    public void judul(){
        System.out.println("Ini identitas");
    }
    
}
class Nama extends Identitas{
    
    public void name(){
        System.out.println("Tono");
    }
}
class umur extends Nama{
    public void age(){
        System.out.println("50");
    }
}
class Alamat extends umur{
    public void almt(){
        System.out.println("jakarta");
    }
}