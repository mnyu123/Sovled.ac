import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(bf.readLine());
            int count = 0;
            for (int j = 0; j < k; j++) {
                System.out.print("=");
                count++;
                if (count == k) {
                    System.out.println("");
                    break;
                }

            }
        }
    }
}