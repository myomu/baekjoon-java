package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3052번
 * 나머지
 */
public class Array8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42];
        int result = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remain = num % 42;
            arr[remain] += 1;
        }

        for (int num : arr) {
            if (num != 0) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
