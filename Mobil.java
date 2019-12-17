public class Mobil{
    public static void main(String[] args){
        car mobilVOLVO = new car();
        boolean mobilnyala = true;
        mobilVOLVO.jmlPintu = 10;
        mobilVOLVO.jmlRoda = 12;
        mobilVOLVO.merk = "VOLVO";
        mobilVOLVO.plat = "B 157 D";
        mobilVOLVO.warna = "ITEM";
        System.out.println(mobilVOLVO.jmlPintu);
       mobilVOLVO.mobilnyala();
    }
}

class car{
    String merk;
    String warna;
    String plat;
    int jmlRoda;
    int jmlPintu;
    boolean isEngineOn = false;
    void mobilnyala(){
        if(this.isEngineOn){
            System.out.println("Mobil Menyala");
        }else{
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }
    void mobilmaju(){
        if(this.isEngineOn){
            System.out.println("Mobil maju");
        }
    }
    void mobilmundur(){
        System.out.println("Mobil munder");
    }
}