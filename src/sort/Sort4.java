package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 2751번
 * 수 정렬하기 2
 */
public class Sort4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
            list.add(Integer.parseInt(br.readLine()));
        }
//        Arrays.sort(arr);
        Collections.sort(list);

        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
            bw.write(list.get(i) + "\n");
//            System.out.println(list.get(i));
        }
        bw.flush();
        bw.close();
    }
}

// Arrays.sort() 의 Dual Pivot QuickSort 방식은 O(nlogn) 최악은 O(n^2) 이지만 bufferedwirter를 사용하면 통과는 된다.
// Collections.sort() 는 TimeSort 라는 삽입정렬(InsertSort) 와 병합정렬(MergeSort) 를 결합한 정렬방식을 사용한다. 시간복잡도는 O(nlogn) 이며 이것도 통과는 된다.
