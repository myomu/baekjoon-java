package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 25305번
 * 커트라인
 */
public class Sort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[1]);
        Integer[] arr = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print(arr[k-1]);
    }
}
