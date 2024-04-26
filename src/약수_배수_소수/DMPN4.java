package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1978번
 * 소수 찾기
 */
public class DMPN4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int result = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(input[i]);
            int count = 0;
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                } else if (count > 2) {
                    break;
                }
            }
            if (count == 2) result++;
        }
        System.out.print(result);
    }
}
