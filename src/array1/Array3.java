package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10818번
 * 최소, 최대
 */
public class Array3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] numbers = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        int maxValue = numbers[0];
        int minValue = numbers[0];

        for (int i = 0; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println(minValue + " " + maxValue);
    }
}
