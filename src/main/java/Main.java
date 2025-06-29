import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int sh = Integer.parseInt(st.nextToken()); // 출근 시
            int sm = Integer.parseInt(st.nextToken()); // 출근 분
            int ss = Integer.parseInt(st.nextToken()); // 출근 초

            int eh = Integer.parseInt(st.nextToken()); // 퇴근 시
            int em = Integer.parseInt(st.nextToken()); // 퇴근 분
            int es = Integer.parseInt(st.nextToken()); // 퇴근 초

            int diffS = es - ss; // 퇴근 - 출근 초
            int diffM = em - sm; // 퇴근 - 출근 분
            int diffH = eh - sh; // 퇴근 - 출근 시

            if (diffS < 0) { // 퇴근 초가 0보다 작게나오면
                diffS += 60; // s에다가 60더하고
                diffM -= 1; // M은 1빼야함
            }
            if (diffM < 0) {
                diffM += 60;
                diffH -= 1;
            }

            System.out.println(diffH + " " + diffM + " " + diffS);
        }
    }
}
