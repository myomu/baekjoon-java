package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2292번
 * 벌집
 */
public class Math5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1, 2~7(6), 8~19(12), 20~37(18)
        int n = Integer.parseInt(br.readLine());
        int base = 2;
        int result = 1;
        while (n >= base) {
            base += 6 * result;
            result++;
        }
        System.out.print(result);
    }
}
