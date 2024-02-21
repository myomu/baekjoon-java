package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 10998번
 * AxB
 */
public class InOut4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int multi = a * b;

        bw.write(multi + "");
        bw.close();
    }
}
