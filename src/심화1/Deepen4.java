package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10988번
 * 팰린드롬인지 확인하기
 */
public class Deepen4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String baseStr = br.readLine();
        String reverseStr = sb.append(baseStr).reverse().toString();
        int result = baseStr.equals(reverseStr) ? 1 : 0;

        System.out.print(result);
    }
}
