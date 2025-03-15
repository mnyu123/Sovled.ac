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

        while (true) {
            String A = bf.readLine();

            if (A.equals("0")) {
                break;
            }

            BigInteger n = new BigInteger(A);
            BigInteger div = BigInteger.valueOf(42);

            if (n.mod(div).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
    }
}