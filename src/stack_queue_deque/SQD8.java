package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 11866번
 * 요세푸스 문제 0
 */
public class SQD8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        List<String> list = new ArrayList<>();

        boolean[] arr = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = true;
        }

        int count = 0;
        int idx = 0;

        while (list.size() != N) {
            idx = idx % N;

            if (arr[idx] && ++count == K) {
                list.add(String.valueOf(idx + 1));
                arr[idx] = false;
                count = 0;
            }

            idx++;
        }

        String result = "<" + String.join(", ", list) + ">";
        System.out.print(result);
    }
}
