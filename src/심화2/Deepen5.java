package 심화2;

import java.io.*;
import java.util.*;


/**
 * 20920번
 * 영단어 암기는 괴로워
 */
public class Deepen5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) {
                continue;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> {
            if (!map.get(o1).equals(map.get(o2))) {
                return map.get(o2) - map.get(o1);
            } else if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            } else {
                return o1.compareTo(o2);
            }
        });

        for (String string : keySet) {
            bw.write(string + "\n");
        }
        bw.flush();
        bw.close();
    }
}

// 1. map 에 든 값(즉, 자주 등장한 빈도 순)이 큰 것을 먼저 넣고
// 2. 둘 중 길이가 긴 것을 먼저 넣고
// 3. 마지막으로 사전순으로 정렬한다.