import java.util.*;

public  class progbus{
    public static void cetakln(Object obj){
        System.out.println(obj);
    }
    public static void cetak(Object obj){
        System.out.print(obj);
    }
    int AC;
    int NA;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int nonAC;
        int AC;
        int total = 0;

        for (int i=0; i<2; i++){
        cetak("Nama       : ");
        String nama = input2.nextLine();
        cetak("Kamu pesan berapa kursi : ");
        int kursi = input.nextInt();
        cetakln("1. Jkt-Bdg");
        cetakln("2. Bdg-Jkt");
        cetakln("3. Jkt-Tskmly");
        cetakln("Pilih rute   : ");
        String rute = input2.nextLine();
   
         switch(rute){
            case "1":
                cetakln("Kamu memilih rute Jakarta-Bandung");
                cetak("Pilih kelas [AC=1/Non=2] ");
                int kelas = input.nextInt();
                if(kelas == 1){
                    AC = 130000;
                    kelas = AC;
                    cetakln("AC Seharga : Rp."+AC);
                }else if(kelas == 2){
                    nonAC = 90000;
                    kelas = nonAC;
                    cetakln("AC Seharga : Rp."+nonAC);
                }
                total = kelas*kursi;
                break;
            case "2":
                cetakln("Kamu memilih rute Bandung-Jakarta");
                cetak("Pilih kelas [AC=1/Non=2] ");
                int kelass = input.nextInt();
                if(kelass == 1){
                    AC = 150000;
                    kelass = AC;
                    cetakln("AC Seharga : Rp."+AC);
                }else if(kelass == 2){
                    nonAC = 90000;
                    kelass = nonAC;
                    cetakln("AC Seharga : Rp."+nonAC);
                }
                total = kelass*kursi;
                break;   
            case "3":
                cetakln("Kamu memilih rute Jakarta-Tasikmalaya");
                cetak("Pilih kelas [AC=1/Non=2] ");
                int kelaas = input.nextInt();
                if(kelaas == 1){
                    AC = 70000;
                    kelaas = AC;
                    cetakln("AC Seharga : Rp."+AC);
                }else if(kelaas == 2){
                    nonAC = 50000;
                    kelaas = nonAC;
                    cetakln("AC Seharga : Rp."+nonAC);
                }
                total = kelaas*kursi;
                break;
            default:
            total = 0;
        }
        
        cetakln("Nama               :      "+nama);
        cetakln("Rute               :      "+rute);
        cetakln("Kursi              :      "+kursi);
        cetakln("Total Pembayaran   :   Rp."+total);
        cetakln("================================");
        }
        
    }
}