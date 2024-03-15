package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1316번
 * 그룹 단어 체커
 */
public class Deepen7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            String[] word = br.readLine().split("");
            result += wordChecker(word);
        }
        System.out.print(result);
    }

    private static int wordChecker(String[] word) {
        List<String> list = new ArrayList<>();
        list.add(word[0]);
        for (int j = 1; j < word.length; j++) {
            if (!list.contains(word[j])) {
                list.add(word[j]);
            } else if (!word[j].equals(word[j-1])) {
                return 0;
            }
        }
        return 1;
    }
}
