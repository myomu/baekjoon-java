package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2501번
 * 약수 구하기
 */
public class DMPN2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0 && !list.contains(n / i)) {
                list.add(i);
                list.add(n / i);
            }
        }

        list = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(list);

        if (list.size() < k) {
            System.out.print(0);
        } else {
            System.out.print(list.get(k - 1));
        }
    }
}
