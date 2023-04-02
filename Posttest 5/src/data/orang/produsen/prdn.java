package data.orang.produsen;

import data.data;
import data.barang.produk.*;
import java.util.ArrayList;

public final class prdn extends data<prdn, prd> {

    private ArrayList<produsen> prlist = new ArrayList<produsen>();

    public ArrayList<produsen> getArraylist() {
        return prlist;
    }

    @Override
    public boolean Check() {
        if (prlist.size() == 0) {
            System.out.println("\n List Kosong! \n");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void Create(prd obj) {
       
        String nama = Input("\n>> Masukan Nama produsen :");
        String kontak = Input(">> Masukan kontak produsen :");
        String alamat = Input(">> Masukan alamat produsen :");
        String keterangan = Input(">> Masukan keterangan produsen :");

        prlist.add(new produsen(nama, kontak, alamat, keterangan));
        System.out.println(">> " + prlist.get(prlist.size() - 1).getNama() + " berhasil ditambah!\n");
    }

    @Override
    public void Read() {

        if(Check()) {
            return;
        }

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < prlist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + prlist.get(i).getNama());
            System.out.println("        " + prlist.get(i).getKontak());
            System.out.println("        " + prlist.get(i).getAlamat());
            System.out.println("        " + prlist.get(i).getKeterangan());
        }
    }

    @Override
    public void Update(prd obj) {

        if(Check()) {
            return;
        }

        try {
            int idx = Input("Masukan urutan yang ingin diganti : ", 0);
            prlist.get(idx - 1).setNama(Input(">> Masukan Nama produsen :"));
            prlist.get(idx - 1).setKontak(Input(">> Masukan kontak produsen :"));
            prlist.get(idx - 1).setAlamat(Input(">> Masukan alamat produsen :"));
            prlist.get(idx - 1).setKeterangan(Input(">> Masukan keterangan produsen :"));
    
            System.out.println(">> Telah berhasil diubah!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }

    @Override
    public void Delete(prdn obj) {

        if(Check()) {
            return;
        }

        try {
            int idx = Input("Masukan urutan yang ingin dihapus : ", 0);
            obj.getArraylist().remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }
}
