import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean[] number = new boolean[31];

        for (int i = 0; i < 28; i++) {
            // 입력
            int check = Integer.parseInt(bf.readLine());
            number[check] = true; // 숫자 있으면 true
        }
        for (int i = 1; i <= 30; i++) {
            if (!number[i]) { // false(NOT) -> true, 즉 아까 입력때 없었으면
                System.out.println(i);
            }
        }
    }
}