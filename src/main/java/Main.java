import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); //

        for (int i = 0; i < N; i++) {
            String[] arr = bf.readLine().split(" ");

            int Ai = Integer.parseInt(arr[0]); // 라면 계수
            int Bi = Integer.parseInt(arr[1]); // 물의 양
            int Xi = Integer.parseInt(arr[2]); // 끓일 라면의 수

            System.out.println((Ai * (Xi - 1)) + Bi);
        }
    }
}