package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 2108번
 * 통계학
 */
public class Deepen4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] bucket = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            bucket[i] = n;
            map.put(n, map.getOrDefault(n, 0) + 1);
            treeSet.add(n);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        //keySet.sort((o1, o2) -> map.get(o2) - map.get(o1)); // 이러면 value 가 같은 값에 대해서는 정렬을 해주지 못한다. 아래와같이 하면 value 가 같으면 key 값의 오름차순으로 정렬해준다.
        keySet.sort((o1, o2) -> (map.get(o2).equals(map.get(o1))) ? o1.compareTo(o2) : map.get(o2) - map.get(o1));

        Arrays.sort(bucket);

        long avg = Math.round((double) sum / N);
        int median = bucket[(N - 1) / 2];
        int low;
        if (keySet.size() == 1) {
            low = keySet.get(0);
        } else {
            low = map.get(keySet.get(0)).equals(map.get(keySet.get(1))) ? keySet.get(1) : keySet.get(0);
        }

        int range = treeSet.last() - treeSet.first();

        System.out.println(avg);
        System.out.println(median);
        System.out.println(low);
        System.out.print(range);

    }
}

// 최빈값을 구하는 것이 핵심으로 보인다. Map<Integer, Integer> 로 해서 key 값이 존재하면 value 에 +1 을 하고 map 을 순회하며 가장 value 가 높은 key 를 출력하면 되지 않을까?
// 단, 모든 값이 동일하다면 두번째로 작은 값을 뽑아야 하므로 이를 염두해 두어야 한다. 그러면 정렬이 필요한데.. TreeMap 을 사용하면 순서가 보장되므로 이것을 사용해보자.