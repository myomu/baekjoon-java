package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 10871번
 * X보다 작은 수
 */
public class Array2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num < x) {
                if (i == n - 1) {
                    sb.append(num);
                    break;
                } else {
                    sb.append(num).append(" ");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
