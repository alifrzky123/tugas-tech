public class coba{
    public static void main(String[]args){
        int angka = Integer.parseInt(args[0]);
        int mod = angka % 2;
        System.out.println( mod == 1 ? "GANJIL":"GENAP");
    }
}