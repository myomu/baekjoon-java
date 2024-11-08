package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1932번
 * 정수 삼각형
 */
public class Dynamic7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[]> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(arr);
        }

        //System.out.println(Arrays.deepToString(list.toArray()));
        List<int[]> dp = new ArrayList<>();
        dp.add(list.get(0));

        for (int i = 1; i < N; i++) { // list 의 index - i
            int size = i + 1;
            int[] bucket = new int[size];
            for (int j = 0; j < size; j++) { // list 안의 배열의 index - j
                if (j == 0) {
                    bucket[j] = list.get(i)[j] + dp.get(i - 1)[0]; // 가장 왼쪽 수
                } else if (j == size - 1) {
                    bucket[j] = list.get(i)[j] + dp.get(i - 1)[j - 1]; // 가장 오른쪽 수
                } else {
                    bucket[j] = list.get(i)[j] + Math.max(dp.get(i - 1)[j - 1], dp.get(i - 1)[j]); // 나머지 중간의 수들
                }
            }
            dp.add(bucket);
        }

        //System.out.println(Arrays.deepToString(dp.toArray()));
        int maxValue = Integer.MIN_VALUE;
        int[] lastDp = dp.get(dp.size() - 1);
        for (int value : lastDp) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        System.out.print(maxValue);
    }

}

// 나의 경우 삼각형의 위에서 부터 아래고 차근차근 더해가는 경로의 방식을 취하고 있다.
// 그러나 다른 사람들의 풀이에는 맨 아래줄만 채우고 재귀 형태로 거꾸로 더해오는 방식을 사용하는 경우도 있었다.