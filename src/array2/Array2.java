package array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2566번
 * 최댓값
 */
public class Array2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[9][9];
        int maxValue = 0;
        int n = 0;
        int m = 0;

        for (int i = 0; i < 9; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(line[j]);
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    n = i;
                    m = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.print((n + 1) + " " + (m + 1));
    }
}
