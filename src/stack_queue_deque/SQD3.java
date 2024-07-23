package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9012번
 * 괄호
 */
public class SQD3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int result = 0;
            String[] input = br.readLine().split("");

            for (String s : input) {
                if (result < 0) {
                    break;
                }
                if (s.equals(("("))) {
                    result += 1;
                } else {
                    result -= 1;
                }
            }

            if (result == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
}
