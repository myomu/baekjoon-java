package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 25206번
 * 너의 평점은
 */
public class Deepen8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> grade = new ArrayList<>(Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "DummyData", "F"));
        double sum = 0.0;
        double credit = 0.0;
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] arr = input.split(" ");
            if (arr[2].equals("P")) {
                continue;
            }
            credit  += Double.parseDouble(arr[1]);
            sum += Double.parseDouble(arr[1]) * (4.5 - (0.5 * grade.indexOf(arr[2])));
        }
        double avg = sum / credit;
        System.out.print(avg);
    }
}
