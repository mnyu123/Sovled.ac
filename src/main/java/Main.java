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
        int N = Integer.parseInt(bf.readLine());

        String str = "WelcomeToSMUPC";
        char[] arr = str.toCharArray();

        if (N < 15) {
            System.out.println(arr[N - 1]); // 1-based index 처리
        } else if (N == 15) {
            System.out.println(arr[0]); // 15번째는 "W"
        } else {
            if (N % 14 == 0) {
                System.out.println(arr[13]); // 14번째("C")
            } else {
                System.out.println(arr[(N % 14) - 1]); // 나머지 처리
            }
        }
    }
}