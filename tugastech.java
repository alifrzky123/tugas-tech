import java.util.Scanner;

public class tugastech{
    public static void cetak(Object obj){
        System.out.println(obj);
    }
    public static void baris(Object obj){
        System.out.print(obj);
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
        try{
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
                baris ("alas = ");double a = input.nextDouble();
                baris ("tinggi = ");double t = input.nextDouble();
                cetak(LSegitiga(a,t));
                int jawab = input.nextInt();
                if ((jawab <=1) || (jawab >=3)){
                    cetak ("anda keluar menu");
                    System.exit(0);
                }
                break;
                case 2:
                baris ("panjang = "); double p = input.nextDouble();
                baris ("lebar = "); double l = input.nextDouble();
                baris ("tinggi = "); double t1 = input.nextDouble();
                cetak(VBalok(p,l,t1));
                int jawab1 = input.nextInt();
                if ((jawab1 <=1) || (jawab1 >=3)){
                    cetak ("anda keluar menu");
                    System.exit(0);
                }
                break;
                case 3:
                baris ("panjang = "); double p1 = input.nextDouble();
                baris ("lebar = "); double l1 = input.nextDouble();
                baris ("tinggi = "); double t2 = input.nextDouble();
                cetak(VPrismaSegitiga(p1,l1,t2));
                int jawab2 = input.nextInt();
                if ((jawab2 <=1) || (jawab2 >=3)){
                    cetak ("anda keluar menu");
                    System.exit(0);
                }
                break;
                case 4:
                baris ("jari-jari = "); double r = input.nextDouble();
                baris ("tinggi = ");  double t3 = input.nextDouble();
                cetak(VKerucut(r,t3));
                int jawab3 = input.nextInt();
                if ((jawab3 <=1) || (jawab3 >=3)){
                    cetak ("anda keluar menu");
                    System.exit(0);
                }
                break;
                default:
                System.exit(0);
            }
        }
        catch (Exception e){
            cetak("Data haruslah integer");
        }
    }
}