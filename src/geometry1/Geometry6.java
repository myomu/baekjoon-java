package geometry1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 10101번
 * 삼각형 외우기
 */
public class Geometry6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            list.add(angle);
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        list.sort(Comparator.naturalOrder());

        if (sum == 180) {
            if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))) {
                System.out.print("Equilateral");
            } else if (list.get(0).equals(list.get(1)) || list.get(1).equals(list.get(2))) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
}
