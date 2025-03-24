import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // A,B,C 가 준다
        // 1. A*B*C를 곱한결과에 0부터 9까지 숫자가 몇번 쓰였는지
        // 계산결과가 17037300 라면 0이 3번,1 1번,3 두번,7 두번임

        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());

        int mul = A * B * C;
        check(mul);
    }

    public static void check(int num) {
        int[] count = new int[10];

        while (num > 0) {
            int number = num % 10; // ex 173 % 10 -> 3 나머지 -> 일의 자리 숫자임
            count[number]++; // 일의 자리 숫자를 count 배열에 해당 인덱스에 넣어서 ++ -> 0 0 1 0 0 0 0 ... 이렇게 됨
            num /= 10; // 이제 173 / 10 -> 17 -> 반복하면 두번째에 7 걸림 -> 반복
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}