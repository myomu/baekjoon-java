package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


/**
 * 26069번
 * 붙임성 좋은 총총이
 */
public class Deepen3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 1;

        set.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if (set.contains(input[0]) && !set.contains(input[1])) {
                set.add(input[1]);
                count++;
            } else if (set.contains(input[1]) && !set.contains(input[0])) {
                set.add(input[0]);
                count++;
            }
        }

        System.out.print(count);
    }
}

// Set 에 처음으로 ChongChong 을 넣고 입력으로 들어오는 값 중 set 에 들어 있는 값이 있으면 들어있지 않는 값도 set에 넣어준다.
// Set 의 경우 중복을 허용하지 않으므로 input[0] || input[1] 의 값 중 하나라도 set 에 들어있으면 둘 다 add 로 추가해버리면 된다.
// 굳이 위와 같이 두 가지 상황을 분리하지 않아도 된다.