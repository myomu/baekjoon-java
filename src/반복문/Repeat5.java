package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 25314번
 * 코딩은 체육과목 입니다
 */
public class Repeat5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()) / 4; // 4로 나누는 조건을 빼서 출력 초과 에러 발생함.

        for (int i = 0; i < n; i++) {
            sb.append("long ");
        }
        sb.append("int");
        String result = sb.toString();
        System.out.print(result);//출력 초과 에러 발생.

    }
}
