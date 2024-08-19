package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 24060번
 * 알고리즘 수업 - 병합 정렬 1
 */
public class Recursion4 {

    private static List<Integer> bucket = new ArrayList<>();

    private static int[] sortedArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        sortedArr = new int[N];

        mergeSort(arr, 0, N - 1);

        if (bucket.size() >= K) {
            System.out.print(bucket.get(K - 1));
        } else {
            System.out.print(-1);
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int l = start;
        int r = mid + 1;
        int idx = start;

        while (l <= mid && r <= end) {
            if (arr[l] <= arr[r]) {
                bucket.add(arr[l]);
                sortedArr[idx++] = arr[l++];
            } else {
                bucket.add(arr[r]);
                sortedArr[idx++] = arr[r++];
            }
        }
        while (l <= mid) {
            bucket.add(arr[l]);
            sortedArr[idx++] = arr[l++];
        }
        while (r <= end) {
            bucket.add(arr[r]);
            sortedArr[idx++] = arr[r++];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = sortedArr[i];
        }
    }
}
