import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int Sab = Integer.parseInt(bf.readLine());
        int Fab = Integer.parseInt(bf.readLine());

        if (Sab > Fab) {
            System.out.println("flight");
        } else {
            System.out.println("high speed rail");
        }
    }
}