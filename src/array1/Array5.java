package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 10810번
 * 공 넣기
 */
public class Array5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int i = 1; i <= m; i++) {
            String[] strInput = br.readLine().split(" ");
            int[] intInput = Arrays.stream(strInput).mapToInt(Integer::parseInt).toArray();
            int start = intInput[0] - 1; //array는 0번 부터 시작함으로
            int end = intInput[1] - 1;
            int num = intInput[2];

            for (int j = start; j <= end; j++) {
                basket[j] = num;
            }
        }

        String[] strBasket = Arrays.stream(basket).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(" ", strBasket);

        System.out.println(result);

    }
}
