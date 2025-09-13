import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    }

    public static class Solution {
        public int solution(int n) {
            int answer = 0;
            while (n > 0) { // true
                answer += n % 10; // 23 , 3
                n /= 10;     // 12     , 2 , 1
            }
            return answer;
        }
    }
}