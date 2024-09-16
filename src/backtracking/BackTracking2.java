package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 15650번
 *  N과 M (2)
 */
public class BackTracking2 {

    private static boolean[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        visited = new boolean[N + 1];
        sb = new StringBuilder();
        dfs(0, N, M);
    }

    private static void dfs(int beforeNum, int n, int m) {
        // m = 0 일때 (즉, value 에 수가 4개가 되었을 때) 결과에 추가한다.
        if (m == 0) {
            System.out.println(sb.toString().trim());
        }

        // m 이 0 이 아닐 때 for 문을 m 만큼 반복하도록 재귀를 이용한다.
        if (m > 0) {
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && i > beforeNum) {
                    visited[i] = true;
                    sb.append(i).append(" ");
                    dfs(i, n, m - 1);
                    sb.delete(sb.length() - 2, sb.length());
                    visited[i] = false;
                }
            }
        }
    }
}

// 방문한 곳은 visited = true; 로 바꿔준다. 그리고 방문을 다 했으면 다시 visited = false; 로 바꿔준다.
// 출력하는 것을 StringBuilder 로 구현했는데 노드의 가장 깊은 곳에 방문하고 다시 나오게 되면 되감기 하듯 다시 StringBuilder 에 저장한 값들을 빼줘야 한다.
// 공백을 포함하여 수를 제거해 주어야하니 sb.length() - 2 부터 sb.length() 까지 delete 한다.

// visited 를 사용하지 않고 i > beforeNum 비교 또한 하지 않고도 구현이 가능하다. beforeNum + 1 을 int i 의 시작으로 하면 된다.