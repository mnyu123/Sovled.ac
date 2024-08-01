import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 2420 사파리월드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //n과 m 입력받기
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.print(Math.abs(n-m));  //n - m을 절대값을 한 값을 출력하면 된다
        
        
//        // 1271번 엄청난 부자2
//        Scanner scanner = new Scanner(System.in);
//
//        BigInteger AllMoney = scanner.nextBigInteger();
//        BigInteger life = scanner.nextBigInteger();
//
//        System.out.println(AllMoney.divide(life));
//        System.out.println(AllMoney.remainder(life));

        // 2475 검증수
//        Scanner scanner = new Scanner(System.in);
//
//        int total = 0;
//
//        for (int i = 0; i < 5; i++) {
//
//            int number = scanner.nextInt();
//
//            int test = number * number; // 제곱시킴
//            total = total + test; // 그거 토탈에 저장
//
//            System.out.println(i + "번째 제곱합한 수:" + total);
//
//
//        }
//
//        int sovle = total % 10;
//
//        System.out.println("이게 정답일듯: " + sovle);




//        Scanner scanner = new Scanner(System.in);
//
//        BigInteger a =  scanner.nextBigInteger();
//        BigInteger b =  scanner.nextBigInteger();
//
//        System.out.println(a.add(b));
//        System.out.println(a.subtract(b));
//        System.out.println(a.multiply(b));

        



    }
}
