import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String X = bf.readLine();
//         int X  = Integer.parseInt(bf.readLine());
        String[] parts = X.split("\\.");

        System.out.println(parts[0]);
    }
}
