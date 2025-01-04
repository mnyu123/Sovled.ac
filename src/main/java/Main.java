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
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        String arr[] = A.split(" "); // 공백 기준으로 나눔

        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);

        System.out.println(a.multiply(b));
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
