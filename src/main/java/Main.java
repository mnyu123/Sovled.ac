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
        int[] arrs = new int[9];

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = Integer.parseInt(bf.readLine()); // 배열에 입력
        }

        int max = arrs[0];
        int maxIndex = 0;

        for (int j = 1; j < arrs.length; j++) {
            if (arrs[j] > max) {
                max = arrs[j];  // 최대값 업데이트
                maxIndex = j;   // 최대값이 있는 인덱스 업데이트
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1); // 0부터 인덱스 세는게 아님 1부터 세야함(이번 문제에서만!)
    }
}