package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 13241번
 * 최소공배수
 */
public class DMPN3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        int a1 = Integer.parseInt(inputA[0]);
        int a2 = Integer.parseInt(inputA[1]);
        int b1 = Integer.parseInt(inputB[0]);
        int b2 = Integer.parseInt(inputB[1]);

        int numerator = a1 * b2 + a2 * b1;
        int denominator = a2 * b2;

        int gcd = findGCD(numerator, denominator);
        //int lcm = numerator * denominator / gcd;

        numerator /= gcd;
        denominator /= gcd;

        System.out.print(numerator + " " + denominator);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}