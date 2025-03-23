import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (M % K == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}