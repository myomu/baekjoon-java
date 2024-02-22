package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5597번
 * 과제 안 내신 분..?
 */
public class Array7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            int num = i + 1;
            if (arr[i] == 0) {
                System.out.println(num);
            }
        }
    }
}
