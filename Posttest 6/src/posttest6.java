import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import data.barang.produk.*;
import data.orang.produsen.*;

public class posttest6 {
    
    public static void main(String[] args) {
        
        prd dtaProduk = new prd();
        prdn dtaProdusen = new prdn();
        
        staff(dtaProduk, dtaProdusen);
    }
    
    static final BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

    static void staff(prd produk, prdn produsen ) {
        String menu = """
                <=  Pendataan Barang Toko Elektronik  =>
                    \n> Menu :
                    1. Data Barang
                    2. Data Produsen
                    3. Keluar
                    Masukan Pilihan :""";

        while (true) {
            try {
                System.out.print(menu);
                int input = Integer.parseInt(inp.readLine());

                if (input == 1) {

                    boolean loop = true;
                    while (loop) {
                        
                        System.out.println("  <=  Menu Produk  =>  ");
                        input = produk.Menu();
                        switch (input) {
                            case 1 -> produk.Create(produsen);
                            case 2 -> produk.Read();
                            case 3 -> produk.Update(produsen);
                            case 4 -> produk.Delete(produk);
                            case 5 -> loop = false;
                            default -> System.out.println("Input Salah Coba Lagi!");
                        }
                    }
                } else if (input == 2) {

                    boolean loop = true;
                    while (loop) {

                        System.out.println("  <=  Menu Produsen  =>  ");
                        input = produsen.Menu();
                        switch (input) {
                            case 1 -> produsen.Create(produk);
                            case 2 -> produsen.Read();
                            case 3 -> produsen.Update(produk);
                            case 4 -> produsen.Delete(produsen);
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
