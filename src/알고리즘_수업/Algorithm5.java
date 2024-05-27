package 알고리즘_수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 24266번
 * 알고리즘 수업 - 알고리즘의 수행 시간 5
 */
public class Algorithm5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());

        System.out.println(n * n * n);
        System.out.print(3);

    }
}
