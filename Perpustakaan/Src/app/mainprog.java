package app;
import java.util.Scanner;
import app.data.buku;
import app.data.member;
import app.transaction.transaksi;
import java.lang.reflect.Member;
import java.util.HashMap;

public class mainprog{

    private static HashMap<String,member> orang = new HashMap<String,member>();
    private static HashMap<String,transaksi> daftarTransaksi = new HashMap<String,transaksi>();

    public static void cetak(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
    memberr();
    cetak("==========================");
    BUKU();
    cetak("==========================");
    }
    private static void memberr(){
        orang.put("001", new member("01","Tono"));
        orang.put("002", new member("02","Tini"));

        member member1 = orang.get("001");
        member member2 = orang.get("002");

        for (String key : orang.keySet()){
            String nama = orang.get(key).getName();            
            String id = orang.get(key).getId();          
        }

    }
    private static void BUKU(){
        HashMap<String,buku> perpus = new HashMap<String,buku>();
        perpus.put("B01",new buku("buku","B01","Alif","Erlangga Buku",751,1925,10));
        perpus.put("B02",new buku("bungkus","B02","AlifR","Erlangga Buku",71,2005,10));
        perpus.put("B03",new buku("AYO INDONESIA!!","B03","AlifR","Erlangga Buku",789,1900,35));

        buku buku1 = perpus.get("B01");
        buku buku2 = perpus.get("B02");

        for (String key : perpus.keySet()){
            String judul = perpus.get(key).getJudul();
            String isbn = perpus.get(key).getISBN();
            String penulis = perpus.get(key).getPenulis();
            int tahunt = perpus.get(key).getTahunTerbit();
            int stok = perpus.get(key).getStok();
            cetak(judul);
            cetak(isbn);
            cetak(penulis);
            cetak(tahunt);
            cetak(stok);
            cetak("");
        }
    Scanner input = new Scanner(System.in);

    member member = orang.get("001");
    transaksi transaction = new transaksi(member);
    transaction.setKodeTransaksi();
    cetak(transaction.getKodeTransaksi());

    boolean meminjam = true;
    while(meminjam){
            cetak("Masukkan ISBN buku yang ingin dipinjam : ");
            String isbn = input.nextLine();
            // cek buku avail atau tidak
            if(perpus.containsKey(isbn)){
                cetak("Buku Ada");
                buku dipinjams = perpus.get(isbn);
                dipinjams.dipinjam();
                transaction.tambahtransaksi(isbn, dipinjams);
                cetak("Buku - "+transaction.getBook(isbn).getJudul()+ "- Berhasil ditambahkan ke transaksi");
                cetak ("=======================");
            }else{
                cetak("Buku kosong");
            }cetak("Masih ingin meminjam buku ? [Y/N] ");
        String jawab = input.nextLine();
        if(jawab.equalsIgnoreCase("N")){
            meminjam = false;
        }
        }
        
    
    if (transaction.getBooks().size() > 0){
        for(String i : transaction.getBooks().keySet()){
            String judul = perpus.get(i).getJudul();
            String isbn = perpus.get(i).getISBN();
            String penulis = perpus.get(i).getPenulis();
            int tahunt = perpus.get(i).getTahunTerbit();
            cetak(judul);
            cetak(isbn);
            cetak(penulis);
            cetak(tahunt);
            cetak("==================================");
        }
        cetak("Apakah data diatas sudah benar? [Y/N] ");
        String jawab = input.nextLine();
        if (jawab.equalsIgnoreCase("Y")){
            //Memasukkan data transaksi ke dalam hashmap
            daftarTransaksi.put(transaction.getKodeTransaksi(), transaction);
            cetak("Sukses");
        }
        else{
            cetak("Peminjaman di batalkan");
        }
    }else{
        cetak("PINJEM WOI");
    }
    }
}
