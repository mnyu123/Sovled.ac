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
        int Ramda = Integer.parseInt(bf.readLine());

        if (Ramda >= 380 && Ramda < 425) {
            System.out.println("Violet");
        } else if (Ramda >= 425 && Ramda < 450) {
            System.out.println("Indigo");
        } else if (Ramda >= 450 && Ramda < 495) {
            System.out.println("Blue");
        } else if (Ramda >= 495 && Ramda < 570) {
            System.out.println("Green");
        } else if (Ramda >= 570 && Ramda < 590) {
            System.out.println("Yellow");
        } else if (Ramda >= 590 && Ramda < 620) {
            System.out.println("Orange");
        } else if (Ramda >= 620 && Ramda <= 780) {
            System.out.println("Red");
        }
    }
}