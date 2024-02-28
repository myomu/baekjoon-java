package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 11720번
 * 숫자의 합
 */
public class String5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }
}

//String.charAt(i) - '0' 을 사용하는 경우가 많았음. char 끼리 연산을 시행시 int로 형변환 되어 아스키코드의 number로 변하여 계산됨.
