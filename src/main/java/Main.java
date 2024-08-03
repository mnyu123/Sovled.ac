import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        // 3003번 킹,퀸,룩,비숍,나이트,폰
        Scanner scanner = new Scanner(System.in);


        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king = king - scanner.nextInt();
        queen = queen - scanner.nextInt();
        rook = rook - scanner.nextInt();
        bishop = bishop - scanner.nextInt();
        knight = knight - scanner.nextInt();
        pawn = pawn - scanner.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn);


//        // 2744번 대소문자 바꾸기
//        Scanner scanner = new Scanner(System.in);
//
//        String a = scanner.nextLine();
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < a.length(); i++) {
//
//            char c = a.charAt(i); // 맨 앞글자 하나씩
//
//            if (Character.isUpperCase(c)) { // 대문자면
//
//                result.append(Character.toLowerCase(c)); // 내부함수로 소문자
//
//            } else if (Character.isLowerCase(c)) { // 소문자면
//
//                result.append(Character.toUpperCase(c)); // 내부함수로 대문자
//
//            } else {
//
//                result.append(c); // 숫자나 특수문자 등은 그대로 추가
//            }
//
//
//        }
//
//        System.out.println(result.toString());
//        scanner.close();
//
//        System.out.println();


//        // 2420 사파리월드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        //n과 m 입력받기
//        long n = Long.parseLong(st.nextToken());
//        long m = Long.parseLong(st.nextToken());
//        System.out.print(Math.abs(n-m));  //n - m을 절대값을 한 값을 출력하면 된다


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
