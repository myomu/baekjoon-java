package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 10989번
 * 수 정렬하기 3
 */
public class Sort5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}

// 메모리 초과를 유도하는 문제였으므로 List 구조를 사용하기 보다 배열을 사용하여 푸는 것이 맞았다.
// List 의 경우 메모리 초과가 되어 실패.

