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
        System.out.println("비와이");
        
        // 여기에 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        String arr[] = A.split(" ");

        int N = Integer.parseInt(arr[0]); // 출발,종착역 빼고 정거장수 N  3역
        int K = Integer.parseInt(arr[1]); // 출발역에서 탑승하는 사람수 k  2명

        int total = 0;
        total += K; // 처음에 탄사람들 미리 더함

        for (int i = 0; i < N; i++) {
            String a = bf.readLine();
            String arr2[] = A.split(" ");
            int ai = Integer.parseInt(arr2[0]); // i번째 정거장에서 탑승하는 사람수 (인원A)
            int ab = Integer.parseInt(arr2[1]); // 하차하는 사람수 (인원B)
            total += ai; // 타고
            total -= ab; // 내리고

            if (ai == 0) {
                // 마지막 역은 아무도 안탐
                // 버스기사 이름출력
                // System.out.println("비와이");
            }
        }
    }
}


/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String str = bf.readLine();
    //System.out.println(str+"??!");
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
    //String A = bf.readLine();
    //String arr[] = A.split(" ");
    //int a = Integer.parseInt(arr[0]);
    //int b = Integer.parseInt(arr[1]);
    //int result = add(a, b);
    //System.out.println(result);
    //}
*/

/*
    //// 여기에 작성
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //int I = Integer.parseInt(bf.readLine()); // 테스트 케이스
    //String A = bf.readLine();
    //String arr[] = A.split(" ");
    //int a = Integer.parseInt(arr[0]);
    //int b = Integer.parseInt(arr[1]);
    //int result = add(a, b);
    //System.out.println("Case " + "#" + (i + 1) + ": " + result);
    //}
*/

/*
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //String A = bf.readLine();
    //String arr[] = A.split(" "); // 공백 기준으로 나눔
    //BigInteger a = new BigInteger(arr[0]);
    //BigInteger b = new BigInteger(arr[1]);
    //System.out.println(a.multiply(b));
    //System.out.println("한국어 테스트");
*/
