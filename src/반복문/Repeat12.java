package 반복문;

import java.io.*;

/**
 * 10951번
 * A+B - 4 EOF(End of File) 문제
 */
public class Repeat12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] inputs = input.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int sum = a + b;

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
