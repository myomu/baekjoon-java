package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3003번
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class Deepen2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            int result = arr[i] - Integer.parseInt(input[i]);
            System.out.print(result + " ");
        }
    }

}
