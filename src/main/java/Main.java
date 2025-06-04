import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0) {
                System.out.print("Go! ");
            }
        }

        // 마지막 그룹에 6명이 안 됐을 경우에도 Go! 출력
        if (N % 6 != 0) {
            System.out.print("Go!");
        }
    }
}
