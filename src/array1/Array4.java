package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2562번
 * 최댓값
 */
public class Array4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = 0;
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > maxValue) {
                maxValue = num;
                index = i;
            }
        }

        System.out.println(maxValue);
        System.out.println(index);
    }
}
