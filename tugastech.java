import java.util.Scanner;

public class tugastech{
    public static void cetak(Object obj){
        System.out.println(obj);
    }

    public static double LSegitiga(double a,double t){
        double hasil = (a*t)/2;
        return hasil;
    }
    public static double VBalok(double p, double l, double t){
        double hasil = p*l*t;
        return hasil;
    }
    public static double VPrismaSegitiga(double p, double l, double t){
        double hasil = (p*l*t)/2;
        return hasil;
    }
    public static double VKerucut(double r, double t){
        double pi = 3.1415926;
        double hasil = (pi*r*r*t)/3;
        return hasil;
    }

    public static void main(String[] args){
        boolean belajar = true;
        while(belajar==true){
            menu();
        }

    }
    public static void menu(){
        Scanner input = new Scanner (System.in);
        cetak ("=============================");
        cetak ("SELAMAT DATANG DI PROGRAM MTK");
        cetak ("1. Luas Segitiga");
        cetak ("2. Volume Balok");
        cetak ("3. Volume Prisma Segitiga");
        cetak ("4. Volume Kerucut");
        cetak ("5. Keluar");
        cetak ("Silahkan pilih yang kamu mau : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
            cetak(LSegitiga(10,50));
            break;
            case 2:
            cetak(VBalok(10,20,30));
            break;
            case 3:
            cetak(VPrismaSegitiga(40,50,60));
            break;
            case 4:
            cetak(VKerucut(50,70));
            break;
            default:
            System.exit(0);
        }
    }
}