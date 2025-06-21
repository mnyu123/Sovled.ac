import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int dice_A = Integer.parseInt(st.nextToken());
            int dice_B = Integer.parseInt(st.nextToken());

            System.out.println("Case " + (i + 1) + ": " + (dice_A + dice_B));
        }
    }
}
