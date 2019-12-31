package app;
import app.data.buku;
import app.data.member;

import java.lang.reflect.Member;
import java.util.HashMap;

public class mainprog{
    public static void cetak(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
    memberr();
    }
    private static void memberr(){
        HashMap<String,member> orang = new HashMap<String,member>();
        orang.put("001", new member("01","Tono"));
        orang.put("002", new member("02","Tini"));

        member member1 = orang.get("001");
        member member2 = orang.get("002");

        for (String key : orang.keySet()){
            String nama = orang.get(key).getName();            
            String id = orang.get(key).getId();  
            cetak(nama);
            cetak(id);
            cetak("");          
        }

    }
    private static void BUKU(){
        HashMap<String,buku> perpus = new HashMap<String,buku>();
        perpus.put("B01",new buku("buku","8597-ASD-7474","Alif","Erlangga Buku",751));
        perpus.put("B02",new buku("bungkus","8597-ASD-7478","AlifR","Erlangga Buku",71));
        perpus.put("B03",new buku("AYO INDONESIA!!","8597-ASD-7470","AlifR","Erlangga Buku",789));

        buku buku1 = perpus.get("B01");
        buku buku2 = perpus.get("B02");

        for (String key : perpus.keySet()){
            String judul = perpus.get(key).getJudul();
            String isbn = perpus.get(key).getISBN();
            String penulis = perpus.get(key).getPenulis();
            cetak(judul);
            cetak(isbn);
            cetak(penulis);
            cetak("");}
        }
}