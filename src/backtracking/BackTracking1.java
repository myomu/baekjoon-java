package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 15649번
 *  N과 M (1)
 */
public class BackTracking1 {

    private static Set<Integer> temp = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        picker("", N, M);
    }

    private static void picker(String value, int n, int m) {
        // m = 0 일때 (즉, value 에 수가 4개가 되었을 때) 결과에 추가한다.
        if (m == 0) {
            System.out.println(value.trim());
        }
        // m 이 0 이 아닐 때 for 문을 m 만큼 반복하도록 재귀를 이용한다.
        // 이때, 임시의 set 객체인 temp 를 이용하여 이미 선택된 값은 다시 선택하지 않도록 한다.
        // 이후 다시 temp 에 담아둔 수를 제거함으로 이전 단계의 picker 의 for 문에서 해당 수를 허용하게 한다.
        if (m > 0) {
            for (int i = 1; i <= n; i++) {
                if (!temp.contains(i)) {
                    temp.add(i);
                    picker(value + " " + i, n, m - 1);
                    temp.remove(i);
                }
            }
        }
    }

}

// 다른 사람 풀이를 보면 DFS 깊이 우선 탐색 알고리즘을 사용하여 푼 방식도 있다.
