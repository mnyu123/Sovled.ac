import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            int problem = Integer.parseInt(bf.readLine());

            if(problem % 2 == 1){
                result++;
            }
        }
        System.out.println(result);
    }
}
