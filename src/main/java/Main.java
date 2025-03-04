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
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(arr[i]);
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
    }
}