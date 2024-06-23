package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10814번
 * 나이순 정렬
 */
public class Sort10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = input[0];
            arr[i][1] = input[1];
        }
        Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

