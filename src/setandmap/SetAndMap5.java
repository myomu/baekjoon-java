package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1620번
 * 나는야 포켓몬 마스터 이다솜
 */
public class SetAndMap5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map <Integer, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arrN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arrN[i])) {
                map.replace(arrN[i], map.get(arrN[i]) + 1);
            } else {
                map.put(arrN[i], 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : arrM) {
            result.append(map.getOrDefault(i, 0)).append(" ");
        }

        System.out.println(result);
    }
}

