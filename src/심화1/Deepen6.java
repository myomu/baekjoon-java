package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2941번
 * 크로아티아 알파벳
 */
public class Deepen6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String s : arr) {
            if (input.contains(s)) {
                input = input.replaceAll(s, "A");
            }
        }
        System.out.print(input.length());
    }
}
