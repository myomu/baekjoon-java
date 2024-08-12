package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 27433번
 * 팩토리얼 2
 */
public class Recursion1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long result = factorial(N);
        System.out.print(result);
    }

    private static long factorial(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
