package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2798번
 * 블랙잭
 */
public class BruteForce1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxValue = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m && sum > maxValue) {
                        maxValue = sum;
                    }
                }
            }
        }
        System.out.print(maxValue);
    }
}

// 풀이 방식으로 생각한 것은 총 n 개의 카드 중에서 3개의 카드를 골라 수를 합하고 m 과 가장 가까운 수를 구하는 것이다.
// 이것을 생각해보면 나열된 n 개의 카드 중 무작위로 3개의 카드를 뽑아 그 합을 구해보고 m 과 가장 가까운 수인지를 판단하면 된다.
// 이전의 알고리즘 문제에서 nCx 문제가 생각 났고 n개 중에서 순서와 상관없이 x 개를 뽑는 알고리즘은
// for 문을 x 번 돌때 시작 범위는 하나씩 증가하고 종료 범위는 하나씩 줄어들면 된다.