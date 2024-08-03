package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10872번
 * 팩토리얼
 */
public class Combination3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(factorial(N));
    }

    private static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
