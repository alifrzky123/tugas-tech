import java.util.*;

public class mainprog{
    public static void cetakln(Object obj){
        System.out.println(obj);
    }
    public static void cetak(Object obj){
        System.out.print(obj);
    }
    public static void main(String[] args){
        int lamaParkir;
        int total = 0;
        for (int i = 0; i<2 ; i++){
            Scanner input = new Scanner(System.in);
            cetak("Masukkan Plat Nomor : ");
            String plat = input.nextLine();
            cetak("Jenis Kendaraan kamu [Motor = 1 / Mobil = 2] -- : ");
            String jenisKend = input.nextLine();
            cetak("Jam Kamu Masuk *24 = ");
            int jamIn = input.nextInt();
            cetak("Jam Kamu Keluar *24 = ");
            int jamOut = input.nextInt();

            cetakln("--Data--");
            cetakln("Plat nomor kamu : "+plat);
            cetakln("Jenis Kendaraan kamu : "+jenisKend);
            cetakln("Jam kamu masuk : "+jamIn);
            cetakln("Jam kamu keluar : "+jamOut);
            if(jamIn > jamOut){
                lamaParkir = (jamOut+24) - jamIn;
            }else{
                lamaParkir = jamOut - jamIn;
            }

            switch(jenisKend){
                case "1":
                    if(lamaParkir == 1){
                        total = 3000;
                    }else{
                        total = 3000+(lamaParkir*1500)-1500;
                    }
                    break;
                case "2":
                    if(lamaParkir == 1){
                        total = 5000;
                    }else{
                        total = 5000+(lamaParkir*3000)-3000;
                    }
                    break;
                default:
                    total = 0;
                    break;
            }
            cetakln("--Struk--");
            cetakln("Plat nomor kamu : "+plat);
            cetakln("Jenis Kendaraan kamu : "+jenisKend);
            cetakln("Jam kamu masuk : "+jamIn);
            cetakln("Jam kamu keluar : "+jamOut);
            cetakln("Lama kamu parkir : "+lamaParkir+" jam");
            cetakln("Tarif yang harus kamu bayar : "+total);
            cetakln("=============================================================================");
        }
    }
        
        
}