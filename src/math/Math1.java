package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2745번
 * 진법 변환
 */
public class Math1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String n = input[0];
        int b = Integer.parseInt(input[1]);
        int result = 0;
        int i = n.length() - 1;

        for (char num : n.toCharArray()) {
            int changeNum = (Character.isDigit(num)) ? (num - 48) : (num - 55);
            result += (int) (changeNum * (Math.pow(b, i)));
            i--;
        }
        System.out.println(result);
    }
}
