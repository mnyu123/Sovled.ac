import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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




        Scanner scanner = new Scanner(System.in);

        BigInteger a =  scanner.nextBigInteger();
        BigInteger b =  scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));



    }
}
