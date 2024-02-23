package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 10811번
 * 바구니 뒤집기
 */
public class Array9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            for (int pre = start; pre <= (start+end)/2; pre++) {
                int temp = arr[pre];
                int post = (end + start) - pre;
                arr[pre] = arr[post];
                arr[post] = temp;
            }
        }

        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(" ", strArr);
        System.out.println(result);

    }

}
