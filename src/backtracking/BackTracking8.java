package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 14889번
 * 스타트와 링크
 */
public class BackTracking8 {

    private static int N;
    private static int[][] ability;
    private static List<int[]> combination = new ArrayList<>();
    private static int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ability = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] inputNumbers = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                ability[i][j] = Integer.parseInt(inputNumbers[j]);
            }
        }

        int[] teamBucket = new int[N / 2];
        dfs(teamBucket, 1, 0);

//        for (int[] teams : combination) {
//            System.out.println(Arrays.toString(teams));
//        }

        for (int i = 0; i < combination.size() / 2; i++) {
            int diff = Math.abs(calculate(combination.get(i)) - calculate(combination.get(combination.size() - i - 1)));
            if (diff < minValue) {
                minValue = diff;
            }
        }

        System.out.println(minValue);
    }

    private static void dfs(int[] team, int beforeNum, int depth) {
        if (depth == N / 2) {
            int[] newTeam = Arrays.copyOf(team, team.length);
            combination.add(newTeam);
            return;
        }

        for (int i = beforeNum; i <= N; i++) {
            team[depth] = i;
            dfs(team, i + 1, depth + 1);
        }
    }

    private static int calculate(int[] team) {
        int sum = 0;
        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < team.length; j++) {
                // 배열의 각 요소끼리 조합을 만들기 위해 이중 for 문을 사용했다.
                if (i != j) {
                    int row = team[i] - 1; // (1, 2) 라고 하면 실제 ability 배열의 (0, 1) 을 가리키기 때문에 -1을 붙여준다.
                    int col = team[j] - 1;
                    sum += ability[row][col];
                }
            }
        }
        return sum;
    }

}

// 주어진 N 의 절반 만큼의 조합을 dfs 로 구했다. 이 조합을 잘 살펴보면 처음 찾은 값과 가장 마지막에 찾은 값이 서로 겹치지 않는 팀으로 갈라져 있는 것을 알 수 있다.
// 이것을 활용하면 combination 의 절반으로 나누어 계산을 하고 이 차를 구하면 되는 문제다.
// 계산 부분은 각 팀 즉, 배열의 원소값을 자기 자신을 제외하고 서로 비교를 해야한다.
// 그러므로 이중 for 문에서 i 와 j 가 같은 값을 제외하고 구한다음 ability table 에서 값을 찾아 더하면 된다.