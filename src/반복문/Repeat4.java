package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 25304번
 * 영수증
 */
public class Repeat4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int price = Integer.parseInt(inputs[0]);
            int quantity = Integer.parseInt(inputs[1]);
            sum += price * quantity;
        }

        if (totalAmount == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
