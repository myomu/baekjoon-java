package 입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 11382번
 * 꼬마 정민
 */
public class InOut11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // !!입력 조건이 10^12 이므로 long 타입을 써줘야한다.
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        bw.write(a + b + c + "");
        bw.close();

    }
}
