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

        String[] arr = bf.readLine().split(" ");

        int s1 = Integer.parseInt(arr[0]); // 대회 전반부가 끝났을 때 해당 문제를 해결한 참가자의 수
        int s2 = Integer.parseInt(arr[1]);
        // 대회가 완전히 끝났을 때 해당 문제를 해결한 참가자의 수 s2
        //(즉, s2는 s1을 포함한 전체 해결자 수이다.)

        // 만약 전체 해결자(s2)의 절반 이상이 대회 전반부(s1)에 문제를 해결했다면, 이 문제는 쉬운 문제로 간주된다.
        // 쉬운문제 기준 : s2값의 절반을 구하고 , s1이 그 값을 넘거나 같으면

        if ((s2 + 1) / 2 <= s1) {
            System.out.println("E");
        } else {
            System.out.println("H");
        }
    }
}