import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());

        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}

class Solution {
    public int[] solution(long n) {

        String n2 = String.valueOf(n);
        //System.out.println("어떻게 나오길래? : " + n2);

        int[] answer = new int[n2.length()];
        int length = n2.length();
        //System.out.println("길이 맞는지 : " + length); // 5 일거고 ,

        for (int i = 0; i < n2.length(); i++) {
            answer[i] = n2.charAt(length - 1) - '0';
            System.out.print(answer[i]);
            length--;
        }
        // 입력이 12345가 오면
        // 답변을 5,4,3,2,1 배열로 들어오게 해서 반환
        return answer;
    }
}