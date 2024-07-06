package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1934번
 * 최소공배수
 */
public class DMPN1 {
    // Divisor(약수), Multiple(배수), Prime Number(소수)
    // Greatest Common Divisor (GCD, 최대공약수)
    // Least Common Multiple (LCM, 최소공배수)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int gcd = findGCD(a, b);
            int lcm = a * b / gcd;
            sb.append(lcm).append("\n");
        }

        System.out.print(sb);
    }

    private static int findGCD(int a, int b) {
        int gcd = Math.max(a, b);
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }
        return gcd;
    }
}

// 두 수의 최소공배수는 두 수의 최대공약수를 알면 구하기 쉽다.
// 두 수의 곱에 두 수읜 최대공약수로 나누면 최소공배수를 구할 수 있다.

/* 최대공약수를 구하는 방식 <- 이게 내가 사용한 방식보다 효율이 좋다.
아래 방식들은 모두 '유클리드 호제법' 을 사용한 방식이다.

public static int gcd(int a, int b) {

    while (b != 0) {
        int r = a % b; // 나머지를 구해준다.
        // GCD(a, b) = GCD(b, r)이므로 변환한다.
        a = b;
        b = r;
    }
    return a;

// 이런 재귀 형태의 방식도 존재한다.
public static int gcd(int a, int b) { // 최대공약수
    return a % b == 0 ? b : gcd(b, a % b); // 나눈수를 나머지로 나누기
}

}*/