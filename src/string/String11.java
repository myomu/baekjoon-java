package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 11718번
 * 그대로 출력하기
 */
public class String11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //EOF(End Of File) 방식으로 접근
        String input = "";
        while((input = br.readLine()) != null && !input.isEmpty()) {
            sb.append(input).append("\n");
        }
        sb.delete(sb.length()-1, sb.length()); //마지막 줄바꿈 삭제
        System.out.print(sb);
    }
}

