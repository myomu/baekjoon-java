package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 14425번
 * 문자열 집합
 */
public class SetAndMap2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int result = 0;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), i);
        }

        for (int i = 0; i < m; i++) {
            if (map.containsKey(br.readLine())) {
                result++;
            }
        }

        System.out.println(result);
    }
}

