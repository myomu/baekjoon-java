package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 25501번
 * 재귀의 귀재
 */
public class Recursion3 {

    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count = 0;
            char[] arr = br.readLine().toCharArray();
            int s = 0;
            int e = arr.length - 1;
            int result = recursion(arr, s, e);
            sb.append(result).append(" ").append(count).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int recursion(char[] arr, int start, int end) {
        count++;
        if (start >= end) {
            return 1;
        }
        if (arr[start] == arr[end]) {
            return recursion(arr, start + 1, end - 1);
        } else {
            return 0;
        }
    }
}
