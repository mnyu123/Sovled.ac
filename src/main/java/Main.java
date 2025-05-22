import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = bf.readLine()).equals("#")) {
            int count = 0;
            input = input.toLowerCase(); // 대소문자 구분 없이 비교하기 위해 소문자로 변환

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
