package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 15894번
 * 수학은 체육과목 입니다
 */
public class Geometry4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 4L * n;

        System.out.print(result);
    }
}
