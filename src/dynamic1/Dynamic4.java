package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9461번
 * 파도반 수열
 */
public class Dynamic4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] arr = new long[100];
        arr[0] = arr[1] = arr[2] = 1;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N - 1]).append("\n");
        }

        System.out.print(sb.toString());
    }

}
