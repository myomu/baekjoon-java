package backtracking;

import java.io.*;

/**
 * 15652번
 * N과 M (4)
 */
public class BackTracking4 {

    private static StringBuilder sb;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        sb = new StringBuilder();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        picker(0, N, M);
        bw.flush();
        bw.close();
    }

    private static void picker(int beforeNum, int n, int m) throws IOException {
        if (m == 0) {
            bw.write(sb.toString().trim());
            bw.newLine();
            return;
        }

        if (m > 0) {
            for (int i = beforeNum == 0 ? 1 : beforeNum; i <= n; i++) {
                    sb.append(i).append(" ");
                    picker(i, n, m - 1);
                    sb.delete(sb.length() - 2, sb.length());
            }
        }
    }
}

// 이전 스택에서는 값보다 같거나 커야 함으로 beforeNum 을 매개변수로 추가해 주고 int i = beforeNum 부터 시작하게 만들어주었다.