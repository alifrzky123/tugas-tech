package app.data;

public class buku{
    private String judul;
    private String ISBN;
    private String penulis;
    private String penerbit;
    private int JmlHalaman;

    

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getJmlHalaman() {
        return JmlHalaman;
    }

    public void setJmlHalaman(int jmlHalaman) {
        JmlHalaman = jmlHalaman;
    }

    public buku(String judul, String iSBN, String penulis, String penerbit, int jmlHalaman) {
        this.judul = judul;
        this.ISBN = iSBN;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.JmlHalaman = jmlHalaman;
    }
}