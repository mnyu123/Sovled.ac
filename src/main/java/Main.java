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
        int answer = 0;
        answer = num1 / num2;
        return answer;
    }
}