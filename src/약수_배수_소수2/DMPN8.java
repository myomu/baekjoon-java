package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4948번
 * 베르트랑 공준
 */
public class DMPN8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 소수를 미리 찾아서 저장해 둔다.
        boolean[] arr = new boolean[1000001];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = false;
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n / 2; j++) { // n 의 값의 절반 이상은 될 수 없다. 절반 + 절반 = 본인의 값 이 되어야 하기 때문이다.
                if (arr[j] && arr[n-j]){ // !!- arr[n-j] 가 소수인지 를 따지면 아래 for 문은 필요 없게 된다. -!!
//                    for (int k = j; k <= n; k++) { // k 가 j 부터 시작하는 이유는 문제에서 (1, 10) (10, 1) 이 같은 것이라고 정의하기 때문이다.
//                        if (arr[k] && (j + k == n)) {
//                            cnt++;
//                        }
//                    }
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.print(sb.toString());
    }
}