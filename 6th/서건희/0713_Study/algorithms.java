import java.util.Arrays;
import java.util.Scanner;

public class algorithms{

    public static long[] solution(long x, int n){
        long[] answer = new long[n];

        for(int i = 0; i<answer.length; i++){
            answer[i]=x+x*i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n;
        x = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println(Arrays.toString(solution(x, n)));
    }
}
