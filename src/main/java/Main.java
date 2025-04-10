import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(bf.readLine());
            if (score < 40) {
                score = 40;
            }
            result += score;
        }

        System.out.println(result / 5);
    }
}