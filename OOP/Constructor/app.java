public class app{
    public static void main(String[] args){
        box box1 = new box(10, 50, 30);
        box box2 = new box();
        box box3 = new box("Santoso", 50, 7, 5);
    }
}

class box{
    double length;
    double height;
    double width;
    String nama;
    public box(double a, double b, double c){
        this.height = a;
        this.length = b;
        this.width = c;
    }
    public box (){
        System.out.println("ini kosong");
    }
    public box (String nama, double a, double b, double c){
        this.nama = nama;
        this.height = a;
        this.length = b;
        this.width = c;
        System.out.println("Nama saya adalah "+nama+" Umur saya : "+a+ " Anak saya ada : "+b+ " Istri saya berjumlah : "+c);
    }
}