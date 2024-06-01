package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2231번
 * 분해합
 */
public class BruteForce2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int start;

        if (n >= 100) {
            start = n - input.length() * 9;
        } else {
            start = 1;
        }

        for (int i = start; i < n; i++) {
            int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
            int result = i + sum;
            if (result == n) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}

// 시작 점을 추가하여 시간과 메모리 양을 줄였음.
// 각 수를 합할 때 최대값을 생각해보면 세 자리 수면 999 -> 9*3=27 이 됨으로 N 값에서 -27 을 하면 분해합의 최소 시작점이 된다고 생각하였음.

/* // 수행 시간이 길고 메모리를 많이 먹음.
* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        for (int i = 1; i < n; i++) {
            int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
            int result = i + sum;
            if (result == n) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
*/