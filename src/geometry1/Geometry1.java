package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 27323번
 * 직사각형
 */
public class Geometry1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int width = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());

        System.out.print(width * height);
    }
}
