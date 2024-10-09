package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 2580번
 * 스도쿠
 */
public class BackTracking6 {

    private static int[][] sudokuNumbers;
    private static List<int[]> zeroList;
    private static boolean done;

    public static void main(String[] args) throws IOException {

        sudokuNumbers = new int[9][9];
        zeroList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudokuNumbers[i][j] = Integer.parseInt(input[j]);
                if (sudokuNumbers[i][j] == 0) {
                    zeroList.add(new int[]{i, j});
                }
            }
        }

        sudoku(0);
    }

    private static void printSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudokuNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sudoku(int depth) {

        if (done) return;

        if (depth == zeroList.size()) {
            printSudoku(); // 최종적으로 결과를 찾았을 때 출력 한번 한다.
            // 만약 최종적으로 한판을 찾았는데 다시 이전 depth 로 돌아가 for 문을 돌렸더니 두번째 맞는 판을 찾게 된다면
            // 다시 또 출력을 하는 문제가 발생할 듯? 이것을 방지하기 위해 done 변수를 추가.
            done = true;
            return;
        }

        int row = zeroList.get(depth)[0];
        int col = zeroList.get(depth)[1];

        for (int i = 1; i <= 9; i++) {
            sudokuNumbers[row][col] = i;
            if (isChecked(row, col)) {
                // 값을 찾으면 다음으로 계속 넘어가는데 결국 최종적으로 값을 찾으면 다시 return 으로 종료되고
                // 이후 for 문은 돌아가므로 모든 루프가 돌고 출력을 하면 모든 0->9로 치환되어 보여지게 되는 문제가 발생.
                // 일단 최종적으로 찾았을 때 출력을 한번 하는 것으로 진행.
                sudoku(depth + 1);
            }
            sudokuNumbers[row][col] = 0; // 끝까지 값을 찾지 못하면 다시 0으로 초기화를 해줘야 한다.
        }

    }

    private static boolean isChecked(int row, int col) {

        for (int i = 0; i < 9; i++) {
            // column 체크 (같은 열 중복 찾기)
            if (i != row && sudokuNumbers[i][col] == sudokuNumbers[row][col]) {
                return false;
            }
            // row 체크 (같은 행 중복 찾기)
            if (i != col && sudokuNumbers[row][i] == sudokuNumbers[row][col]) {
                return false;
            }
        }

        // 9x9 칸 내부에서 중복 찾기
        // 시작점
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);

        // 종착점
        int endRow = startRow + 2;
        int endCol = startCol + 2;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (i != row && j != col && sudokuNumbers[i][j] == sudokuNumbers[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

}

// 다른 사람의 풀이를 보니 sudoku 메서드의 리턴 타입을 void 가 아닌 boolean 으로 해서 return 값을 주고 있다. 최종적으로 값을 도출하면 true 를 반환하고
// 또 반환된 값이 true 이면 다시 true 를 반환하여 다음 코드가 실행되지 않게하여 단 한번만 최종 결과를 출력하는 효과 또한 가질 수 있게 된다.
// 나의 경우 값을 넣고 검증을 진행하는 방식을 사용했지만 다른 사람은 값을 검증 후 sudoku 에 값을 넣는 방식으로 진행하더라.