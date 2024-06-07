package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 1018번
 * 체스판 다시 칠하기
 */
public class BruteForce5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        int i = 0;
        while (cnt <= 10000) {
            String s = String.valueOf(i);
            if (s.contains("666")) {
                list.add(i);
                cnt++;
            }
            i++;
        }
        System.out.print(list.get(n-1));
    }
}

// while 반복을 cnt <= 10000 으로 하지 않고 입력받는 n 의 수에 따라 반복을 바꿔주면 수행 시간이 더 줄어들 것 같다.
// while(cnt < n) 이렇게 변경하면 좋을 듯.
