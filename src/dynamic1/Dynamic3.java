package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1904번
 * 01타일
 */
public class Dynamic3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < N; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
        }
        System.out.print(arr[N - 1]);
    }

}
