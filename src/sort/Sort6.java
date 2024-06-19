package sort;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * 1427번
 * 소트인사이드
 */
public class Sort6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] arr = Arrays.stream(br.readLine().split("")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for (Integer integer : arr) {
            sb.append(integer);
        }

        System.out.print(sb);
    }
}

