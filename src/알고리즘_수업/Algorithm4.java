package 알고리즘_수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24265번
 * 알고리즘 수업 - 알고리즘의 수행 시간 4
 */
public class Algorithm4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.print(2);

    }
}
