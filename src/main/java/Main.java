import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 같은눈 3개 (6,6,6) 10000+(6)x1000원 상금 -> 16000원
        // 같은눈 2개 (5,5,1) 1000+(5)x100원 상금 -> 1500원
        // 모두 다름 (1,2,3) 3x100원 상금 -> 300원

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || b == c || a == c) {
            int same;
            if (a == b) same = a;
            else if (b == c) same = b;
            else same = a; // (a == c)
            System.out.println(1000 + (same * 100));
        } else {
            int max;
            if (a > b && a > c) max = a;
            else if (b > a && b > c) max = b;
            else max = c;
            System.out.println(max * 100);
        }
    }
}