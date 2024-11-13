package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 11053번
 * 가장 긴 증가하는 부분 수열
 */
public class Dynamic12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] dp = new int[N];
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            int maxDp = 0;
            int nowValue = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] < nowValue && dp[j] > maxDp) {
                    maxDp = dp[j];
                }
            }
            dp[i] = maxDp + 1;
        }
        //System.out.print(Arrays.toString(dp));
        int result = 0;
        for (int value : dp) {
            if (value > result) {
                result = value;
            }
        }
        System.out.print(result);
    }

}

// 앞에서부터 순차적으로 수를 읽어온다. 해당 순서의 수보다 앞선 순서 중에서 작은 수들을 찾는다. 이 작은 수 중 가장 큰 dp 값을 찾는다.
// 찾은 dp의 값은 현재 순서의 값보다 항상 작고 누적된 수들 또한 작은 수들로 이루어져 있을 것이다.
// 그러므로 dp[i] = 찾은 dp 값 + 1; 이 될 것이다.

