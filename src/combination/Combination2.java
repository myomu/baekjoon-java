package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24723번
 * 녹색거탑
 */
public class Combination2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print((int) (2 * Math.pow(2, (N - 1)))); // 등비 수열 ar^(n-1) 공식을 사용
    }
}
