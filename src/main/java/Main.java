import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int[] arrays = new int[2];
        int info = Integer.parseInt(st.nextToken());
        int math = Integer.parseInt(st.nextToken());
        int science = Integer.parseInt(st.nextToken());
        int english = Integer.parseInt(st.nextToken());
        arrays[0] = info + math + science + english;


        st = new StringTokenizer(bf.readLine(), " ");
        info = Integer.parseInt(st.nextToken());
        math = Integer.parseInt(st.nextToken());
        science = Integer.parseInt(st.nextToken());
        english = Integer.parseInt(st.nextToken());
        arrays[1] = info + math + science + english;

        System.out.println(Math.max(arrays[0], arrays[1]));
    }
}
