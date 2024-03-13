package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 1157번
 * 단어 공부
 */
public class Deepen5 {

    // 아래 방식은 86772KB, 492ms 의 효율을 내었다. 그러나 더 효율 좋은 방법이 있을듯.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().toUpperCase().split("");
        int[] arr = new int[26];

        for (String s : input) {
            arr[(int)s.charAt(0)-65] += 1;
        }

        // char 로 변환하는 부분 등 을 최종 출력에만 반영하려고 해봤으나 성능상 크게 차이는 없었음.
        int maxValue = 0;
        int maxIndex = 0;
        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
                duplicate = false;
            } else if (arr[i] == maxValue) {
                duplicate = true;
            }
        }

        if (duplicate) {
            System.out.print("?");
        } else {
            System.out.print((char) (maxIndex + 65));
        }
        //

//        int maxValue = 0;
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//                result = String.valueOf((char) (i+65));
//            } else if (arr[i] == maxValue) {
//                result = "?";
//            }
//        }
//        System.out.print(result);


//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        if (Collections.frequency(list, maxValue) > 1) {
//            System.out.print("?");
//        } else {
//            System.out.print((char) (list.indexOf(maxValue)+65));
//        }
    }

    // 아래 방식을 사용했을 때 112624KB 의 메모리를 사용했고 속도는 2080ms 가 나왔다. 너무 느리고 비효율적이라 다른 방법을 찾게 됨.
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Map<String, Integer> map = new HashMap<>();
//        String[] input = br.readLine().toUpperCase().split("");
//        Arrays.sort(input);
//
//        for (String s : input) {
//            if (!map.containsKey(s)) {
//                map.put(s, 1);
//            } else {
//                map.put(s, map.get(s) + 1);
//            }
//        }
//
//        int maxValue = 0;
//        String result = "";
//        for (String s : map.keySet()) {
//            if (maxValue < map.get(s)) {
//                maxValue = map.get(s);
//                result = s;
//            } else if (maxValue == map.get(s)) {
//                result = "?";
//            }
//        }
//
//        System.out.print(result);
//    }
}
