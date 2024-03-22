package array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2563번
 * 색종이
 */
public class Array4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] paper = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        while (n > 0) {
            String[] input = br.readLine().split(" ");
            int width = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            for (int i = width; i < width + 10; i++) {
                for (int j = height; j < height + 10; j++) {
                    if (paper[i][j] == 0) {
                        paper[i][j] = 1;
                        result++;
                    }
                }
            }
            n--;
        }
        System.out.print(result);
    }
}
