import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s , " ");
        int A = 0, B = 0 , C =0  , D = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] numbers = new int[s.length()];
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }

        answer = min + " " + max;
        //System.out.println(answer);


        // 문자열 s에 공백으로 숫자들이 이미 저장되어있음
        // str에 나타나는 숫자중에 최대 , 최소 찾아서
        // 최대 최소를 한칸 공백 두고 반환하는 solution 함수 완성

        return answer;
    }
}
