package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2839번
 * 설탕 배달
 */
public class BruteForce6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 100000;

        for (int i = 0; i <= n / 5; i++) {
            for (int j = 0; j <= n / 3; j++) {
                if (n == (5 * i + 3 * j)) {
                    count = Math.min(count, (i + j));
                }
            }
        }

        if (count == 100000) {
            System.out.print(-1);
        } else {
            System.out.print(count);
        }
    }
}

// count 로 큰 수를 두고 계속 입력된 n 값과 일치하는 5의 개수와 3의 개수를 이중 for 문으로 돌려서 찾는다.
// 그 중 count 가 작은 수를 출력하고 count 가 초기값 그대로면 -1 을 출력하도록 했다.
// 다른 사람 풀이 중에 n이 5로 나뉘어 지면 바로 while 문을 빠져나오고 그 외에는 n - 3 을 하고 count++ 를 한다. n < 0 이 되면 -1을 출력하는 방식이 있다.

