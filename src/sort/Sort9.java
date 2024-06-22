package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1181번
 * 단어 정렬
 */
public class Sort9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> { return o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2); });
        Object[] array = Arrays.stream(arr).distinct().toArray();

        for (Object o : array) {
            System.out.println(o);
        }
    }
}

// 단순 Arrays.sort 를 이용하지 않고 TreeSet 의 이진 검색 트리 자료구조를 이용하여 정렬하는 방법도 있었다.
// 이때는 사전순으로 정렬을 해주고 이후 글자가 작은 순으로 정렬하는 것은 따로 구현해줘야 한다.
// TreeSet 은 이진 검색 트리의 성능을 향상시킨 '레드-블랙 트리' 로 구현되어 있다고 한다.

