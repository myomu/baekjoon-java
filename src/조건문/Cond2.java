package 조건문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 9498번
 * 시험 성적
 */
public class Cond2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        if (90 <= score && score <= 100) {
            bw.write("A");
        } else if (score >= 80) {
            bw.write("B");
        } else if (score >= 70) {
            bw.write("C");
        } else if (score >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        bw.close();

    }
}
