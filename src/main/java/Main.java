import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] arrays = new int[3];

        for (int i = 0; i < 3; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        sortThree(arrays);

        for (int num : arrays) {
            System.out.print(num + " ");
        }
    }

    private static void sortThree(int[] array) {
        int temp;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
