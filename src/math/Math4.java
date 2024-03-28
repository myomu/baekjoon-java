package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2903번
 * 중앙 이동 알고리즘
 */

//1 -> 4 -> 16 -> 64 // k = 4 * n, (sprt(k) + 1) * 2
public class Math4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 4;

        for (int i = 0; i < n; i++) {
            int boxPoint = (int) Math.pow(4, i); //칸에 찍히는 점의 개수
            int linePoint = (int) (((Math.sqrt(boxPoint) + 1) * (Math.sqrt(boxPoint))) * 2); //가로 세로에 찍히는 점의 개수
            result += boxPoint + linePoint;
        }
        System.out.print(result);
    }
}
