import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 가게수
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(st.nextToken()); // 현위치 -> 가게까지 가는데 걸린시간
            int B = Integer.parseInt(st.nextToken()); // 현 시점에서 빵이 들어올때까지 걸리는 시간

            if (A <= B) {
                min = Math.min(min, B);
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min);
        }
    }
}
