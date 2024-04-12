package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1193번
 * 분수찾기
 */
public class Math6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1(1), 2~3(2), 4~6(3), 7~10(4), 11~15(5) // a/b 에서 홀수는 n/1 시작, 짝수는 1/n 시작.
        int x = Integer.parseInt(br.readLine());
        int base = 1;
        int cnt = 0;
        int a;
        int b;
        while (x >= base) {
            cnt++;
            base += cnt;
        }
        int n = base - x;
        if (cnt % 2 != 0) {
            a = n;
            b = cnt - n + 1;
        } else {
            a = cnt - n + 1;
            b = n;
        }
        System.out.print(a + "/" + b);
    }
}
