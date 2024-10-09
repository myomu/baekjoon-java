package backtracking;

import java.io.*;

/**
 * 9663번
 * N-Queen
 */
public class BackTracking5 {

    private static int[] column; // 열(column) - 행(row) 의 집합으로 생각해둔다. 배열 안의 원소값이 행(row) 이다.
    private static int count = 0; // 경우의 수
    private static int N; // 판의 size

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        column = new int[N];
        nQueen(0);
        System.out.print(count);
    }

    private static void nQueen(int depth) {
        if (depth == N) { // depth (y) 는 열의 순서라고 보면 된다. 1씩 증가하여 최종적으로 판의 size 만큼 도달
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            column[depth] = i; // 행의 값 (x). 아래의 if 문을 통과하고 checkVisited 함수의 재귀가 끝나면 자동적으로 이 값은 덮어씌워지게 된다.
            // 열의 집합 즉, 행들 가운데 놓을 수 있는 곳을 검사한다.
            if (checkVisited(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    private static boolean checkVisited(int col) {

        for (int i = 0; i < col; i++) {
            // 같은 행에 존재할 경우 false. 즉, 앞에서 정한 행의 값과 중복되면 안된다.
            if (column[col] == column[i]) {
                return false;
            }
            /*
            대각선상 검증(열의 차와 행의 차가 같은 경우 => 대각선에 놓여 있다.)
            abs 로 절대값을 넣는 이유.
            (3, 1) (2, 2) 는 대각선이다 (3-2 == 1-2) 이렇게 되면 (1 == -1) 이라는 결과가 나오기 때문에 이를 보정하기 위해 절대값을 넣는다.
            */
            if (Math.abs(col - i) == Math.abs(column[col] - column[i])) {
                return false;
            }
        }

        return true;
    }
}