import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken()); // 1
        int B = Integer.parseInt(st.nextToken()); // 2

        // 두 번째 줄 입력
        st = new StringTokenizer(bf.readLine());
        int C = Integer.parseInt(st.nextToken()); // 3
        int D = Integer.parseInt(st.nextToken()); // 4

        int result = Math.min(B + C, A + D);
        System.out.println(result);
    }
}