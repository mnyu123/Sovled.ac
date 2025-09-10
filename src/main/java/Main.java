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
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int answer = 0;

            for(int i=0; i<number; i++){
                answer += number % 100; // 59
                number /= 100;// 48
                answer += number;
            }

            System.out.println(answer);
        }
    }
}