import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;

import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        int L = Integer.parseInt(A); // 성우위치 -> 민건이집 거리 줌 (1~백만)
        int S = 5; // 성우가 5까지 이동가능

        if (L % S == 0) { // 5의 단위 ex 100 이면
            System.out.println(L / S); // 20분만에 찾음 5,5,5....5,5 해서
        } else {
            System.out.println(L / S + 1); // 101,102,103,104 라면     20분에다가 한번 더 가야해서 + 1 해줌
        }
        // 성우는 1분에 1에서 5까지의 거리를 이동할 수 있다.
        // 1분 : 1~5 감
        // 입력으로 성우위치 -> 민건이집 거리 줌 (1~백만)
        // 빨리찾으면 몇분만에 찾는지
        // 거리 12를 주면 성우는 5 , 5 , 2 해서 3분만에 감 이런거찾음

    }
}
/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String X = bf.readLine();
    //String Y = bf.readLine();
    //int x = Integer.parseInt(X);
    //int y = Integer.parseInt(Y);
    //System.out.println("1");
    //System.out.println("4");
    //System.out.println("2");
    //System.out.println("3");
    //System.out.println("1");
    //}
    //}
    //}
    ///*
    ////// 여기에 작성
    ////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    ////String str = bf.readLine();
    ////System.out.println(str+"??!");
    //*/
///*
////// 여기에 작성
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
////String A = bf.readLine();
////String arr[] = A.split(" ");
////int a = Integer.parseInt(arr[0]);
////int b = Integer.parseInt(arr[1]);
////int result = add(a, b);
////System.out.println(result);
////}
//*/
///*
////// 여기에 작성
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
////String A = bf.readLine();
////String arr[] = A.split(" ");
////int a = Integer.parseInt(arr[0]);
////int b = Integer.parseInt(arr[1]);
////int result = add(a, b);
////System.out.println("Case " + "#" + (i + 1) + ": " + result);
////}
//*/
///*
////BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////String A = bf.readLine();
////String arr[] = A.split(" "); // 공백 기준으로 나눔
////BigInteger a = new BigInteger(arr[0]);
////BigInteger b = new BigInteger(arr[1]);
////System.out.println(a.multiply(b));
////System.out.println("한국어 테스트");
//*/

/*
    //// 여기에 작성
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String N = br.readLine(); // 입력 숫자를 문자열로 읽기
    //int divisor = 20000303; // 나눌 값
    //int remainder = 0;
    //// 문자열의 각 자리 숫자를 사용하여 나머지 계산
    //remainder = (remainder * 10 + (N.charAt(i) - '0')) % divisor;
    //}
    //System.out.println(remainder); // 결과 출력
*/
