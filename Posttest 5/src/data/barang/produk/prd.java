package data.barang.produk;

import data.data;
import data.orang.produsen.*;
import java.util.ArrayList;

public final class prd extends data<prd, prdn> {

    ArrayList<produk> plist = new ArrayList<produk>();

    public ArrayList<produk> getArraylist() {
        return plist;
    }

    private String getPrdn(prdn obj) {

        int size = obj.getArraylist().size();

        System.out.print("\n>> Pilih Produsen Produk (0 Untuk batal) :\n");
        for (int i = 0; i < size; i++) {
            System.out.println("     " + (i + 1) + ". " + (obj.getArraylist().get(i)).getNama());
        }
        System.out.println("     " + (size + 1) + ". - (Kosongkan)");

        int input = Input(0);

        while (true) {
            try {
                if (input == 0) {
                    return "/0";
                } else if (input == (size + 1)) {
                    return " ";
                } else {
                    return (obj.getArraylist().get(input - 1)).getNama();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Input tidak ada di pilihan!");
            }
        }
    }

    @Override
    public boolean Check() {
        if (plist.size() == 0) {
            System.out.println("\n List Kosong! \n");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void Create(prdn obj) {

        String nama = Input(">> Masukan Nama Produk :");
        String produsen = getPrdn(obj);
        if (produsen == "/0") {
            return;
        }
        String kategori = Input(">> Masukan Kategori Produk :");
        int harga = Input(">> Masukan Harga Produk :", 0);
        int stok = Input(">> Masukan Stok Produk :", 0);

        plist.add(new produk(nama, produsen, kategori, harga, stok));
        System.out.println(">> " + plist.get(plist.size() - 1).getNama() + " berhasil ditambah!\n");
    }

    @Override
    public void Read() {

        if(Check()) {
            return;
        }

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < plist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + (plist.get(i)).getNama());
            System.out.println("        " + (plist.get(i)).getProdusen());
            System.out.println("        " + (plist.get(i)).getKategori());
            System.out.println("        " + (plist.get(i)).getHarga());
            System.out.println("        " + (plist.get(i)).getStok());
        }
    }

    public void Update(prdn obj) {

        if(Check()) {
            return;
        }

        try {

            int idx = Input("Masukan urutan yang ingin diganti : ", 0);
            plist.get(idx - 1).setNama(Input(">> Masukan Nama Produk :"));
            String produsen = getPrdn(obj);
            if (produsen == "/0") {
                return;
            }
            plist.get(idx - 1).setProdusen(produsen);
            plist.get(idx - 1).setKategori(Input("\n>> Masukan Kategori Produk :"));
            plist.get(idx - 1).setHarga(Input(">> Masukan Harga Produk :", 0));
            plist.get(idx - 1).setStok(Input(">> Masukan Stok Produk :", 0));

            System.out.println(">> Telah berhasil diubah!\n");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Urutan yang dipilih tidak ada!!");
        }
    }

    public void Delete(prd obj) {

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
