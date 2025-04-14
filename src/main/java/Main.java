import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] prices = new int[5];
        for (int i = 0; i < 5; i++) {
            int price = Integer.parseInt(bf.readLine());
            prices[i] = price;
        }
        int minBurger = Math.min(prices[0], Math.min(prices[1], prices[2]));
        int minDrink = Math.min(prices[3], prices[4]);

        int setPrice = minBurger + minDrink - 50;

        System.out.println(setPrice);
    }
}