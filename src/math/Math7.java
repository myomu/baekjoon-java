package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2869번
 * 달팽이는 올라가고 싶다
 */
public class Math7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        int day = (v - a) / (a - b) + 1;
        if ((v - a) % (a - b) > 0) {
            day += 1;
        }

        System.out.print(day);
    }
}

// 처음 while 반복문 사용 시 시간 초과가 나온다. 조건에 10억이라는 범위 때문에 반복을 많이 돌리면 그런듯.
