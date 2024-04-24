package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9506번
 * 약수들의 합
 */
public class DMPN3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        while ((input = Integer.parseInt(br.readLine())) != -1) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(input).append(" = ");
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }
            sb.delete(sb.length()-3, sb.length());
            if (sum == input) {
                System.out.println(sb);
            } else {
                System.out.println(input + " is NOT perfect.");
            }
        }
    }
}
