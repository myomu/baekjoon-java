package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5622번
 * 다이얼
 */
public class String10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[] {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] input = br.readLine().split("");
        int time = 0;
        for (int i = 0; i < str.length; i ++) {
            for (String alphabet : input) {
                if (str[i].contains(alphabet)) {
                    time += i + 3;
                }
            }
        }
        System.out.print(time);
    }
}

