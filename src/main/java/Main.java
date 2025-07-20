import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 꼭짓점 수 - 모서리수 + 면의 수 = 2
        int T = Integer.parseInt(bf.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // StringTokenizer 쓸때 꼭 공백이면 저거 한칸 띄웁시다
            int V = Integer.parseInt(st.nextToken()); // 꼭짓점 수
            int E = Integer.parseInt(st.nextToken()); // 모서리 수

            System.out.println(2 - V + E); // 면의 수 출력
        }

        // V - E + 구해야할 수 = 2?
        // 구해야할 수 = 2 - V + E
    }
}
