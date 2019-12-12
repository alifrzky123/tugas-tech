public class nestif{
    public static void main(String[] args){
        /* boolean hujan = false;
        boolean payung = true;

        if(hujan == true){
            // hari ini hujan
            if (payung == true){
                System.out.println("Keluar pakai payung");
            }
            else{
                //hari hujan dan tidak ada payung
                System.out.println("Karena tidak ada payung, GABOLE KELUAR!");
            }
        }
        else{
            // hari tidak hujan
            if(payung == true){
                //hari tidak hujan dan ada payung
                System.out.println("Keluar rumah aja, bawa payung silahkan");
            }
            else{
                //hari tidak hujan dan tidak ada payung
                System.out.println("Boleh keluar rumah meski tidak hujan dan tidak ada payung. Santuy aje");
            }
        } */
       /*  String username = "abc@abc.com";
        String pass = "args[1]";

        if (username == "abc@abc.com"){
            if (pass == "abc"){
                System.out.println("Berhasil login");
            }else{
                System.out.println("Password Salah");
            }
        }else{
            System.out.println("Akun tidak ditemukan");
        } */
        int bulan = Integer.parseInt(args[0]);

        switch(bulan){
            case 1:
                System.out.println("januari");
                break;
            case 2:
                System.out.println("februari");
                break;
            case 3:
                System.out.println("maret");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("mei");
                break;
            case 6:
                System.out.println("juni");
                break;
            case 7:
                System.out.println("juli");
                break;
            case 8:
                System.out.println("agustus");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("desember");
                break;
            default:
                System.out.println("Bulan mane? kaga ade buset");
        }
    
    }
}