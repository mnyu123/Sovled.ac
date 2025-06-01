import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = bf.readLine()) != null) {
            // 일단 저걸로 바꾸고
            line = line.replace("i", "#");
            line = line.replace("e", "%");
            line = line.replace("I", "$");
            line = line.replace("E", "&");

            // 겹치는 상황 지나간 다음에 바꾸기
            line = line.replace("#", "e");
            line = line.replace("%", "i");
            line = line.replace("$", "E");
            line = line.replace("&", "I");

            System.out.println(line);
        }
    }
}