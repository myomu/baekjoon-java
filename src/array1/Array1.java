package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10807번
 * 개수 세기
 */
public class Array1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int integer = Integer.parseInt(br.readLine());
        int result = 0;

        for (String input : inputs) {
            if (integer == Integer.parseInt(input)){
                result++;
            }
        }

        System.out.print(result);
    }
}
