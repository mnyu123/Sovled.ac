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
        public int solution(int age) {
            int answer = 0;
            int nowYear = 2022;
            answer = (nowYear + 1) - age;
            return answer;
        }
    }
}