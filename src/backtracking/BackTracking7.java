package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 14888번
 * 연산자 끼워넣기
 */
public class BackTracking7 {

    private static int maxNum;
    private static int minNum;
    private static int N;
    private static int[] numbers;
    private static int[] operators;
    //private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        //sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        numbers = new int[N];
        String[] inputNumbers = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        operators = new int[4];
        String[] inputOperators = br.readLine().split(" ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(inputOperators[i]);
        }

        maxNum = -1_000_000_001;
        minNum = 1_000_000_001;
        //tempNum = numbers[0];
        dfs(numbers[0], 0);
        System.out.println(maxNum);
        System.out.println(minNum);
    }

    private static void dfs(int calNum, int depth) {
        if (depth == N - 1) {
            //System.out.println(sb.toString());
            //System.out.println(calNum);
            if (calNum > maxNum) {
                maxNum = calNum;
            }
            if (calNum < minNum) {
                minNum = calNum;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] != 0) {
                operators[i]--;
                int calResult = calculator(calNum, numbers[depth + 1], i);
                dfs(calResult, depth + 1);
                //sb.delete(sb.length() - 2, sb.length());
                operators[i]++;
            }
        }
    }

    private static int calculator(int leftNum, int rightNum, int operator) {
        if (operator == 0) {
            //System.out.print("+ ");
            //sb.append("+ ");
            leftNum += rightNum;
        } else if (operator == 1) {
            //System.out.print("- ");
            //sb.append("- ");
            leftNum -= rightNum;
        } else if (operator == 2) {
            //System.out.print("* ");
            //sb.append("* ");
            leftNum *= rightNum;
        } else if (operator == 3) {
            //System.out.print("/ ");
            //sb.append("/ ");
            leftNum /= rightNum;
        }
        return leftNum;
    }

}