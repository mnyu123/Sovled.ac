import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String A = bf.readLine();
            char check = 0;

            String smallA = A.toLowerCase(); // 싹다 소문자 변경
            int count = 0; // 초기화를 해줘야

            if (smallA.equals("#")) {
                break;
            }

            for (int i = 0; i < smallA.length(); i++) {
                check = smallA.charAt(i);

                for (int j = 0; j < arr.length; j++) {
                    if (check == arr[j]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}