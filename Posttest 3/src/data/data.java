package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class data {

    protected InputStreamReader isr = new InputStreamReader(System.in);
    protected BufferedReader inp = new BufferedReader(isr);

    public int Menu(String menu) {
                  
        while (true) {
            try {
                System.out.print(menu);
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }
}
