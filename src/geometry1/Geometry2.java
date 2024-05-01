package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1085번
 * 직사각형에서 탈출
 */
public class Geometry2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int[] arr = new int[4];
        arr[0] = w - x;
        arr[1] = h - y;
        arr[2] = x;
        arr[3] = y;
        Arrays.stream(arr).min().ifPresent(System.out::print);
    }
}
