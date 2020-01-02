package app.transaction;

import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;
import app.data.buku;
import app.data.member;

public class transaksi{
    private String kodeTransaksi;
    private HashMap<String,buku> borrowedBooks = new HashMap<String,buku>();
    private member member;
    private Date dateTime;

    public transaksi(member member){
        this.member = member;
        Date today = new Date();
        this.dateTime = today;
    }
	public String getKodeTransaksi() {
		return kodeTransaksi;
	}

	public void setKodeTransaksi() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date = formatter.format(this.dateTime);
        this.kodeTransaksi = this.member.getIDMember()+"-"+date;
	}

    public HashMap<String, buku> getBooks() {
        return borrowedBooks;
    }

    public void setBuku(HashMap<String, buku> buku) {
        this.borrowedBooks = buku;
    }
    
    public void tambahtransaksi(String isbn, buku buku){
        this.borrowedBooks.put(isbn,buku);
    }
}