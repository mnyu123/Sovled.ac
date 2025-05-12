import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int year = 2024;
        int month = 8;

        int addMonths = (N - 1) * 7;
        month += addMonths;

        // month가 12를 넘으면 연도로 넘겨야 함
        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;

        System.out.println(year + " " + month);
    }
}
