import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine()); // 막내의 나이
        int B = Integer.parseInt(bf.readLine()); // 둘째의 나이

        // 막내가 12 , 5
        // 둘째가 15 , 10
        //            15

        System.out.println((B - A) + (B));
    }
}
