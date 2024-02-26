package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9086번
 * 문자열
 */
public class String3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            sb.delete(0, sb.length());
            sb.append(arr[0]).append(arr[arr.length-1]);
            result[i] = sb.toString();
        }

        for (String str : result) {
            System.out.println(str);
        }
    }
}
