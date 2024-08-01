package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 28279번
 * 덱 2
 */
public class SQD10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<int[]> deque = new ArrayDeque<>(); // LinkedList 가 아닌 ArrayDeque 를 사용하면 메모리 초과가 되지 않는 것을 확인.
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            int[] temp = { (i + 1), numbers[i] }; // deque 에 int 배열을 넣어서 0번 자리는 풍선의 위치를, 1번 자리는 이동할 번호가 들어가게 만들어 준다.
            deque.offer(temp);
        }

        while (!deque.isEmpty()) {
            int index = deque.peekFirst()[0]; // 터뜨릴 풍선의 위치를 가져온다.
            int num = deque.pollFirst()[1]; // 터뜨릴 풍선 속 이동할 번호를 가져온다.

            // 터뜨릴 번호가 같다면 이렇게 찾으면 안된다. 항상 가장 먼저 찾는 수가 나오기 때문.
            /*for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == num) {
                    sb.append(i + 1).append(" ");
                    break;
                }
            }*/

            sb.append(index).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            if (num > 0) {
                for (int i = 0; i < num - 1; i++) { // 풍선에서 나온 번호의 -1 번 반복하여 다음 터뜨릴 풍선이 가장 앞에 오게 한다.
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(num); i++) { // num 이 음수일 경우 반대로 회전하는 것은 나온 번호만큼 해야 한다.
                    deque.offerFirst(deque.pollLast()); // -3 -1 2 1 / -1 2 1 / 1 -1 2 / 2 1 -1 / -1 2 1
                }
            }
        }

        String result = sb.toString();
        System.out.print(result);
    }
}

// Deque 의 구현체가 LinkedList 일 때 메모리 초과가 나오게 되었다.
// 그러나 구현체를 ArrayDeque 로 변경하니 메모리 초과는 나오지 않는다.

// 반례로 4 / 2 2 2 2 를 입력했을 때 틀렸다고 나온다.
// 위 반례로 인하여 뭐가 틀렸는지 알게 되었고 deque 에 int 배열을 넣어 해결했다.