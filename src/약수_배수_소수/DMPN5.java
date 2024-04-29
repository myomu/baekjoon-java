package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 2581번
 * 소수
 */
public class DMPN5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = m; i <= n; i ++) {
            if (isPrimeNumber(i)) {
                sum += i;
                list.add(i);
            }
            // m 값이 1 일 경우 1은 소수가 아니므로 거르는 작업이 필요.
            if (i == 1) {
                sum -= i;
                list.remove(0);
            }
        }

        if (list.isEmpty()) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.print(list.get(0));
        }
    }

    private static boolean isPrimeNumber(int num) {
        // 여기서 num 값이 1이면 false 를 반환하도록 하는게 더 좋았을 것 같음.
        // 또한 소수는 자신의 제곱근 값을 넘어서 나누어질 수 없으므로 계산을 i <= Math.sqrt(num) 으로 for 문을 덜 돌릴 수 있다.
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
