import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int angle1 = Integer.parseInt(bf.readLine());
        int angle2 = Integer.parseInt(bf.readLine());
        int angle3 = Integer.parseInt(bf.readLine());

        int sum = angle1 + angle2 + angle3; // 각의 합

        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}