package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 14215번
 * 세 막대
 */
public class Geometry8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int maxValue = arr[0] + arr[1] - 1;
        int line = Math.min(maxValue, arr[2]);
        int circ = arr[0] + arr[1] + line;
        System.out.print(circ);

    }
}

// 삼각형의 조건으로 작은 두 변의 길이의 합이 긴 변의 길이보다 커야 한다는 조건이 있다.
// 이를 생각했을 때 두 변의 길이의 합보다 작지만 가장 큰 값을 구해야한다.
// 단, 이 값은 긴 변의 길이를 넘지 않는 값이어야 한다.

// ( 다른 사람 해설 참고 ) 삼각형의 기준에 맞지 않을 때만 가장 큰 값(maxValue)을 구해서 가장 긴 변(arr[2])에 넣어주기만 해도 문제가 풀린다.