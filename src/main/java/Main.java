import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 과자 1개 가격 K
        // 사려는 과자 개수 N
        // 돈 : M
        // 모자란 값 계산

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if ((K * N) - M < 0) {
            System.out.println(0);
        } else {
            System.out.println((K * N) - M);
        }
    }
}
