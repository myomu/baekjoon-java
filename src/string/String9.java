package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2908번
 * 상수
 */
public class String9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder(arr[0]);
        String s1 = sb.reverse().toString();
        String s2 = sb.delete(0, sb.length()).append(arr[1]).reverse().toString();

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        if (num1 > num2) {
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }
    }

    //깔끔한 풀이. new 연산자와 삼항 연산자 사용.
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//
//        System.out.print(num1 > num2 ? num1 : num2);
//    }
}

