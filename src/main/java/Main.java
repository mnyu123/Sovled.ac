import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int settingDay = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int check = 0;
        for (int i = 0; i < 5; i++) {
            int carLastNumber = Integer.parseInt(st.nextToken());
            if (carLastNumber > 10) {
                int divLastNumber = carLastNumber % 10;
                if (divLastNumber == settingDay) {
                    check++;
                }
            }
            if (settingDay == carLastNumber) {
                check++;
            }
        }
        System.out.println(check);
    }
}
