import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 0, 3, 3, 1})));
    }

    public static int[] solution(int []arr) {
        int count = 0;
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) answer[count++] = arr[i];
            else if (answer[count-1] != arr[i]) answer[count++] = arr[i];
        }
        return Arrays.copyOf(answer, count);
    }
}
