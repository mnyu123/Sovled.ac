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
        String sN = bf.readLine();
        int N = Integer.parseInt(sN);

        // 숫자에 7 포함되어있고
        if (sN.contains("7")) {
            if (N % 7 == 0) { // 숫자에 7 포함되어있고 + 7로 나누어 떨어지는 경우
                System.out.println(3);
            } else { // 숫자에 7 포함되어있고 + 7로 나누어 떨어지지 않는 경우
                System.out.println(2);
            }
        }
        // 숫자에 7이 포함안되어 있고
        else {
            if (N % 7 == 0) { // 숫자에 7 포함안되어 있고 + 7로 나누어 떨어지는 경우
                System.out.println(1);
            } else { // 숫자에 7 포함안되어 있고 + 7로 나누어 떨어지지 않는 경우
                System.out.println(0);
            }
        }
    }
}