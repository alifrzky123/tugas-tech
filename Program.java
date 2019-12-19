public class Program{
    public static void cetak(Object obj){
        System.out.println(obj);
    }
    public static void main (String[] args){
        Persegi itungp = new Persegi();
        cetak("Persegi");
        itungp.setSisi(50);
        itungp.hitungkeliling();
        itungp.hitungluas();
        cetak("----------------------------------------------------");
        PPanjang itungpp = new PPanjang();
        cetak("Persegi Panjang");
        itungpp.setPLT(10, 10);
        itungpp.hitungluas();
        itungpp.hitungkeliling();
        cetak("----------------------------------------------------");
        lingkaran itungl = new lingkaran();
        cetak("Lingkaran");
        itungl.setLing(14);
        itungl.hitungluas();
        itungl.hitungkeliling();
        cetak("----------------------------------------------------");
        SegitigaSamaS SSS = new SegitigaSamaS();
        cetak("Segitiga Sama Sisi");
        SSS.setSSS(10, 20, 30);
        SSS.hitungluas();
        SSS.hitungkeliling();
    }
}

class BangunDatar{
    double luas,keliling;

    void hitungluas(){
        Program.cetak("Luas...");
    }
    void hitungkeliling(){
        Program.cetak("Keliling...");
    }
}

class Persegi extends BangunDatar{
    double sisi;

    void setSisi(double sisi){
        this.sisi = sisi;
    }
    @Override
    void hitungluas(){
        super.hitungluas();
        this.luas = sisi*sisi;
        Program.cetak(luas);
    }
    @Override
    void hitungkeliling(){
        super.hitungkeliling();
        this.keliling = 4*sisi;
        Program.cetak(keliling);
    }
}

class PPanjang extends BangunDatar{
    double p,l;

    void setPLT(double p,double l){
        this.p = p;
        this.l = l;
    }
    void hitungluas(){
        super.hitungluas();
        this.luas = p*l;
        Program.cetak(luas);
    }
    void hitungkeliling(){
        super.hitungkeliling();
        this.keliling = 2*(p+l);
        Program.cetak(keliling);
    }
}

class lingkaran extends BangunDatar{
    double pi,r;

    void setLing(double r){
    this.r = r;
    }
    void hitungkeliling(){
        super.hitungkeliling();
        pi = 3.14;
        this.keliling = 2*(pi*r);
        Program.cetak(keliling);
    }
    void hitungluas(){
        super.hitungluas();
        pi = 3.14;
        this.luas = pi * (r*r);
        Program.cetak(luas);
    }
}

class SegitigaSamaS extends BangunDatar{
    double a,t,s;

    void setSSS(double a, double t, double s){
        this.a = a;
        this.t = t;
        this.s = s;
    }

    void hitungkeliling(){
        super.hitungkeliling();
        this.keliling = s+s+s;
        Program.cetak(keliling);
    }
    void hitungluas(){
        super.hitungluas();
        this.luas = (a*t)/2;
        Program.cetak(luas);
    }
}
