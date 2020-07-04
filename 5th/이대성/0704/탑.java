package 프로그래머스;

import java.util.Arrays;

public class 탑 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3,9,9,3,5,7,2})));
    }

        public static int[] solution(int[] heights) {
            int[] answer = new int[heights.length];

            for (int i = answer.length - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (heights[j] > heights[i]) {
                        answer[i] = j+1;
                        break;
                    }
                }
            }

            return answer;
        }
}
