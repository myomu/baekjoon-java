package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 2164번
 * 카드
 */
public class SQD7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            if (count % 2 != 0) {
                queue.poll();
            } else {
                queue.offer(queue.poll());
            }
            count++;
        }

        System.out.print(queue.peek());
    }
}
