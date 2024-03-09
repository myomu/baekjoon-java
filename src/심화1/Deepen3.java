package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2444번
 * 별 찍기 - 7
 */
public class Deepen3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2 * n - 1; i++) {
            sb.append(" ".repeat(Math.abs(n-i))); //sb.repeat 가 java11 기준으로 cannot find symbol 로 컴파일 에러가 나서 변경함.
            if (i <= n) {
                sb.append("*".repeat((2 * i - 1))).append("\n");
            } else {
                sb.append("*".repeat(((4 * n) - (2 * i) - 1))).append("\n"); //등차수열로 계산. -2n + a. -2*(i-n) + (2*n-1) => -2*i + 2*n + 2*n - 1 => 4*n - 2*i - 1
            }
        }
        System.out.print(sb);
    }
}
