package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2485번
 * 가로수
 */
public class DMPN4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = 0;
        int[] arr = new int[n-1];

        // 가로수 사이의 거리를 배열에 담음
        for (int i = 0; i < n; i++) {
            int lo = Integer.parseInt(br.readLine());
            if (i != 0) {
                arr[i-1] = lo - temp;
            }
            temp = lo;
        }

        // 가로수 사이 거리들의 최대공약수를 구함
        int gcd = arr[0];
        for (int i = 1; i < n - 1; i++) {
            gcd = findGCD(gcd, arr[i]);
        }

        // 가로수 사이의 거리를 최대공약수를 나누어 몇개를 심어야하는지 구함
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count += arr[i] / gcd - 1;
        }

        System.out.print(count);
    }

    // 최대공약수(GCD) 찾는 유클리드 호제법 방식
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}

// 가로수의 간격은 일정해야하고 이 사이에 심을 가로수 수가 최소가 되려면 간격 사이의 값이 일정하면서도 최대가 되어야 한다.
// 그러므로 이 간격의 길이들의 최대공약수를 구하면 이 사이에 심을 가로수의 수를 구할 수 있을 것이다.