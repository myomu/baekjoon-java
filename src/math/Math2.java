package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 11005번
 * 진법 변환 2
 */
public class Math2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            //int 형을 char 형으로 cast 할 때 문제가 발생. +'0' 을 추가하면 int 값 + 48 이 되어 0-9 사이의 숫자를 표현할 수 있다.
            //10진수 -> 2진수 변환 방법을 이용. 주어진 진수로 계속 나눈 나머지 값을 역순으로 나열하면 해당 진수 값으로 변환 되는 원리.
            char a = ((n % b) < 10) ? (char)((n % b)+'0') : (char)((n % b) + 55);
            System.out.println("int a=" + (int)a + ", a=" + a);
            sb.append(a);
            n = n / b;
        }
        System.out.print(sb.reverse());
        //Integer.toString(변환할 값, 진수 값) -> 10진수의 값을 원하는 진수로 변환됨. 대신 문자는 소문자로 되어 toUpperCase()를 써주면 된다.
        //System.out.println(Integer.toString(n, b).toUpperCase());
    }
}
