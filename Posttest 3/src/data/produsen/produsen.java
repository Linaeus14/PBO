package data.produsen;

import data.object;

public class produsen extends object {

    private String alamat;
    private String keterangan;

    public produsen(String nama, String alamat, String keterangan) {
        super(nama);
        this.alamat = alamat;
        this.keterangan = keterangan;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
