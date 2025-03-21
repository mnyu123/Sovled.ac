import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 단어 입력
        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1; // 처음에는 전부 -1로 초기화(아직 아무것도 안나왔으니까)
        }

        for (int j = 0; j < S.length(); j++) {
            char ch = S.charAt(j); // 왼쪽부터 찾음
            int index = ch - 'a'; // 알파벳이 등장한 인덱스임
            if (alphabet[index] == -1) {
                alphabet[index] = j; // 알파벳 그 인덱스 위치에 현재 j위치 넣어서 저장
            }
        }

        for (int k = 0; k < alphabet.length; k++) {
            System.out.print(alphabet[k] + " ");
        }
    }
}