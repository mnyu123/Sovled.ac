import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(bf.readLine()); // 영수증 총액
        int result = 0;
        for (int i = 0; i < 9; i++) {
            int book = Integer.parseInt(bf.readLine()); // 9개 책가격
            result += book;
        }
        System.out.println(total - result);
    }
}
