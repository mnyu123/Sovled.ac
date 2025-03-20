import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());  // 테스트 케이스 개수 입력받기

        StringBuilder sb = new StringBuilder();  // 신규 문법


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append("\n");
        }
        System.out.println(sb.toString());
    }
}