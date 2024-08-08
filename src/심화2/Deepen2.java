package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


/**
 * 25192번
 * 인사성 밝은 곰곰이
 */
public class Deepen2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                set.clear();
                continue;
            }
            if (!set.contains(input)) {
                set.add(input);
                count++;
            }
        }

        System.out.print(count);
    }
}

// 채팅방에 사람이 들어오면 인사를 하는데 이때 처음 메시지는 곰곰티콘이므로 Set 에 있는지 없는지 검사하여 닉네임을 추가하면 될 것 같다.
// 다시 새로운 사람이 들어오면 Set 을 초기화 한다.

// 그런데 Set 은 Map 보다 찾는 속도가 느려서 성능상 더 떨어지지 않을까? 생각이된다.
// 찾아보니 HashSet 의 경우 contains 의 동작 방식이 내부적으로 HashMap 을 통해 구현을 하기 때문에 시간 복잡도는 O(1) 이라고 한다.
// 그리고 'HashSet 과 HashMap 의 성능차는 없다' 고 한다.