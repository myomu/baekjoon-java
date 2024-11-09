package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2579번
 * 계단 오르기
 */
public class Dynamic8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[301];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[301];
        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(arr[0], arr[1]) + arr[2];

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(arr[i - 1] + dp[i - 3], dp[i - 2]) + arr[i];
        }

        //System.out.println(Arrays.toString(dp));
        System.out.print(dp[N - 1]);
    }

}

// 연속해서 세 칸을 밟지 못한다. 두 칸을 밟으면 반드시 한 칸을 건너뛰어야 한다.
// 전체적으로 이득을 보려면 항상 두 칸씩 가는 것은 손해를 보게되어있다. 두 칸을 밟을 수 있으면 밟는 것이 이득이다.
// 이것을 풀어 생각하면 바로 직전의 칸을 더하는 경우, 두 칸과 세 칸의 값을 더하는 경우 <- 이 두 가지로 나눠볼 수 있다.
// 끝 칸이 N 이라면 직전의 값을 더하려면 직전 값 + 세 칸 전의 경로의 합 을 더한 값이 되고
// 두 칸 전의 값을 더하려면 그 경로의 합을 더한 값을 더하면 된다.
// N 이 6이면 5, 3(2 또는 1 을 더한 것중 큰 값) 을 더한 것과 4 중 큰 값을 더하면 된다.