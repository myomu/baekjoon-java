package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 11478번
 * 서로 다른 부분 문자열의 개수
 */
public class SetAndMap8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 1; i < s.length() + 1; i++) {

            for (int j = 0; j < s.length(); j++) {
                if (i + j > s.length()) {
                    break;
                }
                String str = s.substring(j, i + j);
                set.add(str);
            }
        }
        System.out.print(set.size());
    }
}

/* 더 간단한 버전
for (int i = 0; i < str.length(); i++) {
    for (int j = i + 1; j <= str.length(); j++) {
    set.add(str.substring(i, j));
    }
}*/
