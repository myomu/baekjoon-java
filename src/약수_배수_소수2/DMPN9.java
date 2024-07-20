package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 13909번
 * 창문 닫기
 */
public class DMPN9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 이런 식으로 풀면 메모리 초과가 뜨게된다.
        //boolean[] arr = new boolean[n + 1];
        /*int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j] = !arr[j]; // if - else 문으로 하지 말고 항상 반대를 만들게 하는 방식으로 간단히 표현할 수 있다.
            }
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i]) {
                count++;
            }
        }*/

        //System.out.print(count);

        int result = (int) Math.floor(Math.sqrt(n));
        System.out.print(result);
    }
}

// 1 ~ 3 - 1 , 4 ~ 8 - 2, 9 ~ 15 - 3, 16 ~ 24 - 4, 25 ~ 35,...
// 위 수의 규칙을 살펴보면 제곱의 값의 범위(1, 4, 9, 16, 25, 36, ... )를 나타낸다고 볼 수 있다. 제곱근을 하여 그 수의 정수만을 취하면 값을 구할 수 있다.
// 왜 그렇게 되는지는 정확이 모르겠다.
// 이유 : N 번째 창문이 열려 있으려면 열고 닫는 횟수가 홀수여야 한다. false > true > false > true ('>' 이 세 번. 즉, 홀수)
// 그러므로 N 의 약수의 개수가 홀수이어야 하는데 이를 만족하는 것은 제곱수(약수 중 자기 자신을 곱하는 수. 보통 약수의 두 수가 짝을 이루어 곱해진다.)라고 한다.
// 결과적으로 주어진 N 값의 범위 내의 제곱수의 개수를 구하면 되는 문제이다.
// 제곱수는 4, 9, 16, 25, 36, 49, ... 이런식으로 존재한다.