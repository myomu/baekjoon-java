package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10815번
 * 숫자 카드
 */
public class SetAndMap1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nArr);

        for (int i = 0; i < m; i++) {
            int result = Arrays.binarySearch(nArr, mArr[i]);
            if (result >= 0) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}

// Arrays 의 binarySearch 를 이용하지 않고 Map 의 구현체인 HashMap 을 사용하여 푸는 방법이 있다.
// List 자료형에도 contains 라는 메서드를 이용해서 리스트 안에 있는 값을 찾는 방법이 있지만 이 방식은 시간복잡도가 O(n) 이다.
// 그에 비해 HashMap 의 containsKey 메서드는 O(1) 의 시간복잡도를 가져서 이 문제를 푸는데 유용할 것으로 생각된다.
