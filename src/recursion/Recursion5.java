package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4779번
 * 칸토어 집합
 */
public class Recursion5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int N = Integer.parseInt(input);
            int num = (int) Math.pow(3, N);
            char[] arr = new char[num];
            for (int i = 0; i < num; i++) {
                arr[i] = '-';
            }

            divide(arr, 0, arr.length -1); // index 위주로

            String str = new String(arr);
            sb.append(str).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void divide(char[] arr, int start, int end) {
        if (start < end) {
            int b1 = start + ((end - start) / 3) + 1; //1 3
            int b2 = b1 + ((end - start) / 3); //1 5
            divide(arr, start, b1 - 1); // 0, 0 / 0, 2
            delete(arr, b1, b2); // 1, 1 / 3, 5
            divide(arr, b2 + 1, end); // 2, 2 / 6, 8
        }
    }

    private static void delete(char[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            arr[i] = ' ';
        }
    }
}
