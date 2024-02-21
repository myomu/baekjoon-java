
package 반복문;

import java.io.*;

/**
 * 2438번
 * 별 찍기 - 1
 */
public class Repeat9 { //StringBuilder 로 출력물을 모아서 한번만 출력하는 식으로 한다면 Scanner 와 System.out.print()를 사용해도 통과한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
