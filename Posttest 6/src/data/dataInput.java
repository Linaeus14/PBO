package data;

import java.io.IOException;

import ifc.input;

public class dataInput implements input {

    public final String Input() {
        while (true) {
            try {
                String input = inp.readLine();
                return input;
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan dengan input!");
            }
        }
    }

    public final int Input(int type) {
        while (true) {
            try {
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    public final String Input(String message) {
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

    public final int Input(String message, int type) {
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
}
