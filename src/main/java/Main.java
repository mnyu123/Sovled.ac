import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        if ((A + B + C) <= 21) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
