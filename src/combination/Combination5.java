package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1010번
 * 다리 놓기
 */
public class Combination5 {

    static int[][] cache = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            int result = binomial(M, N);
            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (cache[n][k] == 0) {
            cache[n][k] = binomial(n - 1, k) + binomial(n - 1, k - 1);
        }
        return cache[n][k];
    }
}

// 이항 계수는 N개의 물건 중 K개를 순서 없이 고르는 경우의 수와 같다.
// 1 2 3, 1 2 4, 1 2 5, 1 3 4, 1 3 5, 1 4 5, 2 3 4, 2 3 5, 2 4 5, 3 4 5 = 10개
// 5C3 = (5 * 4 * 3) / (3 * 2 * 1) = 10
// nCr = n! / r!(n - r)!

// 이항 계수의 특징으로 (n / k) = (n-1 / k) + (n-1 / k-1) 이라는 것이 있다. - 파스칼의 삼각형
// 이것을 사용하여 푸는 방법이 있는데 여기서 문제는 중복되는 재귀가 많다는 것이다.
// 이를 해결하기 위해 캐시처럼 이전에 계산한 값을 저장하는 로직이 필요하다.
