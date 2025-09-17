import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        Solution solution = new Solution();
        System.out.println(solution.solution(a, b));
    }
}

class Solution {
    public int solution(int num1, int num2) {
        // num1 / num2를 double로 나눈 후 1000 곱하기
        double answer = ((double) num1 / num2) * 1000;

        // int로 변환해서 반환
        return (int) answer;
    }
}