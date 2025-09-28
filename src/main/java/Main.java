import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {5,5};

        Solution solution = new Solution();
        System.out.println(solution.solution(arr));
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        int result = 0;

        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }
        answer = (double) result / arr.length;

        return answer;
    }
}