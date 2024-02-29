package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10809번
 * 알파벳 찾기
 */
public class String6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int baseNum = 97;
        for (int i = baseNum; i < 123; i++) {
            System.out.print(s.indexOf((char)i) + " ");
        }
    }
}
