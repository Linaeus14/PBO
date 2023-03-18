package data.produsen;

import data.data;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prdn extends data {

    ArrayList<produsen> prlist = new ArrayList<produsen>();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    public ArrayList<produsen> getArraylist() {
        return prlist;
    }

    public void Create() throws IOException {

        System.out.print("\n>> Masukan Nama produsen :");
        String nama = inp.readLine();

        System.out.print(">> Masukan alamat produsen :");
        String alamat = inp.readLine();

        System.out.print(">> Masukan keterangan produsen :");
        String keterangan = inp.readLine();

        prlist.add(new produsen(nama, alamat, keterangan));
        System.out.println(">> " + prlist.get(prlist.size() - 1).getNama() + " berhasil ditambah!\n");
    }

    public void Read() {

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < prlist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + (prlist.get(i)).getNama());
            System.out.println("        " + (prlist.get(i)).getAlamat());
            System.out.println("        " + (prlist.get(i)).getKeterangan());
        }
    }

    public void Update() throws IOException {

        int idx;
        System.out.print("Masukan index yang diganti : ");
        idx = Integer.parseInt(inp.readLine());

        System.out.print("\n>> Masukan Nama produsen :");
        (prlist.get(idx - 1)).setNama(inp.readLine());

        System.out.print(">> Masukan alamat produsen :");
        (prlist.get(idx - 1)).setAlamat(inp.readLine());

        System.out.print(">> Masukan keterangan produsen :");
        (prlist.get(idx - 1)).setKeterangan(inp.readLine());

        System.out.println(">> Telah berhasil diubah!\n");
    }

    public void Delete(prdn obj) {

        System.out.print("Masukan urutan yang ingin dihapus : ");
        try {
            int idx = Integer.parseInt(inp.readLine());
            if (idx < 1 & idx > obj.getArraylist().size()) {
                System.out.println("Tidak ada nomor urut " + idx + "!");
                return;
            }
            obj.getArraylist().remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (NumberFormatException | IOException e) {
            System.out.println("Input salah (hanya angka)!");
        }
    }
}
