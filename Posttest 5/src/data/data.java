package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class data<type1, type2> {

    private BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    private String menu = """
        \n> Menu :
            1. Tambah Data
            2. Lihat Data
            3. Ubah data
            4. Hapus Data
            5. Kembali
            Masukan Pilihan :""";
    
    protected abstract boolean Check();
    protected abstract void Create(type2 data);
    protected abstract void Read();
    protected abstract void Update(type2 data);
    protected abstract void Delete(type1 data);

    protected String Input() {
        while (true) {
            try {
                String input = inp.readLine();
                return input;
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan dengan input!");
            }
        }
    }

    protected int Input(int type) {
        while (true) {
            try {
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    protected String Input(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = inp.readLine();
                return input;
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan dengan input!");
            }
        }
    }

    protected int Input(String message, int type) {
        while (true) {
            try {
                System.out.print(message);
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    public int Menu() {
        return Input(menu, 0);
    }
}
    