package 조건문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2884번
 * 알람 시계
 */
public class Cond5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken()) - 45;

        if (minute < 0) {
            hour -= 1;
            minute += 60;
        }
        if (hour < 0) {
            hour += 24;
        }

        bw.write(hour + " " + minute);
        bw.close();

    }
}
