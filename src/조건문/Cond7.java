package 조건문;

import java.io.*;
import java.util.Arrays;

/**
 * 2480번
 * 주사위 세개
 */
public class Cond7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr);

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int prize;

        if (a == b && b == c) {
            prize = 10000 + a * 1000;
            bw.write(prize + "");
        } else if (a != b && b != c) {
            prize = c * 100;
            bw.write(prize + "");
        } else if (a == b) {
            prize = 1000 + a * 100;
            bw.write(prize + "");
        } else if (b == c) {
            prize = 1000 + b * 100;
            bw.write(prize + "");
        }

        bw.close();

    }
}
