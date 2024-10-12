package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24416번
 * 알고리즘 수업 - 피보나치 수 1
 */
public class Dynamic1 {

    private static int fibCount;
    private static int fibonacciCount;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        System.out.print(fibCount + " " + fibonacciCount);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int[] fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            fibonacciCount++;
        }
        return arr;
    }

}
