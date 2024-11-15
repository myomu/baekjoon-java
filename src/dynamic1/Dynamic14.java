package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 2565번
 * 전깃줄
 */
public class Dynamic14 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            map.put(A, B);
        }

        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) {
            list.add(map.get(i));
        }

        int[] left = new int[N];
        int[] right = new int[N];

        //System.out.println(list);
        // i 를 기준으로 왼쪽의 증가하는 부분 수열 중 가장 큰 값을 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) > list.get(j)) {
                    left[i] = Math.max(left[i], left[j]);
                }
            }
            left[i]++;
        }

        // i 를 기준으로 오른쪽의 증가하는 부분 수열 중 가장 큰 값을 찾기
        for (int i = N - 1; i >= 0; i--) {
            for (int k = N - 1; k > i; k--) {
                if (list.get(i) < list.get(k)) {
                    right[i] = Math.max(right[i], right[k]);
                }
            }
            right[i]++;
        }

        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = left[i] + right[i] - 1;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int passValue : result) {
            maxValue = Math.max(maxValue, passValue);
        }
        System.out.print(N - maxValue);
    }
}

// 전기줄이 겹치치 않으려면 어떤 조건이 있어야하나 생각해보자.
// A 의 번호를 순차적으로 조회하면서 연결된 전깃줄을 살펴보자.
// 1-8, 3-9, 10-10 은 겹치지 않는다. 4-1, 6-4, 7-6, 9-7, 10-10 은 겹치지 않는다.
// 이처럼 A 의 번호를 순차적으로 조회할때 현재 조회한 A 가 i 번이라고 하자. 그리고 i 번에 연결된 B 의 위치를 j 번이라고 하자.
// 이때, 다음에 올 i+1 이후의 번호들이 연결된 B 의 위치는 항상 j 번 보다 큰 값을 가져야한다.
// 단, i 의 이전도 고려해야한다. i-1 이전의 번호들이 연결된 B 의 위치는 항상 j 번 보다 작은 값을 가져야한다.
// 이것을 생각하면 (제거할 전깃줄의 최소 개수) = (총 전깃줄의 수) - (위 조건을 만족하는 전깃줄의 수) 가 될 것이다.

// 위 방식대로는 안된다.
// 이전 13번 문제와 같이 전깃줄 순번 모양을 옆으로 눕혀서 보면 나열된 수열로 보일 것이다.
// A의 위치는 index로 보면 되고, B의 위치는 값으로 보자.
// 배열을 하나 만들고 A 의 순서대로 B의 값을 가지는 배열을 만든다.
// 앞에서부터 순차적으로 읽어 증가하는 dp 를 만들고, 뒤에서부터 순차적으로 읽어 감소하는 dp 를 만들어두자.
// 그다음 앞에서 차례대로 읽으면서 기준점을 만들고 기준점의 앞, 뒤 중 가장 작은 dp 를 찾고 더하면 될 것이다.
// 통과 가능한 개수를 dp 에 저장함으로 result 배열은 A의 위치의 전선이 반드시 연결되어있다는 것을 가정하고 나머지 전기줄이 교차하지 않도록 통과 가능한 최대의 전선 수를 말한다.
// 이것을 생각하면 (제거할 전깃줄의 최소 개수) = (총 전깃줄의 수) - (위 조건을 만족하는 전깃줄의 수) 가 될 것이다.

// TreeMap 을 사용하여 key 를 기준으로 정렬을 한 것을 사용했는데 다른 사람 풀이를 보니 좀 더 같편한 방식이 있었다.
// int[][] 같은 이차원 배열을 만들고 Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]) 으로 하면 0번째 인덱스를 기준으로 정렬이 된다. 즉, A의 위치를 기준으로 정렬된다.
// 그리고 left, right 를 나눌 필요 없이 left 하나 만으로 계산을 진행해도 된다.
