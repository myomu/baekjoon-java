package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1912번
 * 연속합
 */
public class Dynamic5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxValue = -1001;
        int sum = 0;
        for (int i = 0; i < N; i++) {

            sum += arr[i];
            if (sum > maxValue) {
                maxValue = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.print(maxValue);

        /*int[][] dp = new int[N][N];
        int maxValue = -1001;

        for (int i = 0; i < N; i++) {
            dp[0][i] = arr[i];
            maxValue = Math.max(maxValue, dp[0][i]);
        }

        for (int i = 1; i < N; i++) {
            int[] temp = new int[N - i];
            for (int j = i; j < N; j++) {
                dp[i][j] = dp[i - 1][j - 1] + arr[j];
                maxValue = Math.max(maxValue, dp[i][j]);
            }
        }

        //System.out.println(Arrays.deepToString(dp));
        System.out.print(maxValue);*/
    }

}
