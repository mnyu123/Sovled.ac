import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine(); // 입력값 받기

        String[] arr = A.split(" "); // 공백 한 칸 기준으로 분리
        Long a = Long.parseLong(arr[0]);
        Long b = Long.parseLong(arr[1]);
        Long c = Long.parseLong(arr[2]); // 아이씨 정민아 long타입으로 누가 숫자를 계산해

        long result = add(a, b, c);
        System.out.println(result);
    }

    private static long add(long s, long s1, long s2) {
        return s + s1 + s2;
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
