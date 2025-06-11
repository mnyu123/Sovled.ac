import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        int AA = Integer.parseInt(A);
        String B = bf.readLine();
        int BB = Integer.parseInt(B);
        String C = bf.readLine();
        int CC = Integer.parseInt(C);

        System.out.println((AA + BB) - CC);
        String plus = A + B;
        int num1 = Integer.parseInt(plus);
        System.out.println(num1 - CC);
    }
}
