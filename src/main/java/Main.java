import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // "3" , "ABC" 로 나뉨
            int R = Integer.parseInt(st.nextToken()); // 문자열 반복할 횟수
            String S = st.nextToken();

            for (int j = 0; j < S.length(); j++) {  // 문자열 S의 각 문자에 대해
                for (int k = 0; k < R; k++) {  // 해당 문자를 R번 반복 출력
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println(); // 줄바꿈
        }
    }
}