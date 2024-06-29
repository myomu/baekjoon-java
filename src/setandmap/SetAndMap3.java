package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 7785번
 * 회사에 있는 사람
 */
public class SetAndMap3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (!map.containsKey(input[0])) {
                map.put(input[0], input[1]);
            } else {
                map.replace(input[0], input[1]);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort(Collections.reverseOrder());

        for (String key : keySet) {
            if (map.get(key).equals("enter")) {
                System.out.println(key);
            }
        }
    }
}

// 처음에 keySet.sort(Collections.reverseOrder()); <- 이 부분을 Collections.reverse(keySet) 으로 했었기에 틀렸었다.
// Collections.reverse(keySet) 은 들어가있는 list 의 값들을 단순히 역순으로 정렬해줄뿐 사전순이나 사전의 역순으로 정렬해 주지 않는다.
// 나는 Map 을 이용하여 풀었지만 중복을 제거하는 방식에서 Set 을 사용하는 사람들이 있었다.

