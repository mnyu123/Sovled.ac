import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int visit = L * P;
        StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            int visitor = Integer.parseInt(st2.nextToken());
            System.out.print((visitor - visit) + " ");
        }
    }
}
