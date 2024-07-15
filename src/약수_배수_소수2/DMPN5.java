package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4134번
 * 다음 소수
 */
public class DMPN5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            if (n == 0) n = n + 2;
            if (n == 1) n = n + 1;
            while (!isPrimeNumber(n)) {
                n++;
            }
            sb.append(n).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static boolean isPrimeNumber(long n) {
        int cnt = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
            }
            if (cnt > 0) {
                return false;
            }
        }
        return true;
    }
}

// 소수를 구하는 방법 중에서 '에라토스테네스의 체' 라는 방식이 있다.
// 이것이 소수를 판펼하려는 수의 제곱근 까지의 범위로 소수를 판별하는 방식보다 더 빠른 성능을 가지고 있다.