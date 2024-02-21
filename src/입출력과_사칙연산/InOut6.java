package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 10869번
 * 사칙연산
 */
public class InOut6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int remain = a % b;

        bw.write(add + "\n");
        bw.write(sub + "\n");
        bw.write(multi + "\n");
        bw.write(div + "\n");
        bw.write(remain + "");
        bw.close();
    }
}
