import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int cook = Integer.parseInt(bf.readLine());

        int totalsecond = hour * 3600 + minute * 60 + second;

        totalsecond += cook;

        int newhour = (totalsecond / 3600) % 24;
        int newminute = (totalsecond % 3600) / 60;
        int newsecond = totalsecond % 60;

        System.out.println(newhour + " " + newminute + " " + newsecond);
    }
}
