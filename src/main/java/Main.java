import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int round = Integer.parseInt(bf.readLine());
            result += round;

        }
        if (result + 300 <= 1800) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}