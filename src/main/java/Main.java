import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 빵 개수
        int B = Integer.parseInt(st.nextToken()); // 패티 개수

        int bread = A / 2; // 햄버거를 만들 수 있는 최대 빵 기준 개수

        int burgers = 0;
        if (bread <= B) {
            burgers = bread;
        } else {
            burgers = B;
        }
        System.out.println(burgers);
    }
}
