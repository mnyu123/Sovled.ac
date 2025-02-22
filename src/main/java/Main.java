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
        String Si[] = new String[N];

        for (int i = 0; i < N; i++) {
            Si[i] = bf.readLine();
        }

        String[] arrs = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        boolean isChanged = false;
        for (int i = 0; i < N; i++) {
            boolean isMatch = false;
            for (String s : arrs) {
                if (Si[i].equals(s)) {
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) {
                isChanged = true;
                break;
            }
        }

        if (isChanged) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}