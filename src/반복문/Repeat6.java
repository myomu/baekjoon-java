package 반복문;

import java.io.*;

/**
 * 15552
 * 빠른 A+B
 */
public class Repeat6 { //StringBuilder 로 출력물을 모아서 한번만 출력하는 식으로 한다면 Scanner 와 System.out.print()를 사용해도 통과한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            result[i] = a + b;
        }

        for (int sum : result) {
            bw.write(sum + "\n");
        }
        bw.close();
    }
}
