package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 4949번
 * 균형잡힌 세상
 */
public class SQD4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals(".")) {
            String[] arr = input.split("");
            boolean result = true;
            for (String s : arr) {
                if (s.equals("(") || s.equals("[")) {
                    stack.push(s);
                } else if (s.equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                } else if (s.equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        result = false;
                        break;
                    }
                }
            }
            if (result && stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
            stack.clear();
        }

        System.out.print(sb.toString());
    }
}
