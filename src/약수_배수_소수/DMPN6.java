package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 11653번
 * 소인수분해
 */
public class DMPN6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}
