package 입출력과_사칙연산;

import java.io.*;

/**
 * 10926번
 * ??!
 */
public class InOut7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine() + "??!";
        bw.write(str);
        bw.close();
    }
}
