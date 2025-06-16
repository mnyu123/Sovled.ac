import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = bf.readLine();
            if (input.equals("END")) {
                break;
            }
            System.out.println(reverse(input));
        }
    }

    public static String reverse(String A) {
        String reverse = "";
        String str = A;

        for (int i = A.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}
