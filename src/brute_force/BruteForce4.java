package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1018번
 * 체스판 다시 칠하기
 */
public class BruteForce4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        String[][] arr = new String[n][m];
        int count = 65;

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split("");
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                String[][] copyArr1 = new String[8][8];
                String[][] copyArr2 = new String[8][8];
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        copyArr1[k][l] = arr[k + i][l + j];
                        copyArr2[k][l] = arr[k + i][l + j];
                    }
                }

                count = Math.min(count, Math.min(paintColor("W", copyArr1, i, j), paintColor("B", copyArr2, i, j)));
            }
        }
        System.out.print(count);
    }

    private static int paintColor(String startColor, String[][] arr, int row, int column) {
        int count = 0;
        if (!arr[0][0].equals(startColor)) {
            count++;
        }
        arr[0][0] = startColor;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length - 1; j++) {
                if (arr[i][j].equals("W")) {
                    if (arr[i][j + 1].equals("W")) {
                        arr[i][j + 1] = "B";
                        count++;
                    }
                    if (i != arr.length - 1 && arr[i + 1][j].equals("W")) {
                        arr[i + 1][j] = "B";
                        count++;
                    }
                } else if (arr[i][j].equals("B")) {
                    if (arr[i][j + 1].equals("B")) {
                        arr[i][j + 1] = "W";
                        count++;
                    }
                    if (i != arr.length - 1 && arr[i + 1][j].equals("B")) {
                        arr[i + 1][j] = "W";
                        count++;
                    }
                }
            }
        }

        return count;
    }

}

// arr[i][j] 에서 (i + j) % 2 == 0 이라는 조건으로 체스판의 인접하지 않은 위치를 구할 수 있다.
// 예를들어 시작이 Black 이면 BWBWBWBW 인데 0,0 -> 짝수로 Black / 0,1 -> 홀수로 White 이런식으로 구분이 가능하다.
// 이것을 이용하면 굳이 배열을 복사하지 않아도 바꿔야하는 색을 구분해서 셀 수 있다.
// 아래는 다른 사람의 풀이
/*
* public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        char[][] chess_board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                chess_board[i][j] = row.charAt(j);
            }
        }
        int value = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                value = Math.min(value, calc(chess_board, i, j));
            }
        }

        System.out.println(value);
    }

    private static int calc(char[][] board, int x, int y) {
        int white = 0;
        int black = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];
                if ((i + j) % 2 == 0) {
                    if (current != 'W') white++;
                } else {
                    if (current != 'B') white++;
                }
                if ((i + j) % 2 == 0) {
                    if (current != 'B') black++;
                } else {
                    if (current != 'W') black++;
                }
            }
        }
        return Math.min(white, black);
    }
* */