import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            int M = 0;
            int F = 0;

            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

            M = Integer.parseInt(st.nextToken());
            F = Integer.parseInt(st.nextToken());

            if (M == 0 && F == 0) {
                break;
            } else {
                System.out.println(M + F);
            }
        }
    }
}
