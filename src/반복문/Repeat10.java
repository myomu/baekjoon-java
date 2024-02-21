
package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2439번
 * 별 찍기 - 2
 */
public class Repeat10 { //StringBuilder 로 출력물을 모아서 한번만 출력하는 식으로 한다면 Scanner 와 System.out.print()를 사용해도 통과한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                sb.append(" ");
            }

            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        String result = sb.toString();
        System.out.print(result);
    }
}
