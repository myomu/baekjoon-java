package array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10798번
 * 세로읽기
 */
public class Array3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[15];
        Arrays.fill(arr, "");

        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < input.length; j++) {
                arr[j] += input[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s.isEmpty()) {
                break;
            }
            sb.append(s);
        }
        System.out.print(sb);
    }
}
