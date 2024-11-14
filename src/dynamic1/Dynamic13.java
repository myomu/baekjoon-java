package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 11054번
 * 가장 긴 바이토닉 부분 수열
 */
public class Dynamic13 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] reverseArr = new int[N];
        for (int i = 0; i < N; i++) {
            reverseArr[i] = arr[(N - 1) - i];
        }

        int[] increase = new int[N];
        int[] decrease = new int[N];
        int[] bitonic = new int[N];

        increase[0] = 1;
        decrease[0] = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    increase[i] = Math.max(increase[i], increase[j]);
                }
                if (reverseArr[i] > reverseArr[j]) {
                    decrease[i] = Math.max(decrease[i], decrease[j]);
                }
            }
            increase[i]++;
            decrease[i]++;
        }
        //System.out.println(Arrays.toString(increase));
        //System.out.println(Arrays.toString(decrease));

        for (int i = 0; i < N; i++) {
            bitonic[i] = increase[i] + decrease[(N - 1) - i] - 1;
        }
        //System.out.println(Arrays.toString(bitonic));

        int result = 0;
        for (int value : bitonic) {
            if (value > result) {
                result = value;
            }
        }
        System.out.print(result);
    }

}

// 이전에 풀었던 가장 긴 증가하는 부분 수열 문제에 더해서 감소하는 부분 수열과 증감이 있는 부분 수열이 추가 되었다.
// 추가된 부분 수열을 포함해서 바이토닉 수열이라고 한다.
// 바이토닉 수열은 증가하다가 어느 위치에서부터 감소할 수도 있는 특징을 가지고 있다.
// 증가하는 dp 배열은 12번 문제와 같이 구현하면 될 것이다.
// 특정 부분까지는 증가를 하고 나머지는 감소하면 된다.
// 주어지는 수를 reverse 한 배열을 만들고 이 배열을 가지고 증가하는 dp 를 만들게 된다면 기존의 주어진 배열의 끝에서 시작해 거꾸로 진행된다.
// 이것을 활용하면 어느 특정 부분까지 증가하고 나머지는 이 reverse 한 dp 를 가지고 구하면 나머지 감소한 부분을 구할 수 있다.
// 특정 부분을 기점으로 왼쪽에서 증가해서 올라오는 것과 오른쪽에서 올라오는 것을 생각하면 쉬울 것이다.
// decrease 의 경우 reverse 된 arr 을 기준으로 계산했다. 예를들어, 2번째 수인 '2' 를 기준으로 한다면 increase는 i = 2 가 되지만 decrease는 i = 7 이 된다.
// 그러므로 increase[i] + decrease[(N - 1) - i] 로 계산한다.
// 추가적으로 특정 부분의 수를 포함하여 dp 를 계산하므로 increase 와 decrease 가 중복됨으로 increase 와 decrease 를 더한 값에 -1 을 계산해준다.
// 결과적으로 bitonic[i] = increase[i] + decrease[(N - 1) - i] - 1; 가 된다.
// 이 bitonic 배열 중 가장 큰 값이 결과값이 된다.

// 다른 사람 풀이를 보면 굳이 reverseArr 를 생성하지 않고 기존 arr 을 i = N - 1 로 초기화 해서 거꾸로 올라와서 비교하는 방법도 있었다.

