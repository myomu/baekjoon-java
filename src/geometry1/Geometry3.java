package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 3009번
 * 네 번째 점
 */
public class Geometry3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();

        for (int i = 0; i < 1001; i++) {
            width.add(0);
            height.add(0);
        }

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            width.set(x, width.get(x) + 1);
            height.set(y, height.get(y) + 1);
        }

        int findWidth = width.indexOf(1);
        int findHeight = height.indexOf(1);

        System.out.print(findWidth + " " + findHeight);
    }
}
