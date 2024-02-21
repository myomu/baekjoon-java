package 조건문;

import java.io.*;

/**
 * 2753번
 * 윤년
 */
public class Cond3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            bw.write(1 + "");
        } else {
            bw.write(0 + "");
        }
        bw.close();

    }
}
