package data.produk;

import data.object;

public class produk extends object {

    protected String nama;
    protected String produsen;
    protected String kategori;
    protected int harga;
    protected int stok;

    public produk(String nama, String produsen, String kategori, int harga, int stok) {
        super(nama);
        this.produsen = produsen;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public String getProdusen() {
        return this.produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}