package backtracking;

import java.io.*;

/**
 * 15651번
 * N과 M (3)
 */
public class BackTracking3 {

    private static StringBuilder sb;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        sb = new StringBuilder();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        picker(N, M);
        bw.flush();
        bw.close();
    }

    private static void picker(int n, int m) throws IOException {
        if (m == 0) {
            bw.write(sb.toString().trim());
            bw.newLine();
            return;
        }

        if (m > 0) {
            for (int i = 1; i <= n; i++) {
                sb.append(i).append(" ");
                picker(n, m - 1);
                sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}

// 사용한 수를 중복으로 사용해도 됨으로 visited 를 제거해 주었다.
// m == 0 일때 static 배열에 저장해둔 값들을 for 문으로 순환하며 append 해주고 출력하는 방식도 있었다.