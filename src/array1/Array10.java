package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 10811번
 * 바구니 뒤집기
 */
public class Array10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        double[] arr = Arrays.stream(strArr).mapToDouble(Double::parseDouble).toArray();
        double maxValue = arr[0];
        double sum = 0;
        double average;

        for (double num : arr) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        for (double num : arr) {
            sum += num / maxValue;
        }

        average = sum / n * 100;
        System.out.println(average);
    }

}
