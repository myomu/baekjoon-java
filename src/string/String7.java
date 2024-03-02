package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2675번
 * 문자열 반복
 */
public class String7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] arr = br.readLine().split(" ");
            int r = Integer.parseInt(arr[0]);
            String[] strArr = arr[1].split("");

            for (String s : strArr) {
                sb.append(s.repeat(r));
            }
            if (i != t-1) sb.append("\n");
        }
        System.out.print(sb);
    }
}
