package 입출력과_사칙연산;

import java.io.*;

/**
 * 18108번
 * 1998년생인 내가 태국에서는 2541년생?!
 */
public class InOut8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());
        int changeYear = year - 543;
        bw.write(changeYear + "");
        bw.close();
    }
}
