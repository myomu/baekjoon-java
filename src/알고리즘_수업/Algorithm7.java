package 알고리즘_수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24313번
 * 알고리즘 수업 - 점근적 표기 1
 */
public class Algorithm7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a1 = Integer.parseInt(input[0]);
        int a0 = Integer.parseInt(input[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        boolean result = true;

        for (int i = n0; i < 101; i++) {
            int fn = FN(a1, a0, i);
            if (fn > c * i) {
                result = false;
                break;
            }
        }
        System.out.print(result ? 1 : 0);
    }

    private static int FN (int a1, int a0, int n) {
        return a1 * n + a0;
    }
}

// 다른 사람 풀이에서는 보통 이런식으로 풀진 않았고 a1 * n0 + a0 <= c * i 을 만족하고 c >= a1 을 만족하면 1을 출력하는 형식으로 만들었다.
// 앞의 식을 만족하는 데다가 c >= a1 이면 항상 n >= n0 인 상황에서도 만족하기 때문인 것 같다.

