package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2447번
 * 별 찍기 - 10
 */
public class Recursion6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] stars = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                stars[i][j] = '*';
            }
        }

        drawStar(stars, 0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(new String(stars[i])).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void drawStar(char[][] stars, int rowStart, int columnStart, int n) {
        if (n > 1) {
            //System.out.println("rowStart = " + rowStart + ", columnStart = " + columnStart + ", n = " + n);
            int range = n / 3;
            deleteStar(stars, rowStart, columnStart, n);
            for (int i = rowStart; i < rowStart + n; i += range) {
                for (int j = columnStart; j < columnStart + n; j += range) {
                    drawStar(stars, i, j, n / 3);
                }
            }
        }
    }

    private static void deleteStar(char[][] stars, int row, int column, int n) {
        int range = n / 3;
        for (int i = row + range; i < row + (range * 2); i++) {
            for (int j = column + range; j < column + (range * 2); j++) {
                stars[i][j] = ' ';
            }
        }
    }

}

// 다른 사람 풀이에서는 중앙 즉, 5번째에서 공백을 만드는 방식으로 진행하는 풀이가 있었다.
// 나의 경우 그런 것은 무시하고 지웠던 곳도 다시 지우는 작업을 반복하여 효율적이지 못한 부분도 있음.
