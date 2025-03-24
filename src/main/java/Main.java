import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 구매한 각 물건의 가격과 개수
        // 구매한 물건들의 '총 금액'
        // 구매한 물건의 가격과 개수로 계산한 총 금액 == 영수증 총 금액과 일치하는지?

        int X = Integer.parseInt(bf.readLine()); // 영수증 총 금액
        int N = Integer.parseInt(bf.readLine()); // 영수증에 찍힌 구매한 물건의 종류 수

        int buy = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int bought = Integer.parseInt(st.nextToken());
            int Count = Integer.parseInt(st.nextToken());
            buy += bought * Count;
        }

        if (X == buy) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}