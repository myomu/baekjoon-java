package sort;

import java.io.*;
import java.util.*;

/**
 * 18870번
 * 좌표 압축
 */
public class Sort11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list1 = new ArrayList<>();
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            list1.add(Integer.parseInt(input[i]));
        }

        TreeSet<Integer> treeSet = new TreeSet<>(list1);
        int[] arr = treeSet.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < n; i++) {
            bw.write(Arrays.binarySearch(arr, list1.get(i)) + " ");
        }
        bw.flush();
        bw.close();
    }
}

// list2 = list2.stream().distinct().toList(); // ImmutableCollections java11 에선 없는듯?? -> toList 가 문제였다.

// 시간 초과가 나오는 이유..
// bufferedWriter 를 사용하여 조금 줄임.
// TreeSet 을 이용한 정렬은 시간이 많이 걸리려나? -> 문제 없음.
// 문제는 indexOf 로 list 의 위치 값을 찾는 것이 오래 걸린다는 것이었다. 이 문제를 해결하기 위해서 Arrays 의 binarySearch 를 사용하여 시간을 줄일 수 있었다.