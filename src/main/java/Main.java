import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());

        if (X % 3 == 1) {
            System.out.println("U");
        } else if (X % 3 == 2) {
            System.out.println("O");
        } else if (X % 3 == 0) {
            System.out.println("S");
        }
    }
}
