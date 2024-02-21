package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2588번
 * 곱셈
 */
public class InOut10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int baseNum = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = baseNum * Integer.parseInt(arr[i]);
            bw.write(num + "\n");

            sum += (int) (num * Math.pow(10, arr.length - i - 1));
        }
        bw.write(sum + "");
        bw.close();
    }

}
