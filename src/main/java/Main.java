import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(bf.readLine()); // 방학 일수
        int A = Integer.parseInt(bf.readLine()); // 국어 총 페이지
        int B = Integer.parseInt(bf.readLine()); // 수학 총 페이지
        int C = Integer.parseInt(bf.readLine()); // 하루에 풀 수 있는 국어 페이지
        int D = Integer.parseInt(bf.readLine()); // 하루에 풀 수 있는 수학 페이지

        int koreanDays = (A + C - 1) / C;
        int mathDays = (B + D - 1) / D;

        int studyDays = Math.max(koreanDays, mathDays); // 더 많이 소모하는 일자로 빼면 남은 방학일자
        System.out.println(L - studyDays);
    }
}
