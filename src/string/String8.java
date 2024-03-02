package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1152번
 * 단어의 개수
 */
public class String8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().trim().split(" ");
        if (arr[0].isEmpty()) {
            System.out.print(0);
            return;
        }
        System.out.print(arr.length);
    }
}

/*StringTokenizer 를 사용하여 토큰의 개수를 세는 방식도 있음.*/
