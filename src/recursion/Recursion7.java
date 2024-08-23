package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 11729번
 * 하노이 탑 이동 순서
 */
public class Recursion7 {

    private static int count = 0;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        movePlate(1, 3, N);
        System.out.println(count);
        System.out.print(sb.toString());
    }

    private static void movePlate(int start, int end, int n) {
        if (n > 0) {
            count++;
            int other = 6 - (start + end);
            movePlate(start, other, n - 1); // n 보다 작은 판들을 다른 곳으로 이동.
            sb.append(start + " " + end).append("\n"); // 이것은 n 크기에 해당하는 판을 옮기는 작업. n 보다 작은 크기의 판은 이미 옮겨져야 하기 때문에 이 위치에서 출력함.
            movePlate(other, end, n - 1); // 다른 곳으로 옮겼던 판들을 다시 n 크기의 판 위에 쌓는 과정.
        }
    }

}

// 판의 시작 위치를 Start, 목표 위치를 End, 둘을 제외한 위치를 Other 이라고 한다.
// Other 의 위치는 (Start + End + Other) - (Start + End) 이다. 단, Start + End + Other = 6 을 항상 만족하므로 다음과 같은 식이 된다.
// Other = 6 - (Start + End)

// 하노이 판을 옮기는 규칙성을 보면 N 개의 판을 3번 위치로 이동시키는데 항상 N-1 개의 판이 2번 위치에 옮겨지는 현상을 볼 수 있다.
// 위 규칙을 이용하여 1. N 개를 End 로 옮기려면 N-1 개를 Start 에서 Other 로 옮긴다.
// 2. 그리고 다시 N-1개를 Other 에서 End 위치로 옮긴다.
// 위 원리를 이용해 재귀적 방식으로 풀면 될듯하다.
