package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 1008번
 * A/B
 */
public class InOut5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double div = (double) a / b;

        bw.write(div + "");
        bw.close();
    }
}
