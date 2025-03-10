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

        String A = "";

        for (int i = 0; i < N; i++) {
            A = bf.readLine();
            System.out.println(info(A));
        }
    }

    public static String info(String A) {
        switch (A) {
            case "Algorithm":
                A = "204";
                break;
            case "DataAnalysis":
                A = "207";
                break;
            case "ArtificialIntelligence":
                A = "302";
                break;
            case "CyberSecurity":
                A = "B101";
                break;
            case "Network":
                A = "303";
                break;
            case "Startup":
                A = "501";
                break;
            case "TestStrategy":
                A = "105";
                break;
        }
        return A;
    }
}