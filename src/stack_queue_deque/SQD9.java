package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 28279번
 * 덱 2
 */
public class SQD9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "1":
                    deque.addFirst(Integer.parseInt(input[1]));
                    break;
                case "2":
                    deque.addLast(Integer.parseInt(input[1]));
                    break;
                case "3":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
                    break;
                case "4":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                    break;
                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "7":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekFirst()).append("\n");
                    break;
                case "8":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
