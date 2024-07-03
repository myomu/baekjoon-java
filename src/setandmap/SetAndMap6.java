package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 1764번
 * 듣보잡
 */
public class SetAndMap6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 1);
        }

        for (int j = 0; j < m; j++) {
            String s = br.readLine();
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                map.replace(s, map.get(s) + 1);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for (String key : keySet) {
            if (map.get(key) == 2) {
                sb.append(key).append("\n");
                cnt++;
            }
        }

        System.out.println(cnt);
        System.out.print(sb);
    }
}

