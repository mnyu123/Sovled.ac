import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int susuiA = Integer.parseInt(bf.readLine());
        int susuiB = Integer.parseInt(bf.readLine());
        int susuiC = Integer.parseInt(bf.readLine());

        System.out.println((3 * susuiA) + (4 * susuiB) + (5 * susuiC));
    }
}