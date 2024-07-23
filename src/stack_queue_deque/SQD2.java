package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 10773번
 * 제로
 */
public class SQD2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0 && !stack.isEmpty()) {
                result -= stack.pop();
            } else {
                stack.push(input);
                result += input;
            }
        }
        System.out.print(result);
    }
}
