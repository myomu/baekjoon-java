package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 10813번
 * 공 바꾸기
 */
public class Array6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int i = 1; i <= n; i++) {
            basket[i-1] = i;
        }

        for (int i = 1; i <= m; i++) {
            String[] strInput = br.readLine().split(" ");
            int[] intInput = Arrays.stream(strInput).mapToInt(Integer::parseInt).toArray();
            int index1 = intInput[0] - 1;
            int index2 = intInput[1] - 1;
            int temp = basket[index1];

            basket[index1] = basket[index2];
            basket[index2] = temp;
        }

        String[] strBasket = Arrays.stream(basket).mapToObj(String::valueOf).toArray(String[]::new);
        String result = String.join(" ", strBasket);

        System.out.println(result);
    }
}
