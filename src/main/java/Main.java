import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        String[] arr = A.split(" ");

        int HH = Integer.parseInt(arr[0]); // 9
        int MM = Integer.parseInt(arr[1]); // 0

        // 대회 시작 시간: 9:00
        int startHH = 9;
        int startMM = 0;

        // 경과 시간 계산
        int elapsedTime = (HH - startHH) * 60 + (MM - startMM);

        System.out.println(elapsedTime);

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

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String A = bf.readLine();
    //int a = Integer.parseInt(A);
    //String B = bf.readLine();
    //Set<Character> mo = new HashSet<>();
    //mo.add('a');
    //mo.add('i');
    //mo.add('o');
    //mo.add('u');
    //mo.add('e');
    //int count = 0;
    //char ch = B.charAt(i);
    //count++;
    //}
    //}
    //System.out.println(count);
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //// 첫 번째 줄: 자릿수 정보 N, M (사용하지 않음)
    //String[] arr = bf.readLine().split(" ");
    //// 두 번째 줄: 첫 번째 숫자 A
    //BigInteger a = new BigInteger(bf.readLine());
    //// 세 번째 줄: 두 번째 숫자 B
    //BigInteger b = new BigInteger(bf.readLine());
    //// A * B 계산 후 출력
    //System.out.println(a.multiply(b));
*/

/*
    //// 여기에 작성
    //Scanner scanner = new Scanner(System.in);
    //BigInteger a = scanner.nextBigInteger();
    //BigInteger b = scanner.nextBigInteger();
    //BigInteger c = scanner.nextBigInteger();
    //System.out.println(b.subtract(c).divide(a));
    //// 4 * X = 20 * 8
    //// 4 * X = 160
    //// X = 160 / 4
    //// a * X = bc
    //// X = bc / a
*/

/*
    //// 여기에 작성
    //System.out.println("         ,r'\"7\n" +
    //"r`-_   ,'  ,/\n" +
    //" \\. \". L_r'\n" +
    //"   `~\\/\n" +
    //"      |\n" +
    //"      |");
*/
