package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4948번
 * 베르트랑 공준
 */
public class DMPN7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int cnt = findPrimeNumber(n);
            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }

    // 소수인 것은 0 으로 표시하고 1이면 소수가 아닌것으로 표시
    private static int findPrimeNumber(int n) {
        int count = 0;
        int[] arr = new int[2 * n + 1]; // 굳이 매번 배열을 생성할 필요는 없다.
        arr[0] = arr[1] = 1;

        for (int i = 2; i <= Math.sqrt(2 * n); i++) {
           if (arr[i] == 0) {
               for (int j = i * i; j <= 2 * n; j += i) {
                   arr[j] = 1;
               }
           }
        }

        for (int i = n + 1; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }

        return count;
    }
}

// findPrimeNumber 에서 array 를 매번 생성함으로 메모리 사용량이 높아진다.
// 다른 사람의 풀이를 보면 입력으로 주어지는 값의 범위를 보고 '에라스토테네스의 체' 로 범위 안의 값들을 미리 계산해 놓는다.
// 이러면 입력으로 들어오는 값에 대해 일일이 계산하지 않고 바로 소수의 개수를 판별하여 보여줄 수 있다.