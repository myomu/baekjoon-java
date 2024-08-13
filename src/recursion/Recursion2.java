package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10870번
 * 피보나치 수 5
 */
public class Recursion2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long result = fibo(N);
        System.out.print(result);
    }

    private static long fibo(long n) {
        if (n == 0 || n == 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}

// 메모이제이션 방식. 즉, 중복되는 fibo 를 메모해두면 중복을 방지하여 시간과 메모리를 효율적으로 사용한다.