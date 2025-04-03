import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int ampere = Integer.parseInt(bf.readLine()); // 트리의 암페어
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int watt = Integer.parseInt(st.nextToken());
        int volt = Integer.parseInt(st.nextToken());

        // 조건 트리 암페어(ampere)값 >= 계산한 암페어(check)값
        int check = watt / volt;

        if (check >= ampere) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}