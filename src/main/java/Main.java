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
        int Arno = Integer.parseInt(bf.readLine()); // 아르노가 잠자는 시간 20시~23시 , 0시~3시
        int alarm = Integer.parseInt(bf.readLine()); // 아르노아 알람 맞춰놓은 시간

        int result = 0;

        if (Arno <= alarm) {
            result = alarm - Arno;
        } else {
            result = (24 - Arno) + alarm;
        }

        System.out.println(result);
    }
}