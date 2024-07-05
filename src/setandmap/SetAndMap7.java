package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 1269번
 * 대칭 차집합
 */
public class SetAndMap7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int same = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            map.put(a, 0);
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int b = Integer.parseInt(st.nextToken());
            if (map.containsKey(b)) {
                same++;
            } else {
                map.put(b, 0);
            }
        }

        System.out.print(map.size() - same);
    }
}

