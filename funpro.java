public class funpro{

    public static void cetak(Object obj){
        System.out.println(obj);
    }
   
    public static void main(String[] args){
        cetak(mtk.hitungkurang(70, 50));
        mtk.hitungtambah(80, 90);
    }
}
class mtk{
    public static void hitungtambah(float a, float b){
        float hasil = a+b;
        cetak(hasil);
    }
    public static double hitungkurang(double a, double b){
        double hasil = a-b;
        return hasil;
    }

}