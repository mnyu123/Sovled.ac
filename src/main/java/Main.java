import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        String arr[] = A.split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int n3 = Integer.parseInt(arr[2]);

        int N = (((n1 + 1) * (n2 + 1)) / (n3 + 1)) - 1;
        System.out.println(N);
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

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String A = bf.readLine();
    //String arr[] = A.split(" "); // 공백기준 입력 받음
    //BigInteger a = new BigInteger(arr[0]);
    //BigInteger b = new BigInteger(arr[1]);
    //System.out.println(a.add(b));
*/

/*
    //// 여기에 작성
    //Scanner sc = new Scanner(System.in);
    //int N = sc.nextInt();
    //System.out.println(N - 1946);
*/
