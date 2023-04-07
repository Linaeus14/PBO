package ifc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface input {

    public static final BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

    public String Input();

    public int Input(int type);

    public String Input(String message);

    public int Input(String message, int type);
}
