package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 19532번
 * 수학은 비대면강의입니다
 */
public class BruteForce3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);
        int x = 0;
        int y = 0;

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i + b * j) == c && (d * i + e * j) == f) {
                    x = i;
                    y = j;
                    System.out.print(x + " " + y + " ");
                }
            }
            System.out.println("i=" + i);
        }

        System.out.print(x + " " + y);
    }
}

// 모든 경우의 수를 찾는 것 외에도 그냥 수학 식을 이용해서 푸는 방식도 존재했었음.