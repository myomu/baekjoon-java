package 반복문;

import java.io.*;

/**
 * 10952번
 * A+B - 5
 */
public class Repeat11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int sum = a + b;

            if (a == 0 && b == 0) {
                break;
            } else {
                bw.write(sum + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
