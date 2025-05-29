import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int mom = Integer.parseInt(st.nextToken());

            if (name.equals("#") && age == 0 && mom == 0) {
                break;
            }

            if (age > 17 || mom >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
