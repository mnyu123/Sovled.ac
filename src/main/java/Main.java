import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String text = bf.readLine();

        while (!text.equals("END")) {
            String reverse = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                reverse += text.charAt(i);
            }
            System.out.println(reverse);

            text = bf.readLine(); // 다음줄
        }
    }
}
