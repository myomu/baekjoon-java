package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2720번
 * 세탁소 사장 동혁
 */
public class Math3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] changes = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cent = Integer.parseInt(br.readLine());
            for (int change : changes) {
                int cal = cent / change;
                sb.append(cal).append(" ");
                cent %= change;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
