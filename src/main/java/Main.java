import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int hometoschool = Integer.parseInt(bf.readLine());
        int schooltogamer = Integer.parseInt(bf.readLine());
        int gamertostudy = Integer.parseInt(bf.readLine());
        int studytohome = Integer.parseInt(bf.readLine());

        int total = hometoschool + schooltogamer + gamertostudy + studytohome;
        int minute = total / 60;
        int second = total % 60;
        System.out.println(minute);
        System.out.println(second);
    }
}
