package dynamic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 9184번
 * 신나는 함수 실행
 */
public class Dynamic2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 21;
        int[][][] bucket = new int[size][size][size];

        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size; b++) {
                for (int c = 0; c < size; c++) {
                    if (a == 0 || b == 0 || c == 0) { // 이 부분이 있음으로 인해 a, b, c 전부가 1 이상이 되기 전의 조합들은 전부 1로 세팅되게 된다. 또 아래 조건에 걸려 outOfRange 가 발생하지 않도록 한다.
                      bucket[a][b][c] = 1;
                    } else if (a < b && b < c) {
                        bucket[a][b][c] = bucket[a][b][c-1] + bucket[a][b-1][c-1] - bucket[a][b-1][c];
                    } else {
                        bucket[a][b][c] = bucket[a-1][b][c] + bucket[a-1][b-1][c] + bucket[a-1][b][c-1] - bucket[a-1][b-1][c-1];
                    }
                }
            }
        }

        int[] input;
        while (true) {
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = input[0];
            int b = input[1];
            int c = input[2];
            int result;

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            if (a <= 0 || b <= 0 || c <= 0) {
                result = bucket[0][0][0];
            } else if (a > 20 || b > 20 || c > 20) {
                result = bucket[20][20][20];
            } else {
                result = bucket[a][b][c];
            }
            //System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, result);
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
        }
    }

}
