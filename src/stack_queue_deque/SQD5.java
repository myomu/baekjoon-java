package stack_queue_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 12789번
 * 도키도키 간식드리미
 */
public class SQD5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" "); // 주어지는 변호표 배열
        List<Integer> resultList = new ArrayList<>(); // 결과적으로 만들어지는 List <- 나중에 순서가 맞는지 검증이 필요
        Stack<Integer> stack = new Stack<>(); // 임시로 담는 통로
        boolean result = true; // 결과 판단하는 값

        int number = 1; // 찾는 기준이 되는 번호표 숫자
        int idx = 0; // 주어지는 입력 배열의 번호표를 찾는 index
        while (idx < n) {
            if (Integer.parseInt(input[idx]) == number) { // 입력된 수에서 찾고있는 번호표와 일치할 때
                resultList.add(Integer.parseInt(input[idx]));
                number++;
                idx++;
            } else if (!stack.isEmpty() && stack.peek() == number) { // 임시로 담은 통의 가장 최근에 담긴 수에서 찾는 번호표의 수와 일치할 때
                resultList.add(stack.pop());
                number++;
            } else { // 찾고 있는 번호표가 아니면 임시 통로로 이동
                stack.push(Integer.parseInt(input[idx]));
                idx++;
            }
        }

        // 만약 Stack (임시 통로) 에 값이 남아 있다면 이걸 전부 result 에 부어줌
        //for (int j = stack.size() - 1; j > -1; j--) {
            //resultList.add(stack.pop()); // stack.pop() 을 해버리면 stack.size() 가 처음에 3으로 시작해도 pop() 으로 요소를 제거하기 때문에 범위가 계속 들어들어 3번을 반복하지 못하는 오류가 생긴다.
            //resultList.add(stack.get(j));
        //}

        // 위 코드를 while 로 표현한다면?
        while (!stack.isEmpty()) {
            resultList.add(stack.pop());
        }

        // result 가 순서대로 되었는지 검증이 필요
        for (int k = 1; k <= n; k++) {
            if (resultList.get(k - 1) != k) {
                result = false;
                break;
            }
        }

        System.out.print(result ? "Nice" : "Sad");
    }
}
