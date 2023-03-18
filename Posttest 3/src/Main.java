import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import data.produk.*;
import data.produsen.*;

public class Main {

    public static void main(String[] args) {

        prd dta1 = new prd();
        prdn dta2 = new prdn();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inp = new BufferedReader(isr);

        String menu1 = """
                <=  Pendataan Barang Toko Elektronik  =>
                    \n> Menu :
                    1. Data Barang
                    2. Data Produsen
                    3. Keluar
                    Masukan Pilihan :""";
        String menu2 = """
            \n> Menu :
                1. Tambah Data
                2. Lihat Data
                3. Ubah data
                4. Hapus Data
                5. Kembali
                Masukan Pilihan :""";

        while (true) {

            try {
                System.out.print(menu1);
                int input = Integer.parseInt(inp.readLine());

                if (input == 1) {

                    boolean loop = true;
                    while (loop) {
                        
                        System.out.println("  <=  Menu Produk  =>  ");
                        input = dta1.Menu(menu2);
                        switch (input) {
                            case 1 -> dta1.Create(dta2);
                            case 2 -> dta1.Read();
                            case 3 -> dta1.Update(dta2);
                            case 4 -> dta1.Delete(dta1);
                            case 5 -> loop = false;
                            default -> System.out.println("Input Salah Coba Lagi!");
                        }
                    }
                } else if (input == 2) {

                    boolean loop = true;
                    while (loop) {

                        System.out.println("  <=  Menu Produsen  =>  ");
                        input = dta2.Menu(menu2);
                        switch (input) {
                            case 1 -> dta2.Create();
                            case 2 -> dta2.Read();
                            case 3 -> dta2.Update();
                            case 4 -> dta2.Delete(dta2);
                            case 5 -> loop = false;
                            default -> System.out.println("Input Salah Coba Lagi!");
                        }
                    }
                } else if (input == 3) {
                    break;
                } else {
                    System.out.println("Input Salah Coba Lagi!");
                }

            } catch (NumberFormatException | IOException e) {
                System.out.println("input hanya angka!");
            }
        }
    }
}
