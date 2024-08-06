package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1037번
 * 약수
 */
public class Deepen1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        list.sort(Integer::compareTo);

        if (T % 2 == 0) {
            int result = list.get(0) * list.get(list.size() - 1);
            System.out.print(result);
        } else {
            int result = (int) Math.pow(list.get((T - 1) / 2), 2);
            System.out.print(result);
        }
    }
}

// 굳이 List 를 사용하지 않아도 배열 선에서 Arrays.sort(arr) 을 사용하여 정렬할 수 있다.
// 그리고 정렬된 값의 가장 앞과 가장 뒤 값을 곱하면 결과가 나오므로 T 가 짝수 일때와 홀수 일때를 구분할 필요가 없다.
// 에로 arr[0] * arr[arr.length - 1] 이렇게 하면 된다.