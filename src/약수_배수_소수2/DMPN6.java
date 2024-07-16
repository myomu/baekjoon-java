package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1929번
 * 소수 구하기
 */
public class DMPN6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        boolean[] arr = new boolean[N + 1];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= N; i++) {
            arr[i] = true;
        }
        arr[0] = arr[1] = false;
        findPrimeNumber(N, arr);

        for (int i = M; i <= N; i++) {
            if (arr[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb.toString());
    }

    private static void findPrimeNumber(int n, boolean[] bucket) {
        for (int i = 2; i <= Math.sqrt(n); i++) { // 최대로 n 까지가 아닌 제곱근 n 까지만 구한다. 그 이후는 불필요하다. 예를들어 n 이 16 이면 제곱근이 되는 4가 마지막이 되는 것이다. 5는 25부터 시작. 4는 16부터 시작이 되니 말이다.
            if (bucket[i]) { // bucket[i] 이 false(소수가 아님) 이면 이미 그 배수는 이미 false 로 판명되어 있기 때문에 계산하지 않는다.
                for (int j = i * i; j <= n; j += i) { // 시작을 i * i 로 하는 이유는 그 i * (1, 2, 3, ..., i) 와 같이 그 이전에서 이미 계산을 했기 때문에 제곱부터 시작하는 것이다.
                    bucket[j] = false;
                }
            }
        }
    }
}

// 특정한 범위 내의 소수를 구하는 방법으로 '에라토스테네스의 체' 라는 방식이 있다.