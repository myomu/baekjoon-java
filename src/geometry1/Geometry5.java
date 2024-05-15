package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 9063번
 * 대지
 */
public class Geometry5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxWidth = -10001;
        int maxHeight = -10001;
        int minWidth = 10001;
        int minHeight = 10001;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            if (width > maxWidth) {
                maxWidth = width;
            }
            if (height > maxHeight) {
                maxHeight = height;
            }
            if (width < minWidth) {
                minWidth = width;
            }
            if (height < minHeight) {
                minHeight = height;
            }
        }

        int area = (maxWidth - minWidth) * (maxHeight - minHeight);
        System.out.print(area);
    }
}
