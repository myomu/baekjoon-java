package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2156번
 * 포도주 시식
 */
public class Dynamic11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                dp[i] = arr[i];
            } else if (i == 1) {
                dp[i] = arr[0] + arr[1];
            } else if (i == 2) {
                dp[i] = Math.max(dp[i - 1], Math.max(arr[0] + arr[i], arr[1] + arr[i]));
            } else {
                dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]));
            }
        }

        //System.out.println(Arrays.toString(dp));

        System.out.print(dp[N - 1]);
    }

}

// 연속으로 놓여 있는 3잔을 마실 수 없으므로 바로 직전의 잔을 마시기 위해선 2번째 전의 잔을 마시지 않아야한다.
// 두번째 전의 잔을 마신다고 가정했을땐 두번째 전의 누적된 포도주 양을 더하면 된다.
// 각 잔의 순서대로 나열되어 있다면, 해당 순서의 잔을 반드시 마신다는 가정 하에, 가장 많은 양의 포도주를 마시는 값을 dp 에 저장한다.
// 예를 들어, 6, 10, 13, 9, 8, 1 에서 네번째 잔을 기준으로 하면 6, 10, 13, 9 가 놓여있다고 가정하자
// 9라는 양의 잔은 반드시 마셔야 하고, 직전인 13이라는 양을 마시기 위해선 2번째 잔의 양인 10을 마셔선 안된다.
// 그러므로 6 + 9 가 될 것이다. 이것은 즉, dp[i - 3] + arr[i - 1] 이 된다.
// 직전의 잔을 마시지 않는다면 2번째 잔의 누적된 양을 더하면 된다. dp[i - 2] 가 된다.
// 위 두 조건중 큰 값을 더해간다면 각 잔의 순서에 따른 최대로 마실 수 있는 포도주의 양을 볼 수 있다.
// 결과는 만들어진 dp 배열 중 가장 큰 값을 구하면 된다.
// 문제에서 2% 에서 틀린다. 전에 있었던 계단 문제에서는 마지막 칸을 반드시 밟아야 했지만 포도주는 그런 조건이 없다.
// 그러므로 현재 순서의 포도주를 마시지 않는다는 조건을 넣어야 한다.
// dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i]; 이 부분을
// dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i])); 이렇게 고쳐준다.
// i 가 2 일때, dp[i] = Math.max(dp[i - 1], Math.max(arr[0] + arr[i], arr[1] + arr[i])); 1번째잔, 2번째잔 의 합이 더 클 수 있으므로 이렇게 해준다.

