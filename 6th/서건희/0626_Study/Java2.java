import java.util.*;

public class Java2 {

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 0;
        int cnt = 0;
        for (int value : arr) {
            if(arr[count]>9){
            }
            else if (count == 0) {
                answer[count] = value;
                count++;
                cnt++;
            } else if (answer[count - 1] != value) {
                answer[count] = value;
                count++;
                cnt++;
            }
        }
        return Arrays.copyOf(answer, cnt);
    }


    public static void main(String[] args) {

        int[] a = {};
        a = new int[]{1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(solution(a)));
    }
}
