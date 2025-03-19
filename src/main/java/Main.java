import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> stack = new ArrayList<>(); // 스택

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // 주어지는 명령의 수 N
        String command = ""; // 명령 내용

        for (int i = 0; i < N; i++) {
            command = bf.readLine();
            // System.out.println("명령 내용 : " + command);

            if (command.startsWith("push")) {
                int number = Integer.parseInt(command.split(" ")[1]); // push 1 이 -> "push" , "1" 로 분리되는데
                // 1 인덱스 가져오는건 -> 1 가져오는데 integer로 바꿈 , 즉시 숫자 적용
                PushX(number);
            } else if (command.equals("pop")) {
                pop(); // i가 아마 인덱스
            } else if (command.equals("size")) {
                size();
            } else if (command.equals("empty")) {
                empty();
            } else if (command.equals("top")) {
                top();
            } else {
                System.out.println("404");
            }
        }
    }

    public static void PushX(int x) {
        stack.add(x); // 끗
    }

    public static void pop() {
        if (stack.isEmpty()) {
            System.out.println(-1); // 정수로 출력
        } else {
            System.out.println(stack.remove(stack.size() - 1));
        }
    }

    public static void size() {
        System.out.println(stack.size());
    }

    public static void empty() {
        System.out.println(stack.isEmpty() ? 1 : 0); // 비었음 1 아님 0
    }

    public static void top() {
        if (stack.isEmpty()) {
            System.out.println("-1"); // 스택에 들어있는 정수 없음ㄴ
        } else {
            System.out.println(stack.get(stack.size() - 1)); // 꼭 stack.get 해줘야 하나봄
        }
    }
}