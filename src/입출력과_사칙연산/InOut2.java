package 입출력과_사칙연산;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1000번
 * A + B
 */
public class InOut2 {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a + b);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = a + b;
        bw.write(sum + "");
        bw.close();

    }
}
