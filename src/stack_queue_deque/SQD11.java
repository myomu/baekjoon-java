package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 24511번
 * queuestack
 */
public class SQD11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> deque = new ArrayDeque<>();

        String[] result = new String[m];

        // 먼저 A 의 값이 0인 경우 B 의 값을 deque 에 넣어준다.
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                deque.offerLast(b[i]);
            }
        }

        // deque 의 가장 앞에 새로 입력받은 수를 넣고 가장 끝에 있는 수를 결과에 포함시킨다. (이 값이 출력되는 값이다.)
        for (int j = 0; j < m; j++) {
            deque.offerFirst(c[j]);
            result[j] = String.valueOf(deque.pollLast());
        }

        System.out.print(String.join(" ", result));
    }
}

// 시간 초과로 실패했다.
// 생각해보면 이중 for 문을 사용하는데 최악의 경우 100000(N) * 100000(M) 으로 100억에 가깝게 중복이 일어날 것 같다.
// 그렇다면 이중 for 문이 아닌 다른 방법을 생각해야한다.
// 가만히 보면 A 가 0인 경우 수를 교환하고 아니면 그대로 튕겨져 나온다.
// 예시의 큐스택 내부를 바라보면 1 인 자리는 항상 그대로 초기값을 유지하고
// 0 인 자리는 입력된 수에 따라 계속 변화한다.
// 그리고 변화하는 자리를 보면 (새로운 수) -> ... (0번째 자리) ... -> (가장 끝의 0번째 자리는 출력)
// 이런 식으로 보이게 된다. 새로 입력된 수는 기존의 가장 앞에 있는 0 번째 자리의 수를 밀어내고 가장 끝의 0번째 수를 출력하게 된다.

// (수정 후)
// 기존의 코드를 수정하여 이중 for 문을 각 개별의 for 문으로 만들어 최악의 경우에도 100000 * 2 가 되도록 만들어 주었다.