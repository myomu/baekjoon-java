package setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 1620번
 * 나는야 포켓몬 마스터 이다솜
 */
public class SetAndMap4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String, String> findName = new HashMap<>();
        Map<String, String> findNum = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String idx = String.valueOf(i + 1);
            String name = br.readLine();
            findName.put(idx, name);
            findNum.put(name, idx);
        }

        for (int j = 0; j < m; j++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                result.append(findName.get(s)).append("\n");
            } else {
                result.append(findNum.get(s)).append("\n");
            }
        }

        System.out.print(result);
    }
}

// 굳이 Map 을 두개를 만들 필요 없이 하나의 Map 에 (idx, name), (name, idx) 를 저장하면 하나의 Map 으로도 충분히 찾을 수 있다.
// 그렇게 되면 굳이 Character.isDigit 로 조건을 검사할 필요도 없다.
