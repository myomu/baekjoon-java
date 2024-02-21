package 조건문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 2525번
 * 오븐 시계
 */
public class Cond6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int timer = Integer.parseInt(br.readLine());

        int time = hour * 60 + minute + timer;
        int resultHour = (time / 60) % 24;
        int resultMinute = time % 60;

        bw.write(resultHour + " " + resultMinute);
        bw.close();

    }
}
