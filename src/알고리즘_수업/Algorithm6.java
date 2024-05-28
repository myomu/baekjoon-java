package 알고리즘_수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24267번
 * 알고리즘 수업 - 알고리즘의 수행 시간 6
 */
public class Algorithm6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long count = 0;
        for (long i = 1; i <= n - 2; i++) {
            count += i * (i + 1) / 2;
        }
        System.out.println(count);
        System.out.print(3);

    }
}

// 고민의 흔적들.. 수학 공식으로 풀러보려 했으나 실패
// 7, 6, 5, 4, 3, 2, 1 // 5 * 5 1~n-2 2~n-1 3~n // 5 5 5 // 5, 4, 3, 2, 1 / 4, 3, 2, 1 / 3, 2, 1 / 2, 1 / 1 // (n-2) * (n-2) * (n-1) / 2
// (n-2) * (n-1) / 2 -> n^2 -3n +2 / 2 -> n(n+1)(2n+1)/6 -3*(n(n+1)/2) + 2 / 2 -> (2n^3 + 3n^2 + n -9n^2 -9n )/ 6 + 2 / 2 -> (n^3-3n^2-4n+6/6)
// System.out.println((Math.pow(n, 3) -3 * Math.pow(n, 2) -4 * n + 6) / 6);

// 다른 풀이를 보니 조합(Combination) 을 사용하는 방식이 있다고 한다.
// nCx = nPx / x! 공식을 이용한다.
// 문제가 3개의 항을 돌면서 계산을 하지만 어떻게 보면 총 n 개의 구슬을 주머니에 넣고 배열 순서에 관계없이 서로 다른 3가지 번호의 구슬을 뽑기만 하면 된다.. 는 식으로 접근이 가능하다.
// 처음 for 문에서 번호를 선택하고 그 다음 for 문은 그 번호의 +1 을, 그 다음 for 문은 이전 for 문의 번호에서 +1 을 하고, 범위 또한 n-2, n-1, n 으로 서로 겹치는 번호가 없게된다.
// 그러므로 조합을 사용하는 방식이 가능한 것 같다.
// ===> (n-1) * (n-2) * (n-3) / 6 이라는 공식이 나오게 된다.
