import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String[][] board = {{"11", "A B C D E F G H J L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A C E F G H I L M"},
                {"9", "A B C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A C E F G H L M"},
                {"8", "A B C F G H L M"}};

        // Output
        System.out.println(board[N - 1][0]);
        System.out.println(board[N - 1][1]);
    }
}