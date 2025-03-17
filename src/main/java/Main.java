import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 한 번만 선언
        int count = 0; // 그룹 단어 개수 저장
        int N = Integer.parseInt(bf.readLine()); // 단어 개수 입력

        for (int i = 0; i < N; i++) {
            String word = bf.readLine(); // 단어 입력
            if (check(word)) { // 그룹 단어인지 확인
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check(String C) {
        boolean[] alphabet = new boolean[26]; // 알파벳 등장 여부 체크
        char prev = 0; // 이전 문자 저장

        for (int i = 0; i < C.length(); i++) {
            char now = C.charAt(i); // 현재 문자

            // 이전 문자와 다르고, 이미 등장한 문자라면 그룹 단어가 아님
            if (now != prev) {
                if (alphabet[now - 'a']) { // 중복 확인
                    return false; // 위에 if절이 true 면 return false를 줘서 count 안함 -> 왜? 그룹워드 아니라서
                }
                alphabet[now - 'a'] = true; // 등장 기록
                prev = now; // 이전 문자 갱신
            }
        }
        return true;
    }
}