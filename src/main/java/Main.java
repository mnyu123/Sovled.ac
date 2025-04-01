import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int Ti = Integer.parseInt(st.nextToken());
        int Tj = Integer.parseInt(st.nextToken());

        if (Ti > Tj) {
            System.out.println(Tj);
        } else {
            System.out.println(Ti);
        }
    }
}