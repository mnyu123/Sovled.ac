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
        // 여기에 작성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A;

        while ((A = bf.readLine()) != null && !A.isEmpty()) {
            String arr[] = A.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(a == 0 && b == 0){
                return;
            }
            int result = add(a, b);
            System.out.println(result);
        }
    }

    private static int add(int s, int s1) {
        return s + s1; // 두 수의 합 반환
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
