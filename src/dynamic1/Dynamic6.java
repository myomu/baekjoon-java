package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1149번
 * RGB 거리
 */
public class Dynamic6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] homes = new int[N][3];

        for (int i = 0; i < N; i++) {
            homes[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //System.out.println(Arrays.deepToString(homes));
        int[][] dp = new int[N][3];
        for (int i = 0; i < 3; i++) {
            dp[0][i] = homes[0][i];
        }

        for (int i = 1; i < N; i++) {
            dp[i][0] = homes[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = homes[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = homes[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        //System.out.println(Arrays.deepToString(dp));
        int minValue = Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]);
        System.out.print(minValue);
    }

}

// dp 는 주로 배열을 사용해서 이전 값을 저장하고 활용하는 방식을 주로 사용한다.
// 이번 RGB 의 경우 dp 배열을 만들고 1번 인덱스부터는 현재 homes 의 값에 더해 이전의 선택 가능한 값들 중 가장 작은 값을 선택한다.
// 이것이 반복되면 결과적으로 선택한 경로가 만들어지게 되고 마지막 경로에서 가장 작은 값을 선택한다.